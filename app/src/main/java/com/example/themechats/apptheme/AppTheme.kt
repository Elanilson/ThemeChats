package com.example.themechats.apptheme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.example.themechats.apptheme.sea.darkSeaScheme
import com.example.themechats.apptheme.sea.lightSeaScheme
import com.example.themechats.enums.Themes
import com.example.themechats.apptheme.natural.darkNaturalScheme
import com.example.themechats.apptheme.natural.lightNaturalScheme
import com.example.themechats.apptheme.original.darkOriginalScheme
import com.example.themechats.apptheme.original.lightOriginalScheme
import com.example.themechats.apptheme.sea.darkSeaScheme
import com.example.themechats.apptheme.sea.lightSeaScheme

@Composable
fun AppTheme(
    // elegir un tema - Original - natural - sunset
    theme: Themes,
    // solo aplica para la version 12+
    // es decir el API 31+
    isDynamicColors: Boolean = false,
    isDarkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
){

    // TODO: set colorSchemes
    val colors: ColorScheme

    if(isDynamicColors && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S ){

        val contextLocal = LocalContext.current
        colors = if(isDarkMode) dynamicDarkColorScheme(contextLocal) else dynamicLightColorScheme(contextLocal)

    } else {

        colors = when(theme){
            Themes.ORIGINAL -> if (isDarkMode) darkOriginalScheme else lightOriginalScheme
            Themes.NATURAL -> if (isDarkMode) darkNaturalScheme else lightNaturalScheme
            Themes.SEA -> if (isDarkMode) darkSeaScheme else lightSeaScheme
        }


    }


    // TODO: set typography

    MaterialTheme(
        colorScheme = colors,
        content = content
    )


}