package com.example.visuda.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.visuda.ui.theme.Purple40
import com.example.visuda.R // Pastikan untuk mengganti dengan package yang sesuai
import com.example.visuda.ui.theme.biru

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RiwayatPage(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize().background(biru)) {
        Column(
            modifier = Modifier
                .background(biru)
                .padding(start = 110.dp, top = 30.dp, bottom = 30.dp),
        ){
            Text(
                text = "Riwayat Pengajuan",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            )
        }
        Box(
            modifier = Modifier
                .background(biru),
            contentAlignment = Alignment.TopCenter
        ) {
            Card(
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()

            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Column(
                    modifier = Modifier.padding(16.dp).height(600.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Hari Ini",
                        style = TextStyle(
                            color = biru,
                            fontSize = 18.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Card(
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(84.dp)

                    ) {
                        Column(
                            modifier = Modifier
                        ){
                            Row(
                                modifier = Modifier.padding(16.dp),
                            ) {
                                Text(
                                    text = "Surat Keterangan Domisili",
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 16.sp,
                                        textAlign = TextAlign.Center
                                    ), modifier = Modifier.padding(end = 78.dp)
                                )
                                Text(
                                    text = "21/03/2024",
                                    style = TextStyle(
                                        color = Color.Gray,
                                        fontSize = 12.sp,
                                        textAlign = TextAlign.Center
                                    )
                                )
                            }
                            Row(
                                modifier = Modifier.padding(start = 16.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.bbiru),
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp).padding(end = 8.dp)
                                )
                                Text(
                                    text = "Pengajuan",
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 12.sp,
                                        textAlign = TextAlign.Center
                                    ), modifier = Modifier.padding(end = 78.dp)
                                )
                            }
                        }

                    }
                    Spacer(modifier = Modifier.height(36.dp))
                    Text(
                        text = "Bulan Lalu",
                        style = TextStyle(
                            color = biru,
                            fontSize = 18.sp,
                            textAlign = TextAlign.Start
                        )
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(84.dp)

                    ) {
                        Column(
                            modifier = Modifier
                        ){
                            Row(
                                modifier = Modifier.padding(16.dp),
                            ) {
                                Text(
                                    text = "Surat Pengantar RT/RW",
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 16.sp,
                                        textAlign = TextAlign.Center
                                    ), modifier = Modifier.padding(end = 78.dp)
                                )
                                Text(
                                    text = "17/01/2024",
                                    style = TextStyle(
                                        color = Color.Gray,
                                        fontSize = 12.sp,
                                        textAlign = TextAlign.Center
                                    )
                                )
                            }
                            Row(
                                modifier = Modifier.padding(start = 16.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.bhijau),
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp).padding(end = 8.dp)
                                )
                                Text(
                                    text = "Selesai",
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 12.sp,
                                        textAlign = TextAlign.Center
                                    ), modifier = Modifier.padding(end = 78.dp)
                                )
                            }
                        }

                    }
                }

            }
        }
    }
}