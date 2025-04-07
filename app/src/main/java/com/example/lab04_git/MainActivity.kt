package com.example.lab04_git

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab04_git.ui.theme.Lab04gitTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04gitTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Tarjeta(
                        nombres = "George Miky",
                        apellidos = "Guerra Pacheco",
                        carrera= "Diseño de Software",
                        ciclo = "IV",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Tarjeta(
    nombres: String,
    apellidos: String,
    carrera: String,
    ciclo: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE3F2FD) // Celeste claro
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = nombres,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = apellidos,
                fontSize = 18.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = carrera,
                fontSize = 16.sp,
                color = Color(0xFF1565C0) // Azul fuerte
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Ciclo: $ciclo",
                fontSize = 16.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Gray
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun TarjetaPreview() {
    Lab04gitTheme {
        Tarjeta(
            "George Miky",
            "Guerra Pacheco",
            "Diseño de Software",
            "IV"
        )
    }
}