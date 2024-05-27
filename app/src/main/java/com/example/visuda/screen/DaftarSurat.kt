package com.example.visuda.screen

import android.provider.ContactsContract.Profile
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DaftarSuratPage(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(biru)
    ) {
        Column(
            modifier = Modifier
                .background(biru)
                .padding(start = 120.dp, top = 30.dp, bottom = 8.dp),
        ) {
            Text(
                text = "Pengajuan Surat",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            )
        }
        Column(
            modifier = Modifier
                .background(biru)
                .padding(start = 50.dp, top = 2.dp, bottom = 22.dp),
        ) {
            Text(
                text = "Silahkan pilih salah satu surat yang ingin anda ajukan",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 12.sp,
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
                Row(
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    Card(
                        onClick = { navController.navigate(Routes.Formulir.route) },
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(start = 16.dp, end = 26.dp)
                            .width(160.dp)
                            .height(210.dp)


                    ) {
                        Column{
                            Image(
                                painter = painterResource(id = R.drawable.f1),
                                contentDescription = null,
                                modifier = Modifier.size(160.dp)
                            )
                            Text(
                                text = "Surat Keterangan Domisili",
                                style = TextStyle(
                                    color = biru,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            )
                        }

                    }
                    Card(
                        onClick = { navController.navigate(Routes.Formulir.route) },
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .width(160.dp)
                            .height(210.dp)

                    ) {
                        Column{
                            Image(
                                painter = painterResource(id = R.drawable.f2),
                                contentDescription = null,
                                modifier = Modifier.size(160.dp)
                            )
                            Text(
                                text = "Surat Keterangan Nikah",
                                style = TextStyle(
                                    color = biru,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            )
                        }

                    }
                }
                Row(
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Card(
                        onClick = { navController.navigate(Routes.Formulir.route) },
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(start = 16.dp, end = 26.dp)
                            .width(160.dp)
                            .height(210.dp)


                    ) {
                        Column{
                            Image(
                                painter = painterResource(id = R.drawable.f3),
                                contentDescription = null,
                                modifier = Modifier.size(160.dp)
                            )
                            Text(
                                text = "Surat Pengantar      RT/RW",
                                style = TextStyle(
                                    color = biru,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            )
                        }

                    }
                    Card(
                        onClick = { navController.navigate(Routes.Formulir.route) },
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .width(160.dp)
                            .height(210.dp)

                    ) {
                        Column{
                            Image(
                                painter = painterResource(id = R.drawable.f4),
                                contentDescription = null,
                                modifier = Modifier.size(160.dp)
                            )
                            Text(
                                text = "Surat Pembuatan kartu Keluarga",
                                style = TextStyle(
                                    color = biru,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            )
                        }

                    }
                }
                Row(
                    modifier = Modifier.padding(top = 8.dp)
                ) {
                    Card(
                        onClick = { navController.navigate(Routes.Formulir.route) },
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(start = 16.dp, end = 26.dp)
                            .width(160.dp)
                            .height(210.dp)


                    ) {
                        Column{
                            Image(
                                painter = painterResource(id = R.drawable.f5),
                                contentDescription = null,
                                modifier = Modifier.size(160.dp)
                            )
                            Text(
                                text = "Surat Keterangan Usaha",
                                style = TextStyle(
                                    color = biru,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            )
                        }

                    }
                    Card(
                        onClick = { navController.navigate(Routes.Formulir.route) },
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(8.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier
                            .width(160.dp)
                            .height(210.dp)

                    ) {
                        Column{
                            Image(
                                painter = painterResource(id = R.drawable.f6),
                                contentDescription = null,
                                modifier = Modifier.size(160.dp)
                            )
                            Text(
                                text = "      Surat Kematian",
                                style = TextStyle(
                                    color = biru,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                )
                            )
                        }

                    }
                }
            }
        }
    }
}
