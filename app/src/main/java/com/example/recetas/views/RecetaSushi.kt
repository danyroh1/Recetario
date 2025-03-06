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
fun SushiView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TittleBar("Sushi") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color(33, 150, 243))
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
                painter = painterResource(id = R.drawable.sushi),
                contentDescription = "Sushi",
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
                            "Paso 1: Cocina el arroz para sushi según las instrucciones del paquete. Una vez cocido, mezcla el arroz con vinagre de arroz, azúcar y sal. Deja enfriar el arroz a temperatura ambiente.\n" +
                            "Paso 2: Prepara las hojas de alga nori sobre una esterilla de bambú. Extiende una capa fina de arroz sobre el alga, dejando un borde de 1 cm sin arroz en la parte superior.\n" +
                            "Paso 3: Coloca tiras de pescado crudo, pepino, aguacate o lo que prefieras en el centro del arroz.\n" +
                            "Paso 4: Enrolla el sushi con la esterilla presionando ligeramente para que se mantenga firme. Humedece el borde sin arroz con agua para sellar el rollo.\n" +
                            "Paso 5: Corta el rollo en piezas de 2-3 cm de grosor. Sirve con salsa de soja, wasabi y jengibre encurtido."
                    ,
                    fontSize = 18.sp,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            MainButton("Regresar", Color.Black, Color(33, 150, 243)) {
                navController.popBackStack()
            }
        }
    }
}

