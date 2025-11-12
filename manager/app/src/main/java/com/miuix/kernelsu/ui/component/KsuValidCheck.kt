package com.miuix.kernelsu.ui.component

import androidx.compose.runtime.Composable
import com.miuix.kernelsu.Natives
import com.miuix.kernelsu.ksuApp

@Composable
fun KsuIsValid(
    content: @Composable () -> Unit
) {
    val isManager = Natives.becomeManager(ksuApp.packageName)
    val ksuVersion = if (isManager) Natives.version else null

    if (ksuVersion != null) {
        content()
    }
}
