import androidx.compose.foundation.Image
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun App() {
    MaterialTheme {
        Image(
            painterResource(""),
            ""
        )

    }
}

expect fun getPlatformName(): String