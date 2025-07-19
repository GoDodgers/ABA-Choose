package com.example.abachoose.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun AnimatedDialog(
    correctAnswer: Boolean,
    buttonAction: () -> Unit,
    onDismissRequest: () -> Unit
) {
    AnimatedTransitionDialog(onDismissRequest = onDismissRequest) { animatedTransitionDialogHelper ->
        Surface(
            shape = RoundedCornerShape(10.dp),
            color = MaterialTheme.colorScheme.surface,
            modifier = Modifier
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(16.dp)
            ) {
                if (correctAnswer) {
                    Text("You Have Choosen Wisely")
                } else {
                    Text("You Have Choosen Poorly")
                }

                Button(
                    onClick = {
                        buttonAction.invoke()
                        animatedTransitionDialogHelper::triggerAnimatedDismiss.invoke()
                    }
                ) {
                    if (correctAnswer) {
                        Text("Yay!")
                    } else {
                        Text("Dismiss")
                    }
                }
            }
        }
    }
}
