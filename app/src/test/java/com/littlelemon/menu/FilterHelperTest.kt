package com.littlelemon.menu

import junit.framework.TestCase.assertEquals
import org.junit.Test

class FilterHelperTest {
    private val sampleProductsList = mutableListOf(
        ProductItem(title = "Avengers", price = 3.00, category = "Comic", R.drawable.comics_avengers),
        ProductItem(title = "Stephen King", price = 7.00, category = "English", R.drawable.stephen_king),
        ProductItem(title = "Godan", price = 20.00, category = "Hindi", R.drawable.hindi_godan)
    )
    val filterHelper = FilterHelper()

    @Test
    fun filterProducts_filterTypeEnglish_croissantReturned() {
        val result = filterHelper.filterProducts(FilterType.English, sampleProductsList)
        assertEquals(sampleProductsList[1], result[0])
    }
}
