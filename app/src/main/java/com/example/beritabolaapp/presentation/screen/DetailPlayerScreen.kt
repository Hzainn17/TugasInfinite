package com.example.beritabolaapp.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.beritabolaapp.data.DummyData
import com.example.beritabolaapp.model.Player

@Composable
fun DetailPlayerScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    playersId: Int?
){
    val newPlayersList = DummyData.muPlayers.filter { player ->
        player.id == playersId
    }
    Column(
        modifier = modifier
    ) {
        DetailPlayerContent(newPlayersList = newPlayersList)
    }
}

@Composable
private fun DetailPlayerContent(
    newPlayersList: List<Player>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Image(painter = painterResource(id = newPlayersList[0].playerImageId),
                contentDescription = newPlayersList[0].name,
                modifier = Modifier.clip(RoundedCornerShape(16.dp))
            )
        }
        Text(text = newPlayersList[0].name, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(text = newPlayersList[0].description, fontSize = 18.sp)
    }
}