package com.example.beritabolaapp.navigation

sealed class Screen (val route : String){
    data object Home : Screen("home")
    data object ListClub : Screen("listclub")
    data object Profile : Screen("profile")
    data object Detail : Screen("detail_players")
    data object DetailClub : Screen("detail_clubs")
}