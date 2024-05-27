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
fun FormulirPage(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(biru)
    ) {
        Column(
            modifier = Modifier
                .background(biru)
                .padding(start = 90.dp, top = 30.dp, bottom = 30.dp),
        ) {
            Text(
                text = "Formulir Pengajuan Surat",
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

                val nama = remember { mutableStateOf(TextFieldValue()) }
                val nik = remember { mutableStateOf(TextFieldValue()) }
                val jk = remember { mutableStateOf(TextFieldValue()) }
                val tempat = remember { mutableStateOf(TextFieldValue()) }
                val tanggal = remember { mutableStateOf(TextFieldValue()) }
                val alamat = remember { mutableStateOf(TextFieldValue()) }
                val rt = remember { mutableStateOf(TextFieldValue()) }
                val rw = remember { mutableStateOf(TextFieldValue()) }
                val agama = remember { mutableStateOf(TextFieldValue()) }

                TextField(
                    label = { Text(text = "Nama Lengkap") },
                    value = nama.value,
                    onValueChange = { nama.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFFFFFFF)
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    label = { Text(text = "NIK") },
                    value = nik.value,
                    onValueChange = { nik.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFFFFFFF)
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    label = { Text(text = "Jenis Kelamin") },
                    value = jk.value,
                    onValueChange = { jk.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFFFFFFF)
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    label = { Text(text = "Tempat Lahir") },
                    value = tempat.value,
                    onValueChange = { tempat.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFFFFFFF)
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    label = { Text(text = "Tanggal Lahir") },
                    value = tanggal.value,
                    onValueChange = { tanggal.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFFFFFFF)
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    label = { Text(text = "Alamat") },
                    value = alamat.value,
                    onValueChange = { alamat.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFFFFFFF)
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    label = { Text(text = "Wilayah RT") },
                    value = rt.value,
                    onValueChange = { rt.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFFFFFFF)
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    label = { Text(text = "Wilayah RW") },
                    value = rw.value,
                    onValueChange = { rw.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFFFFFFF)
                    )
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    label = { Text(text = "Agama") },
                    value = agama.value,
                    onValueChange = { agama.value = it },
                    modifier = Modifier.fillMaxWidth(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color(0xFFFFFFFF)
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
                Card(
                    onClick = { },
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(16.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = biru,
                    ), modifier = Modifier.padding(start = 160.dp)
                ) {
                    Text(
                        text = "  Kirim  ",
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 14.sp,
                            textAlign = TextAlign.Center
                        ), modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }
    }
}