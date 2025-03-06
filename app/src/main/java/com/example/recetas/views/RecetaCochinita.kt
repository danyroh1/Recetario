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
import com.example.recetas.components.Spacers
import com.example.recetas.components.TittleBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CochinitaPibilView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TittleBar("Cochinita Pibil") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color(255, 152, 0))
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
            Spacers()
            Image(
                painter = painterResource(id = R.drawable.cochinita_pibil),
                contentDescription = "Cochinita Pibil",
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
                    text = "Ingredientes:\n" +
                            "   1 kg de carne de cerdo (pierna o lomo)\n" +
                            "   100 g de pasta de achiote\n" +
                            "   1 taza de jugo de naranja agria (o mezcla de naranja y limón)\n" +
                            "   2 dientes de ajo picados\n" +
                            "   1 cucharadita de comino\n" +
                            "   Sal y pimienta al gusto\n" +
                            "   Hojas de plátano (opcional)\n"+
                            "\n Receta:\n" +
                            "   Paso 1: Marina la carne de cerdo con achiote, jugo de naranja agria, ajo, sal y pimienta. Deja reposar por al menos 4 horas o toda la noche en el refrigerador para que absorba bien los sabores.\n" +
                            "   Paso 2: Precalienta el horno a 180°C. Coloca la carne marinada en una olla de presión o en un recipiente con tapa y hornéala durante 3 horas o hasta que esté tierna.\n" +
                            "   Paso 3: Una vez cocida la carne, retírala del horno y desmenúzala con un tenedor.\n" +
                            "   Paso 4: Sirve la carne sobre tortillas de maíz calientes, acompáñala con cebolla morada encurtida, salsa de habanero y un poco de cilantro.",
                    fontSize = 17.sp,
                    color = Color.Black
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            MainButton("Regresar", Color.Black, Color(255, 152, 0)) {
                navController.popBackStack()
            }
        }
    }
}
