package com.example.shared_element.model

data class UnsplashList(
    val id: Int,
    val photo: String,
    val title: String,
    val description: String
)

val imageList = listOf(
    UnsplashList(
        id = 1,
        photo = "https://cdn.pixabay.com/photo/2024/06/21/08/21/hut-8843868_1280.jpg",
        title = "Sunset Over the Mountains",
        description = "A breathtaking view of the sun setting behind the mountains. The sky is painted in hues of orange and pink."
    ),
    UnsplashList(
        id = 2,
        photo = "https://cdn.pixabay.com/photo/2022/04/03/09/04/bridge-7108432_1280.jpg",
        title = "Cityscape at Night",
        description = "The city lights come alive after dusk, creating a stunning nightscape. Skyscrapers stand tall, illuminated by countless lights."
    ),
    UnsplashList(
        id = 3,
        photo = "https://cdn.pixabay.com/photo/2018/01/09/06/43/sea-3070982_1280.jpg",
        title = "Tranquil Beach",
        description = "A serene beach with crystal-clear waters and white sand. Gentle waves lap against the shore under a clear blue sky."
    ),
    UnsplashList(
        id = 4,
        photo = "https://cdn.pixabay.com/photo/2014/09/07/22/17/forest-438432_1280.jpg",
        title = "Forest Path",
        description = "A quiet path winding through a dense forest. The trees create a natural canopy, providing a cool, shaded retreat."
    ),
    UnsplashList(
        id = 5,
        photo = "https://cdn.pixabay.com/photo/2022/10/10/07/58/mountain-7511116_1280.jpg",
        title = "Snow-Covered Mountains",
        description = "Majestic mountains covered in a blanket of snow. The pristine white landscape is contrasted by the clear blue sky."
    )
)