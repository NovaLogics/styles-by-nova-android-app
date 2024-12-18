package novalogics.android.styles.ui.screens.home.component


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import novalogics.android.styles.R
import novalogics.android.styles.data.type.FashionCategory

@Composable
fun CustomDropdown(
    onSelectionChange: (FashionCategory) -> Unit,
    selectedCategory: FashionCategory,
    modifier: Modifier = Modifier
) {

    val index = if(selectedCategory == FashionCategory.DEFAULT) 0 else selectedCategory.ordinal
    val isDropDownExpanded = remember { mutableStateOf(false) }
    val itemPosition = remember { mutableIntStateOf(index) }

    val categories = FashionCategory.entries
        .filter { it != FashionCategory.DEFAULT }
        .map { it.name }

    Column(
        modifier = modifier
            .background(
                color = colorScheme.surfaceVariant,
                shape = MaterialTheme.shapes.medium.copy(
                    bottomStart = CornerSize(0.dp),
                    topStart = CornerSize(0.dp)
                )
            )
            .height(dimensionResource(id = R.dimen.size_medium_40dp)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Box {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable {
                    isDropDownExpanded.value = true
                }
            ) {
                Text(
                    text = categories[itemPosition.intValue],
                    color = colorScheme.onSecondaryContainer
                )
                Icon(
                    painter = painterResource(id = R.drawable.ic_down_arrow),
                    contentDescription = "DropDown Icon",
                    modifier = Modifier.padding(start = dimensionResource(id = R.dimen.padding_small_4dp)),
                    tint = colorScheme.onBackground.copy(alpha = 0.6f)
                )
            }
            DropdownMenu(
                expanded = isDropDownExpanded.value,
                onDismissRequest = {
                    isDropDownExpanded.value = false
                }) {

                categories.forEachIndexed { index, item ->
                    DropdownMenuItem(
                        text = {
                            Text(
                                text = item,
                                color = colorScheme.onSecondaryContainer,
                            )
                        },
                        onClick = {
                            isDropDownExpanded.value = false
                            itemPosition.intValue = index
                            FashionCategory.entries.getOrNull(index)?.let {
                                category-> onSelectionChange(category)
                            }
                        })
                }
            }
        }

    }
}
