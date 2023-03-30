package com.example.healthdiary.models

import android.widget.RadioButton

data class SettingsModel(
    var nombre: String,
    //var sexo: Boolean,
    var altura: Int,
    var peso: Float,
    var darkmode: Boolean,
    var imc: Float
)