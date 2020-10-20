package com.lacolinares.motionlayoutrecyclerview

data class Status(
    val id: String,
    val text: String,
    val timeStamp: Long = System.currentTimeMillis(),
    val name: String
)