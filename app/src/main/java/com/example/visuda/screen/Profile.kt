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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfilePage(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(biru)
    ) {
        Column(
            modifier = Modifier
                .background(biru)
                .padding(start = 140.dp, top = 30.dp, bottom = 30.dp),
        ) {
            Text(
                text = "Profile Saya",
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
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = null,
                            modifier = Modifier
                                .size(120.dp)
                                .padding(start = 24.dp, end = 20.dp)
                        )
                        Column {
                            Text(
                                text = "Sujimin Supri",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier.padding(top = 24.dp, end = 78.dp, bottom = 8.dp)
                            )
                            Card(
                                onClick = { },
                                shape = RoundedCornerShape(12.dp),
                                elevation = CardDefaults.cardElevation(16.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = biru
                                )
                            ) {
                                Text(
                                    text = "Edit Profile",
                                    style = TextStyle(
                                        color = Color.White,
                                        fontSize = 14.sp,
                                        textAlign = TextAlign.Center
                                    ), modifier = Modifier.padding(10.dp)
                                )
                            }
                        }
                    }
                    Divider(
                        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp, start = 18.dp, end = 18.dp)
                    )
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.ipengaturan),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .padding(start = 18.dp, end = 18.dp)
                        )
                        Column {
                            Text(
                                text = "Pengaturan",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier.padding(top = 24.dp)
                            )
                        }
                    }
                    Divider(
                        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp, start = 18.dp, end = 18.dp)
                    )
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.iinfo),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .padding(start = 18.dp, end = 18.dp)
                        )
                        Column {
                            Text(
                                text = "Tentang Kami",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier.padding(top = 24.dp)
                            )
                        }
                    }
                    Divider(
                        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp, start = 18.dp, end = 18.dp)
                    )
                    Row {
                        Image(
                            painter = painterResource(id = R.drawable.inotif),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .padding(start = 18.dp, end = 18.dp)
                        )
                        Column {
                            Text(
                                text = "Notifikasi",
                                style = TextStyle(
                                    color = Color.Black,
                                    fontSize = 16.sp,
                                    textAlign = TextAlign.Center
                                ),
                                modifier = Modifier.padding(top = 24.dp)
                            )
                        }
                    }
                    Divider(
                        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp, start = 18.dp, end = 18.dp)
                    )
                }
            }
        }
    }
}