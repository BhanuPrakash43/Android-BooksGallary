package com.littlelemon.menu

class FilterHelper {

    fun filterProducts(type: FilterType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            FilterType.All -> productsList
            FilterType.English -> productsList.filter {it.category == "English"}
            FilterType.Comic -> productsList.filter {it.category == "Comic"}
            FilterType.Hindi -> productsList.filter {it.category == "Hindi"}

        }
    }

}