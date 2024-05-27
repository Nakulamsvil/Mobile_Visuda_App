package com.example.visuda.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.visuda.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Shapes
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import com.example.visuda.navigation.Routes


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BerandaPage(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.bgberanda),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(270.dp),
            alignment = Alignment.TopCenter
        )

        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
                .padding(bottom = 280.dp, start = 16.dp, end = 16.dp)
        ) {

            Card(
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = Modifier.padding(top = 30.dp)
            )

            {
                androidx.compose.foundation.layout.Column(
                    modifier = Modifier.padding(16.dp),
                ) {
                    Text(
                        text = "Nama : Nathan Tjoe A On",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center
                        ), modifier = Modifier.padding(4.dp)
                    )
                    Text(
                        text = "nathantjoeaon@gmail.com",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Start
                        ), modifier = Modifier.padding(4.dp)
                    )
                    Text(
                        text = "+62 8211 7788 9900",
                        style = TextStyle(
                            color = Color.Black,
                            fontSize = 12.sp,
                            textAlign = TextAlign.Start
                        ), modifier = Modifier.padding(4.dp)
                    )
                    Row(
                        modifier = Modifier
                    ) {
                        Text(
                            text = "Jl.Belanda kolonial,Kec Romusa RT 1 RW 22",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Start
                            ), modifier = Modifier.padding(end = 50.dp)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.bendera),
                            contentDescription = null,
                            modifier = Modifier
                                .size(40.dp)
                                .padding(bottom = 16.dp, end = 14.dp),
                            alignment = Alignment.CenterEnd
                        )
                    }
                    Divider(
                        modifier = Modifier.padding(4.dp)
                    )
                    Spacer(modifier = Modifier.height(6.dp))
                    Row(
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.card),
                            contentDescription = null,
                            modifier = Modifier
                                .size(24.dp),
                            alignment = Alignment.TopCenter
                        )
                        Text(
                            text = "11***********9870",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Start
                            ), modifier = Modifier.padding(2.dp)
                        )
                    }

                }

            }

            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null,
                modifier = Modifier
                    .width(180.dp)
                    .height(60.dp)
                    .align(Alignment.TopEnd)
                    .padding(start = 96.dp)

            )

        }

        Column (
            modifier = Modifier.padding(top = 344.dp)
        ) {
            Button(
                onClick = { navController.navigate(Routes.DaftarSurat.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 16.dp, end = 16.dp)
            ) {
                Text(text = "PENGAJUAN SURAT", color = Color.White)
            }
        }

        Column (
            modifier = Modifier.padding(top = 414.dp)
        ) {
            Button(
                onClick = { navController.navigate(Routes.DataKeluarga.route) },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 16.dp, end = 16.dp)
            ) {
                Text(text = "PENDATAAN WARGA", color = Color.White)
            }
        }

        Column(
            modifier = Modifier.padding(top = 500.dp)

        ) {
            LazyRow {
                item () {
                    Column(
                        modifier = Modifier
                            .background(color = Color.White)
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.item),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .size(120.dp)
                        )
                        Text(
                            text = "Laporan Keuangan B..",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(2.dp)
                        )
                    }
                }
                item () {
                    Column(
                        modifier = Modifier
                            .background(color = Color.White)
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.item),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .size(120.dp)
                        )
                        Text(
                            text = "Laporan Keuangan B..",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(2.dp)
                        )
                    }
                }
                item () {
                    Column(
                        modifier = Modifier
                            .background(color = Color.White)
                            .padding(8.dp)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.item),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .size(120.dp)
                        )
                        Text(
                            text = "Laporan Keuangan B..",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(2.dp)
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview
private fun preview() {
    BerandaPage(navController = rememberNavController())
}

