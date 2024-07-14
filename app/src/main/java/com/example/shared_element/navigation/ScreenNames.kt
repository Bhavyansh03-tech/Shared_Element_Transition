package com.example.shared_element.navigation

import kotlinx.serialization.Serializable

@Serializable object Home
@Serializable data class Detail(
    val imageIdArg: Int = 1
)