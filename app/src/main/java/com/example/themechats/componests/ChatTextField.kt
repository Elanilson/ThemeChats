package com.example.themechats.componests



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ChatTextField(
    textInputMessage: String,
    onChangeValueTextInput: (String) -> Unit,
    onSendMessage: () -> Unit
) {


    // TextField
    Box(
        modifier = Modifier.padding( horizontal = 16.dp).imePadding()
    ) {
        OutlinedTextField(
            placeholder = { Text(text = "Enter your message") },
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = MaterialTheme.colorScheme.primaryContainer,
                    shape = MaterialTheme.shapes.large,
                ),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
            ),
            trailingIcon = {
                IconButton(
                    enabled = textInputMessage.isNotEmpty(),
                    onClick = {
                        onSendMessage()
                    }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Default.Send,
                        contentDescription = "Send message"
                    )
                }
            },
            value = textInputMessage, onValueChange = {
                onChangeValueTextInput(it)
            })


    }

}