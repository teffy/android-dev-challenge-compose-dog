/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.annotation.StringRes
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R

sealed class Screen(val route: String, @StringRes val id: Int) {
    object List : Screen("List", R.string.list)
    object Detail : Screen("Detail/{id}", R.string.detail) {
        const val KEY_ID = "id"

        fun route(id: Int): String {
            return "Detail/$id"
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun DogApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.List.route) {
        composable(Screen.List.route) { DogList(navController) }
        composable(
            Screen.Detail.route,
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                }
            )
        ) {
            it.arguments?.getInt(Screen.Detail.KEY_ID)?.let { it1 -> DogDetail(navController, it1) }
        }
    }
}
