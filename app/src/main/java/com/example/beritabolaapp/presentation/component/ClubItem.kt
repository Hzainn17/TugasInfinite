package com.example.beritabolaapp.presentation.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.beritabolaapp.model.Club

@Composable
fun ClubItem (
    club: Club,
    modifier: Modifier = Modifier,
){
    Card (
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(50.dp)
            .aspectRatio(2.5f),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(10.dp)

    ) {
        Box(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxSize(), contentAlignment = Alignment.Center

        ){
            Text(text = club.name, style = MaterialTheme.typography.titleMedium)
        }
    }
}