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

plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

repositories {
    google()
    jcenter()
    mavenCentral()
    maven("https://maven.fabric.io/public")
    maven("https://plugins.gradle.org/m2/")
    maven("https://ci.android.com/builds/submitted/5837096/androidx_snapshot/latest/repository")
    gradlePluginPortal()
}


dependencies {
    implementation("com.android.tools.build:gradle:3.4.2")
    implementation("org.jetbrains.kotlin:kotlin-allopen:1.3.50")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.50")
    implementation("com.github.ben-manes:gradle-versions-plugin:0.22.0")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.1.0-beta02")
    implementation("com.vanniktech:gradle-android-junit-jacoco-plugin:0.15.0")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.0.1")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:0.9.18")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:3.24.1")
    implementation("io.fabric.tools:gradle:1.31.0")
    implementation("com.pinterest:ktlint:0.34.2")
}