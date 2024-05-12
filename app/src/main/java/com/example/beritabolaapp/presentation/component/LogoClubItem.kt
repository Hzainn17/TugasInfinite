package com.example.beritabolaapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.beritabolaapp.model.LogoClub

@Composable
fun LogoClubItem (
    logoClub: LogoClub,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
){
    Column (
        modifier = Modifier
            .height(250.dp)
            .width(200.dp)
            .clickable { onItemClicked(logoClub.id) },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .size(200.dp)
                .clip(RoundedCornerShape(30.dp)),
            painter = painterResource(id = logoClub.logoClubImageId),
            contentDescription = logoClub.name,
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = logoClub.name,
            fontWeight = FontWeight.SemiBold
        )
    }
}