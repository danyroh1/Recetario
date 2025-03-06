package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        Spacers()
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacers()

            RecipeItem("Cochinita", R.drawable.cochinita_pibil, text = "Cochinita",navController)

            RecipeItem("Dumplings", R.drawable.dumplings, text = "Dumplings",navController)

            RecipeItem("Pizza", R.drawable.pizza,text = "Pizza",navController)

            RecipeItem("Sushi", R.drawable.sushi,text = "Sushi",navController)

        }
    }
}

