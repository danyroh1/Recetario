package com.example.recetas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.recetas.navigation.NavManager


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavManager()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    //MainMenuView()
    //CochinitaPibilView()
    //DumplingsView()
    //PizzaView()
    //SushiView()
}
