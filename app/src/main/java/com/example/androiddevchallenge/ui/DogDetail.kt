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
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.dummy.DogInfoDummy
import com.example.androiddevchallenge.ui.theme.typography
import dev.chrisbanes.accompanist.glide.GlideImage

@ExperimentalFoundationApi
@Composable
fun DogDetail(navController: NavHostController, id: Int = 0) {
    val dog = DogInfoDummy.dog(id)
    val scroll = rememberScrollState(0)
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            IconButton(
                onClick = { navController.popBackStack() },
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 10.dp)
                    .size(36.dp)
                    .background(
                        color = Color(0xff121212).copy(alpha = 0.32f),
                        shape = CircleShape
                    )
            ) {
                Icon(
                    imageVector = Icons.Outlined.ArrowBack,
                    contentDescription = null
                )
            }
            GlideImage(
                modifier = Modifier
                    .size(54.dp)
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
            Text(
                text = dog.name,
                style = typography.h4,
                modifier = Modifier.padding(horizontal = 4.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            modifier = Modifier.verticalScroll(scroll)
        ) {
            Column() {
                Text(
                    text = dog.desc,
                    style = typography.body1
                )
                Spacer(modifier = Modifier.height(16.dp))
                GlideImage(
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillWidth,
                    data = dog.imageUrl,
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
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}
