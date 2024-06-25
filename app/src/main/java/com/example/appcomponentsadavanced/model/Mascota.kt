package com.example.appcomponentsadavanced.model

import androidx.annotation.DrawableRes

data class Mascota(
    var nombre: String,
    var raza: String,
    var anios: Int,
    @DrawableRes var imagen: Int
)
