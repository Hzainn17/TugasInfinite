package com.example.beritabolaapp.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.beritabolaapp.data.DummyData
import com.example.beritabolaapp.navigation.Screen
import com.example.beritabolaapp.presentation.component.LogoClubItem

@Composable
fun ListClubScreen (
    navController: NavController,
) {
    val logos = remember { DummyData.datalogoClub}
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxSize()
    ) {
        items(
            items= logos,
            itemContent = {
                LogoClubItem(logoClub = it) { logoclubsId ->
                    navController.navigate(Screen.DetailClub.route + "/$logoclubsId")
                }
            }
        )
    }
}