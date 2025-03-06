package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
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
fun PizzaView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TittleBar("Pizza") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(
                        255,
                        87,
                        51
                    )
                )
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 65.dp)
                .verticalScroll(rememberScrollState()), // Permite hacer scroll si el contenido es largo
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.pizza),
                contentDescription = "Pizza",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.FillWidth
            )

            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .border(
                        BorderStroke(
                            2.dp,
                            Color.Black
                        )
                    )
                    .padding(16.dp)
                    .background(Color.White)
            ) {
                Text(
                    text = "Receta:\n" +
                            "Paso 1: Prepara la masa de pizza mezclando harina, agua tibia, levadura y sal. Amasa hasta obtener una textura suave y elástica. Deja reposar la masa durante 1 hora en un lugar cálido.\n" +
                            "Paso 2: Precalienta el horno a 220°C. Mientras tanto, extiende la masa en una superficie enharinada hasta que tenga el tamaño adecuado para tu bandeja de horno.\n" +
                            "Paso 3: Esparce una capa de salsa de tomate sobre la base de la pizza, luego agrega una capa generosa de queso mozzarella rallado.\n" +
                            "Paso 4: Añade tus ingredientes favoritos como jamón, pepperoni, champiñones, pimientos o aceitunas.\n" +
                            "Paso 5: Hornea la pizza durante 12-15 minutos, o hasta que la masa esté dorada y crujiente y el queso esté bien derretido y burbujeante.\n" +
                            "Paso 6: Retira del horno, corta en porciones y disfruta.",
                    fontSize = 18.sp,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            MainButton("Regresar", Color.Black, Color(255, 87, 51)) {
                navController.popBackStack()
            }
        }
    }
}
