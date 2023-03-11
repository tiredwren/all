package com.example.search

data class ItemsModal(
    // on below line we are creating a two variable
    // one for course name and other for course image.
    var name: String,
    var short_desc: String,
    var content_desc: String,
    var link: String,
    var image: Int
)
