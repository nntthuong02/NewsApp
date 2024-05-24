package com.example.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.example.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)
val pages = listOf(
    Page(
        title = "Onboarding1",
        description = "Giải pháp giúp bạn bớt mệt mỏi bởi các khoản chi tiêu",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Onboarding2",
        description = "Giảm bớt gánh nặng chi tiu",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Onboarding3",
        description = "Tính toán thông minh, tiết kiệm hiệu quả",
        image = R.drawable.onboarding3
    )
)
