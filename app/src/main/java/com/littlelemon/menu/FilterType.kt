package com.littlelemon.menu

sealed class FilterType {
    object All : FilterType()
    object Comic : FilterType()
    object Hindi : FilterType()
    object English : FilterType()
}
