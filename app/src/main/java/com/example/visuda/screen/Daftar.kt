package com.example.visuda.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun DaftarPage(navController: NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.bglogin),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Card(
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Daftar Sekarang",
                        style = TextStyle(
                            color = biru,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    val NIK = remember { mutableStateOf(TextFieldValue()) }
                    val Nama = remember { mutableStateOf(TextFieldValue()) }
                    val Password = remember{mutableStateOf(TextFieldValue())}
                    TextField(
                        label = { Text(text = "Nomor Induk Kependudukan") },
                        value = NIK.value,
                        onValueChange = { NIK.value = it },
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFF0F0F0)
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    TextField(
                        label = { Text(text = "Nama Lengkap") },
                        value = Nama.value,
                        onValueChange = { Nama.value = it },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFF0F0F0)
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    TextField(
                        label = { Text(text = "Password") },
                        value = Password.value,
                        onValueChange = { Password.value = it },
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier.fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color(0xFFF0F0F0)
                        )
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Button(
                        onClick = { navController.navigate(Routes.Login.route) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(50.dp)
                    ) {
                        Text(text = "Daftar", color = Color.White)
                    }

                }
            }
        }
    }
}