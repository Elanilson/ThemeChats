package com.example.themechats

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.themechats.apptheme.AppTheme
import com.example.themechats.enums.Themes
import com.example.themechats.ui.theme.ThemeChatsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {

            var themeSelected by rememberSaveable {
                mutableStateOf<Themes>( Themes.ORIGINAL )
            }

            AppTheme(
                theme = themeSelected
            ) {
                ChatScreen( changeTheme = {
                    themeSelected = it
                } )
            }

        }
    }
}
