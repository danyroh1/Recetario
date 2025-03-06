package com.example.recetas.components


import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/*@Composable
fun TitleView(name: String){
    Text(text = name, fontSize = 25.sp, color = Color.DarkGray)
}*/
@Composable
fun Spacers(){
    Spacer(modifier = Modifier.height(10.dp))
}
@Composable
fun MainButton(name:String, backcolor: Color, color: Color, onClick:()->Unit){
    Button(onClick = onClick, colors = ButtonDefaults.buttonColors(
        contentColor = color,
        containerColor = backcolor
    )) { Text(text=name) }

}
