package com.example.beritabolaapp.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.beritabolaapp.R
import com.example.beritabolaapp.data.DummyData
import com.example.beritabolaapp.navigation.Screen
import com.example.beritabolaapp.presentation.component.ClubItem
import com.example.beritabolaapp.presentation.component.PlayerItem

@Composable
fun HomeScreen (
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Column(modifier = Modifier.fillMaxSize()) {

        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .size(200.dp)
                .clip(RoundedCornerShape(10.dp)),
            painter = painterResource(id = R.drawable.bcr),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        val clubs = remember { DummyData.dataClub }
        LazyRow(
            contentPadding = PaddingValues(10.dp)
        ) {
            items(
                items = clubs,
                itemContent = {
                    ClubItem(club = it)
                }
            )
        }

        val players = remember { DummyData.muPlayers }
        LazyColumn(
            contentPadding = PaddingValues(5.dp)
        ) {
            items(
                items = players,
                itemContent = {
                    PlayerItem(player = it) {playerId->
                        navController.navigate(Screen.Detail.route +  "/$playerId")
                    }
                }
            )
        }
    }
}