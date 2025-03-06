package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recetas.R
import com.example.recetas.components.RecipeItem
import com.example.recetas.components.Spacers
import com.example.recetas.components.TittleBar


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainMenuView(navController: NavController) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TittleBar("Recetario") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.DarkGray)
            )
        }
    ) {

        Column(
            modifier = Modifier.fillMaxSize().padding(top = 50.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacers()

            RecipeItem(
                "Cochinita Pibil", R.drawable.cochinita_pibil, text = "Cochinita",
                "Carne de cerdo marinada en achiote.", navController)

            RecipeItem("Dumplings", R.drawable.dumplings, text = "Dumplings",
                "Pequeñas bolsitas de masa rellenas de carne o verduras",navController)

            RecipeItem("Pizza", R.drawable.pizza,text = "Pizza",
                "Pan horneado con salsa de tomate, queso y peperoni",navController)

            RecipeItem("Sushi", R.drawable.sushi,text = "Sushi",
                "Rollo a base de arroz aderezado con vinagre y acompañado de pescado o vegetales.",navController)

        }
    }
}

