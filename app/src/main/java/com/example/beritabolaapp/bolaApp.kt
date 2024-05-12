package com.example.beritabolaapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.beritabolaapp.navigation.NavigationItem
import com.example.beritabolaapp.navigation.Screen
import com.example.beritabolaapp.presentation.screen.DetailClubScreen
import com.example.beritabolaapp.presentation.screen.DetailPlayerScreen
import com.example.beritabolaapp.presentation.screen.HomeScreen
import com.example.beritabolaapp.presentation.screen.ListClubScreen
import com.example.beritabolaapp.presentation.screen.ProfileScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun bolaApp (
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    val context = LocalContext.current

    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = "Berita Bola") },
                actions = {
                    IconButton(onClick = { }) {
                        Icon(imageVector = Icons.Default.Share, contentDescription = stringResource(
                            id = R.string.menu_profile
                            )
                        )
                    }
                }
            )
        },
        bottomBar = {
            BottomBar(navController)
        },
        modifier = modifier
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(navController)
            }
            composable(Screen.ListClub.route) {
                ListClubScreen(navController)
            }
            composable(Screen.Profile.route) {
                ProfileScreen()
            }

            composable(
                Screen.Detail.route + "/{playerId}",
                arguments = listOf(navArgument("playerId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailPlayerScreen(
                    navController = navController,
                    playersId = navBackStackEntry.arguments?.getInt("playerId")
                )
            }

            composable(
                Screen.DetailClub.route + "/{logoclubsId}",
                arguments = listOf(navArgument("logoclubsId") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailClubScreen(
                    navController = navController,
                    logoclubsId = navBackStackEntry.arguments?.getInt("logoclubsId")
                )
            }
        }
    }
}

@Composable
private fun BottomBar(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        val navigationItems = listOf(
            NavigationItem(
                title = stringResource(id = R.string.menu_home),
                icon = Icons.Default.Home,
                screen = Screen.Home
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_club),
                icon = Icons.Default.List,
                screen = Screen.ListClub
            ),
            NavigationItem(
                title = stringResource(id = R.string.menu_profile),
                icon = Icons.Default.Person,
                screen = Screen.Profile
            )
        )
        navigationItems.map { item ->
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(text = item.title) }
            )
        }
        }
    }