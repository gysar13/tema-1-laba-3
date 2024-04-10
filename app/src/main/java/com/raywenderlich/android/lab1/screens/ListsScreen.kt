package com.raywenderlich.android.lab1.screens

import android.net.wifi.aware.AwareResources
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

private val items = listOf(
    BookCategory(
        R.string.android,
        listOf(
            R.drawable.android_aprentice,
            R.drawable.saving_data_android,
            R.drawable.advanced_architecture_android
        )
    ),
    BookCategory(
        R.string.kotlin,
        listOf(
            R.drawable.kotlin_coroutines,
            R.drawable.kotlin_apentice
        )
    ),
    BookCategory(
        R.string.swift,
        listOf(
            R.drawable.combine,
            R.drawable.rx_swift,
            R.drawable.swift_apperentice
        )
    ),
    BookCategory(
        R.string.ios,
        listOf(
            R.drawable.care_data,
            R.drawable.ios_apperentice
        )
    )
)

@Composable
fun ListScreen()
{
    MyList()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyList()
{
    //TODO
}

@Composable
fun ListItem(bookCategory: BookCategory, modifier: Modifier = Modifier)
{
    // TODO
}

data class BookCategory(
    @StringRes
    val categoryResourceId: Int,
    val bookImageResources: List<Int>
)
