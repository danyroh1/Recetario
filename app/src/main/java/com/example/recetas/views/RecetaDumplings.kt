package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.recetas.R
import com.example.recetas.components.MainButton
import com.example.recetas.components.TittleBar


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DumplingsView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TittleBar("Dumplings") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color(76, 175, 80))
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 65.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dumplings),
                contentDescription = "Dumplings",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )

            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .border(BorderStroke(2.dp, Color.Black))
                    .padding(16.dp)
                    .background(Color.White)
            ) {
                Text(
                    text = "Receta:\n" +
                            "Paso 1: Prepara la masa mezclando harina de trigo con agua y sal. Amasa hasta que obtengas una masa suave y elástica. Deja reposar durante 30 minutos.\n" +
                            "Paso 2: Para el relleno, mezcla carne molida de cerdo o pollo con cebolla, jengibre, ajo, salsa de soja, aceite de sésamo y sal. Mezcla bien hasta que todos los ingredientes estén incorporados.\n" +
                            "Paso 3: Forma pequeñas bolitas con la masa y rellénalas con una cucharadita del relleno. Cierra las bolitas de masa formando pequeños paquetitos.\n" +
                            "Paso 4: Cocina los dumplings al vapor en una vaporera durante 15-20 minutos o hasta que la masa esté cocida y el relleno completamente caliente.\n" +
                            "Paso 5: Sirve los dumplings con salsa de soja, vinagre de arroz o salsa de chile al gusto.",
                    fontSize = 18.sp,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            MainButton("Regresar", Color.Black, Color(76, 175, 80)) {
                navController.popBackStack()
            }
        }
    }
}
