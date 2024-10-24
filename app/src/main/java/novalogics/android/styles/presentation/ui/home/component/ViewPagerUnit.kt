package novalogics.android.styles.presentation.ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent
import novalogics.android.styles.R

@Composable
fun ViewPagerUnit(
    bannerUrls: List<String>,
    pageIndex: Int
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(dimensionResource(id = R.dimen.size_3xlarge_234dp))
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ) {
        ElevatedCard(
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.padding_medium_16dp)),
            elevation = CardDefaults.cardElevation(
                defaultElevation = dimensionResource(id = R.dimen.elevation_medium_4dp)
            ),
            shape = RoundedCornerShape(dimensionResource(id = R.dimen.corner_radius_medium_8dp))
        ) {

            SubcomposeAsyncImage(
                model = bannerUrls[pageIndex],
                contentDescription = "Banner Image",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxSize()
            ) {
                val state = painter.state

                when (state) {
                    is AsyncImagePainter.State.Loading -> {

                        Box(modifier = Modifier.fillMaxSize()) {
                            Image(
                                painter = painterResource(id = R.drawable.banner_women),
                                contentDescription = "Loading placeholder",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                            CircularProgressIndicator(
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .size(48.dp)
                            )
                        }
                    }

                    is AsyncImagePainter.State.Error -> {
                        // Show the error image if the loading fails
                        Image(
                            painter = painterResource(id = R.drawable.placeholder_banner_error),
                            contentDescription = "Error placeholder",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop
                        )
                    }

                    else -> {
                        SubcomposeAsyncImageContent()
                    }
                }

            }
        }
    }
}

@Preview
@Composable
private fun ViewPagerItemPreview() {
    ViewPagerUnit(
        bannerUrls = listOf(),
        pageIndex = 0
    )
}
