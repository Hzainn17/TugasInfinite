package com.example.beritabolaapp.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.beritabolaapp.data.DummyData
import com.example.beritabolaapp.model.LogoClub

@Composable
fun DetailClubScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    logoclubsId: Int?
){
    val newlogoclubList = DummyData.datalogoClub.filter { logoClub ->
        logoClub.id == logoclubsId
    }
    Column(
        modifier = modifier
    ) {
        DetailLogoClubContent(newlogoclubList = newlogoclubList)
    }
}

@Composable
private fun DetailLogoClubContent(
    newlogoclubList: List<LogoClub>,
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .fillMaxSize()
            .padding(25.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Image(
                painter = painterResource(id = newlogoclubList[0].logoClubImageId),
                contentDescription = newlogoclubList[0].name,
                modifier = Modifier
                    .fillMaxWidth()
                    .size(200.dp)
                    .clip(RoundedCornerShape(30.dp))
            )
        }
        Text(text = newlogoclubList[0].name, fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Text(text = newlogoclubList[0].description, fontSize = 18.sp)
    }
}