/*
 * Copyright 2019 vmadalin.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.vmadalin.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.vmadalin.core.extensions.setGone
import kotlinx.android.synthetic.main.activity_main.*

class SampleMainActivity : AppCompatActivity() {

    private val navController: NavController by lazy { findNavController(R.id.nav_host_fragment) }
    private val navigationFragmentsId = setOf(
        R.id.characters_list_fragment,
        R.id.characters_favorites_fragment
    )
    private val appBarConfiguration: AppBarConfiguration by lazy {
        AppBarConfiguration.Builder(navigationFragmentsId).build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupToolbar()
        setupBottomNavigation()
    }

    private fun setupToolbar() {
        setSupportActionBar(toolbar)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    private fun setupBottomNavigation() {
        navController.addOnDestinationChangedListener { _, destination, _ ->
            bottom_navigation.setGone(!navigationFragmentsId.contains(destination.id))
        }
        bottom_navigation.setupWithNavController(navController)
    }
}
