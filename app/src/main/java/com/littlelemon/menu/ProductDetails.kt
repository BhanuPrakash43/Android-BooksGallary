package com.littlelemon.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProductDetails(productItem: ProductItem) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = productItem.image),
            contentDescription = productItem.title,
            modifier = Modifier.size(300.dp)
        )
        Text(text = productItem.title, fontSize = 24.sp)
        Text(text = "Price: $${productItem.price}", fontSize = 20.sp)
        Text(text = "Category: ${productItem.category}", fontSize = 20.sp)
    }
}