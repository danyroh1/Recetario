package com.example.recetas.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun TittleBar(name: String){
    Text(text = name, fontSize=25.sp,color = Color.White)
}

/*@Composable
fun ActionButton(colores: Color){
    FloatingActionButton(
        onClick = {/*TODO*/},
        containerColor = colores,
        contentColor = Color.White
    ) {
        Icon(Icons.Filled.Add, contentDescription = "Add")
    }
}*/
@Composable
fun UploadImage(
    imageRes: Int,
    contentDescription: String = "",
    size: Dp = 128.dp,
    cornerRadius: Dp = 10.dp,
    borderWidth: Dp = 5.dp,
    borderColor: Color = Color.Gray
) {
    Image(
        painter = painterResource(imageRes),
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(size)
            .clip(RoundedCornerShape(cornerRadius))
            .border(borderWidth, borderColor, RoundedCornerShape(cornerRadius))
    )
}
@Composable
fun RecipeItem(name: String, imageRes: Int, text : String, navController: NavController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        UploadImage(
            imageRes = imageRes,
            contentDescription = "Imagen de $name",
            size = 140.dp
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = name, fontSize = 20.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(8.dp))
            MainButton("Ir a Receta", Color.DarkGray, Color.White) {
                navController.navigate(text)
            }
        }
    }
}
