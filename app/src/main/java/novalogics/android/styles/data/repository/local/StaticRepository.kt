package novalogics.android.styles.data.repository.local

import android.content.Context
import novalogics.android.styles.R
import novalogics.android.styles.data.model.home.Event
import novalogics.android.styles.data.model.home.EventEntity
import novalogics.android.styles.data.type.FashionCategory

object StaticRepository {

    fun getWomenEvents(context: Context): List<EventEntity> {
        return listOf(
            EventEntity(
                id = 1001,
                name = context.getString(R.string.twilight_elegance),
                eventCategory = context.getString(R.string.evening),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.event_women_evening,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1002,
                name = context.getString(R.string.coastal_breeze),
                eventCategory = context.getString(R.string.beach_days),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.event_women_beach,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1003,
                name = context.getString(R.string.gala_glamour),
                eventCategory = context.getString(R.string.special_event),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.event_women_gala_glamour,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1004,
                name = context.getString(R.string.mix_and_mingle),
                eventCategory = context.getString(R.string.cocktail_party),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.event_women_mix_mingle,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1005,
                name = context.getString(R.string.elegant_affair),
                eventCategory = context.getString(R.string.formal_black_tie),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.placeholder_event,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1006,
                name = context.getString(R.string.eternal_elegance),
                eventCategory = context.getString(R.string.weddings),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.placeholder_event,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1007,
                name = context.getString(R.string.radiant_night),
                eventCategory = context.getString(R.string.prom_or_formal_dances),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.placeholder_event,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1008,
                name = context.getString(R.string.cap_and_gown_glam),
                eventCategory = context.getString(R.string.graduation),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.placeholder_event,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1009,
                name = context.getString(R.string.casual_couture),
                eventCategory = context.getString(R.string.brunch_with_friends),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.placeholder_event,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1010,
                name = context.getString(R.string.bohemian_vibes),
                eventCategory = context.getString(R.string.outdoor_festivals),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.placeholder_event,
                description = null,
                imageLink = null,
            ),
            EventEntity(
                id = 1011,
                name = context.getString(R.string.casual_chic),
                eventCategory = context.getString(R.string.everyday_essence),
                fashionCategory = FashionCategory.WOMEN,
                imageResId = R.drawable.placeholder_event,
                description = null,
                imageLink = null,
            ),
        )
    }


}
