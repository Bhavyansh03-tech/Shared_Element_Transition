package com.example.shared_element

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.shared_element.navigation.NavGraph
import com.example.shared_element.ui.theme.SharedElementTheme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SharedElementTheme {
                val navController = rememberNavController()
                Box(modifier = Modifier.padding(top = 7.dp)){
                    NavGraph(navController = navController)
                }
            }
        }
    }
}