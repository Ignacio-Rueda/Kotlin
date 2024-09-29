package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    /*
    *onCreate:Punto de entrada de la aplicación.
    * Llamamos a otas funciones para construir la interfaz de usuario.
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        /*
        * setContent es usada para definir el layout
        * */
        setContent {
            GreetingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Ignacio",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
/*
* Todas las funciones estan maracadas con la anotación composable.
* Pueden ser llamadas desde setContent o desde otras funciones composable.
* La anotación llama al compilador de Kotlin que esta función es usada por
* Jetpack Compose para generar la UI
*
* Diferencia entre una función regular y una función Composable:
* -> El nombre de la función es diferente, los nombres de las funciones @Composable van en mayúscula
* -> Las funciones Composable no pueden devolver nada.
*  */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface (color = Color.Blue){
        Text(
            text = "Hola, mi nombre es $name!", modifier = Modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Android")
    }
}