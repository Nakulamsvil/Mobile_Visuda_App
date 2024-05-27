package com.example.visuda.screen

import android.provider.ContactsContract.Profile
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
import com.example.visuda.navigation.Routes
import com.example.visuda.ui.theme.biru
import com.example.visuda.ui.theme.birumuda

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataKeluargaPage(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(biru)
    ) {
        Column(
            modifier = Modifier
                .background(biru)
                .padding(start = 130.dp, top = 30.dp, bottom = 30.dp),
        ) {
            Text(
                text = "Data Keluarga",
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
                    .fillMaxHeight()

            ) {
                Spacer(modifier = Modifier.height(16.dp))
                Column {
                    Card(
                        onClick = { navController.navigate(Routes.TambahData.route) },
                        shape = RoundedCornerShape(12.dp),
                        elevation = CardDefaults.cardElevation(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = biru,
                        ), modifier = Modifier.padding(start = 18.dp)
                    ) {
                        Text(
                            text = "Tambah Data",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(16.dp)
                        )
                    }
                    Spacer(modifier = Modifier.padding(8.dp))
                    Card(
                        onClick = { },
                        shape = RoundedCornerShape(12.dp),
                        elevation = CardDefaults.cardElevation(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = birumuda,
                        ), modifier = Modifier.padding(start = 18.dp)
                    ) {
                        Row {
                            Text(
                                text = "Data Kepala Keluarga",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                ), modifier = Modifier.padding(start = 10.dp, bottom = 4.dp, top = 30.dp, end = 116.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.profile),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size(56.dp)
                            )
                        }
                        Text(
                            text = "Nama : Dew Jirawat",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(start = 10.dp, 4.dp)
                        )
                        Text(
                            text = "Tanggal Lahir : 30 Oktober 2000",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(start = 10.dp, 4.dp)
                        )
                        Text(
                            text = "Tempat Lahir : Batam",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(start = 10.dp, bottom = 8.dp,)
                        )
                        Row {
                            Card(
                                onClick = { navController.navigate(Routes.TambahData.route) },
                                shape = RoundedCornerShape(18.dp),
                                elevation = CardDefaults.cardElevation(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White,
                                ), modifier = Modifier.padding(start = 32.dp, top = 4.dp)
                            ) {
                                Text(
                                    text = "Edit",
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 13.sp,
                                        textAlign = TextAlign.Center
                                    ), modifier = Modifier.padding(start = 50.dp, bottom = 8.dp, top = 8.dp, end = 50.dp)
                                )
                            }
                            Card(
                                onClick = { navController.navigate(Routes.TambahData.route) },
                                shape = RoundedCornerShape(18.dp),
                                elevation = CardDefaults.cardElevation(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White,
                                ), modifier = Modifier.padding(start = 40.dp, bottom = 8.dp, top = 4.dp)
                            ) {
                                Text(
                                    text = "Detail",
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 13.sp,
                                        textAlign = TextAlign.Center
                                    ), modifier = Modifier.padding(start = 48.dp, bottom = 8.dp, top = 8.dp, end = 48.dp)
                                )
                            }
                        }

                    }
                    Spacer(modifier = Modifier.padding(8.dp))
                    Card(
                        onClick = { },
                        shape = RoundedCornerShape(12.dp),
                        elevation = CardDefaults.cardElevation(16.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = birumuda,
                        ), modifier = Modifier.padding(start = 18.dp)
                    ) {
                        Row {
                            Text(
                                text = "Data Istri",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                ), modifier = Modifier.padding(start = 10.dp, bottom = 4.dp, top = 30.dp, end = 206.dp)
                            )
                            Image(
                                painter = painterResource(id = R.drawable.profile),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(10.dp)
                                    .size(56.dp)
                            )
                        }
                        Text(
                            text = "Nama : Dew Jirawat",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(start = 10.dp, 4.dp)
                        )
                        Text(
                            text = "Tanggal Lahir : 30 Oktober 2000",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(start = 10.dp, 4.dp)
                        )
                        Text(
                            text = "Tempat Lahir : Batam",
                            style = TextStyle(
                                color = Color.Black,
                                fontSize = 12.sp,
                                textAlign = TextAlign.Center
                            ), modifier = Modifier.padding(start = 10.dp, bottom = 8.dp,)
                        )
                        Row {
                            Card(
                                onClick = { navController.navigate(Routes.TambahData.route) },
                                shape = RoundedCornerShape(18.dp),
                                elevation = CardDefaults.cardElevation(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White,
                                ), modifier = Modifier.padding(start = 32.dp, top = 4.dp)
                            ) {
                                Text(
                                    text = "Edit",
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 13.sp,
                                        textAlign = TextAlign.Center
                                    ), modifier = Modifier.padding(start = 50.dp, bottom = 8.dp, top = 8.dp, end = 50.dp)
                                )
                            }
                            Card(
                                onClick = { navController.navigate(Routes.TambahData.route) },
                                shape = RoundedCornerShape(18.dp),
                                elevation = CardDefaults.cardElevation(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White,
                                ), modifier = Modifier.padding(start = 40.dp, bottom = 8.dp, top = 4.dp)
                            ) {
                                Text(
                                    text = "Detail",
                                    style = TextStyle(
                                        color = Color.Black,
                                        fontSize = 13.sp,
                                        textAlign = TextAlign.Center
                                    ), modifier = Modifier.padding(start = 48.dp, bottom = 8.dp, top = 8.dp, end = 48.dp)
                                )
                            }
                        }

                    }
                }
            }
        }
    }
}