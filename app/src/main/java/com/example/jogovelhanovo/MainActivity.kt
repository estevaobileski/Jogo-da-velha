import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jogovelhanovo.ui.theme.JogoVelhaNovoTheme

@Composable
fun MainActivity() {
    JogoVelhaNovoTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            JogoDaVelha()
        }
    }
}

@Composable
fun JogoDaVelha() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Jogo da Velha",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Column {
            for (i in 0 until 3) {
                Row {
                    for (j in 0 until 3) {
                        Box(
                            modifier = Modifier
                                .size(100.dp)
                                .padding(4.dp)
                                .background(MaterialTheme.colorScheme.secondary)
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainActivity() {
    MainActivity()
}
