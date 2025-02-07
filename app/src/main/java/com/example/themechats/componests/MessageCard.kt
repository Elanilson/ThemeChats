package com.example.themechats.componests



import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.themechats.models.MessageData


@Composable
fun MessageCard( message: MessageData ){

    Box(
        contentAlignment = if (message.isMine) Alignment.CenterEnd else Alignment.CenterStart,
        modifier = Modifier.fillMaxWidth()
    ) {

        Card(
            colors = CardDefaults.cardColors(
                containerColor = if (message.isMine) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.inversePrimary,
            ),
            modifier = Modifier.padding(16.dp).fillMaxWidth( fraction = 0.7f )
        ) {
            Text(text = message.text, Modifier.padding(16.dp))
        }
    }



}