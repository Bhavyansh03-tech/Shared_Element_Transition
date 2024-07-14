package com.example.shared_element.navigation

import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.example.shared_element.presentation.screens.DetailScreen
import com.example.shared_element.presentation.screens.HomeScreen

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun NavGraph(
    navController: NavHostController
) {
    SharedTransitionLayout {
        NavHost(
            navController = navController,
            startDestination = Home
        ) {
            composable<Home> {
                HomeScreen(
                    animatedVisibilityScope = this@composable,
                    onImageClick = { imageId ->
                        navController.navigate(Detail(imageIdArg = imageId))
                    }
                )
            }

            composable<Detail> {
                val args = it.toRoute<Detail>()
                DetailScreen(
                    animatedVisibilityScope = this@composable,
                    imageId = args.imageIdArg, // Passing Image Id As Argument.
                    onClick = { navController.popBackStack() }  // Going back to previous activity by removing it from back stack.
                )
            }
        }
    }
}