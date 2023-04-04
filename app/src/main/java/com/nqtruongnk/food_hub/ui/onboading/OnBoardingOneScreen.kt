package com.nqtruongnk.food_hub.ui.onboading

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nqtruongnk.food_hub.R

@Composable
fun OnBoardingOneScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        HeaderOnBoarding()
        Text(text = "Browse your menu and order directly")
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderOnBoarding() {
    val configuration = LocalConfiguration.current

    val screenHeight = configuration.screenHeightDp.dp
    val screenWidth = configuration.screenWidthDp.dp
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(screenHeight / 2)
    ) {

        Canvas(
            modifier = Modifier
                .width(screenWidth / 2)
                .height(screenWidth / 2)
                .align(Alignment.Center)
        ) {
            drawCircle(
                color = Color(0xFF2DBC48),
                radius = (screenWidth / 2.8.toFloat()).toPx(),
                style = Stroke(width = 1.dp.toPx())
            )
            drawCircle(
                color = Color(0xFFE2E2E2),
                radius = (screenWidth / 4).toPx(),
            )
        }
        Image(
            painter = painterResource(id = R.drawable.bg_person_phone),
            contentDescription = "Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(screenWidth / 2)
                .height(270.dp)
                .offset(98.dp, 40.dp)
                .clip(
                    shape = RoundedCornerShape(
                        topStart = 0.dp,
                        topEnd = 0.dp,
                        bottomStart = screenWidth,
                        bottomEnd = screenWidth
                    )
                )
        )
        Box(
            modifier = Modifier
                .size(56.61.dp)
                .align(Alignment.Center)
                .background(Color.White)
                .clip(RoundedCornerShape(8.dp))
                .offset(90.dp, 90.dp)
                .shadow(
                    elevation = 1.dp
                )

        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_kfc),
                contentDescription = "Image",
                modifier = Modifier
                    .size(40.dp)
            )
        }

    }
}