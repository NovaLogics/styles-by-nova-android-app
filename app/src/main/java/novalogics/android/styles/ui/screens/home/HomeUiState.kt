package novalogics.android.styles.ui.screens.home

import novalogics.android.styles.data.model.home.EventEntity
import novalogics.android.styles.data.type.FashionCategory

private const val DEFAULT_VALUE = ""

data class HomeUiState(
    val isLoading: Boolean = false,
    val loadingMessage: String = DEFAULT_VALUE,
    val bannerItems: List<String> = emptyList(),
    val eventCategories: List<EventEntity> = emptyList(),
    val fashionCategory: FashionCategory = FashionCategory.DEFAULT,
    val searchFieldValue: String = DEFAULT_VALUE,
    val error: String? = null
)
