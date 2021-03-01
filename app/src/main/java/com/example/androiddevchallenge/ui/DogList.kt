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

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.dummy.DogInfoDummy
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.glide.GlideImage

@ExperimentalFoundationApi
@Composable
fun DogList(navController: NavHostController) {
    Surface(color = MaterialTheme.colors.background) {
        MaterialTheme() {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = "Cute dogs", style = typography.h3)
                Spacer(modifier = Modifier.height(16.dp))
                LazyVerticalGrid(
                    cells = GridCells.Fixed(2)
                ) {
                    items(DogInfoDummy.dogs) { dog ->
                        Column(
                            modifier = Modifier
                                .clickable(
                                    onClick = {
                                        navController.navigate(Screen.Detail.route(dog.id))
                                    }
                                )
                                .padding(10.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            GlideImage(
                                modifier = Modifier
                                    .size(128.dp)
                                    .clip(CircleShape)
                                    .background(Color(0xFFDDDDEB))
                                    .border(2.dp, Color(0xFF2196F3), CircleShape),
                                data = dog.iconUrl,
                                contentDescription = dog.name,
                                loading = {
                                    Box(Modifier.matchParentSize()) {
                                        CircularProgressIndicator(Modifier.align(Alignment.Center))
                                    }
                                },
                                error = {
                                    Image(
                                        bitmap = ImageBitmap.imageResource(R.drawable.ic_error),
                                        contentDescription = "error",
                                    )
                                }
                            )
                            Box(
                                modifier = Modifier.padding(0.dp, 8.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .border(
                                            1.5.dp,
                                            color = Color.LightGray,
                                            shape = RoundedCornerShape(10.dp),
                                        )
                                        .fillMaxWidth()
                                        .background(Color(0x82B5BA))
                                        .padding(6.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = dog.name,
                                        textAlign = TextAlign.Center,
                                        style = typography.h6,
                                        maxLines = 1
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
