package com.example.beritabolaapp.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.beritabolaapp.R

@Composable
fun  ProfileScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 20.dp)) {
        Image(
            modifier = Modifier
                .padding(8.dp)
                .size(150.dp)
                .align(Alignment.CenterHorizontally)
                .clip(CircleShape)
                .border(2.dp, Color.LightGray, CircleShape),
            painter = painterResource(id = R.drawable.profile),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(start = 30.dp, top = 20.dp)
                .fillMaxWidth()
                .align(Alignment.Start),
        ) {
            Text(text = "Nama", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Medium)
            Text(text = "Hilma Zain Al Maarif", style = MaterialTheme.typography.bodyLarge)
        }

        Column(
            modifier = Modifier
                .padding(start = 30.dp, top = 10.dp)
                .fillMaxWidth()
                .align(Alignment.Start),

            ) {
            Text(text = "Perguruan Tinggi", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Medium)
            Text(text = "Universitas Pendidikan Indonesia", style = MaterialTheme.typography.bodyLarge)
        }
        Column(
            modifier = Modifier
                .padding(start = 30.dp, top = 10.dp)
                .fillMaxWidth()
                .align(Alignment.Start),

            ) {
            Text(text = "Jurusan", style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.Medium)
            Text(text = "Pendidikan Ilmu Komputer", style = MaterialTheme.typography.bodyLarge)
        }
    }
}