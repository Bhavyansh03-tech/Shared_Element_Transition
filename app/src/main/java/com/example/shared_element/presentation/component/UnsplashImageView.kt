package com.example.shared_element.presentation.component

import androidx.compose.animation.AnimatedVisibilityScope
import androidx.compose.animation.ExperimentalSharedTransitionApi
import androidx.compose.animation.SharedTransitionScope
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.shared_element.model.UnsplashList

@OptIn(ExperimentalSharedTransitionApi::class)
@Composable
fun SharedTransitionScope.UnsplashImageView(
    animatedVisibilityScope: AnimatedVisibilityScope,
    data: UnsplashList,
    onClick: (Int) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(size = 12.dp))
            .clickable { onClick(data.id) }
            .padding(all = 8.dp)
    ) {
        AsyncImage(
            modifier = Modifier
                .sharedElement(
                    state = rememberSharedContentState(key = "image-${data.id}"),
                    animatedVisibilityScope = animatedVisibilityScope
                )
                .size(80.dp)
                .clip(shape = RoundedCornerShape(size = 12.dp)),
            model = data.photo,
            contentDescription = data.title,
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = data.title,
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Medium
            )
            Text(
                modifier = Modifier
                    .sharedBounds(
                        sharedContentState = rememberSharedContentState(key = "text-${data.id}"),
                        animatedVisibilityScope = animatedVisibilityScope
                    )
                    .alpha(0.5f),
                text = data.description,
                fontSize = MaterialTheme.typography.bodyMedium.fontSize,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}