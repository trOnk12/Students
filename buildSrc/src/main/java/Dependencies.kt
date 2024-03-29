object DefaultConfig {
    const val compiledSdkVersion = 29
    const val buildToolsVersion = "29.0.2"
    const val applicationId = "com.example.espeo"
    const val minSdkVersion = 21
    const val targetSdkVersion = 29
    const val versionCode = 1
    const val versionName = "1.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object Versions {
    const val kotlinStd = "1.3.31"
    const val appCompat = "1.1.0"
    const val coreKtx = "1.1.0"

    const val constraintLayout = "1.1.3"
    const val recyclerView = "1.0.0"
    const val lifeCycle = "2.1.0"
    const val lifeCycleViewModel = "2.1.0"

    const val dagger = "2.25.2"
    const val daggerCompiler = "2.25.2"

    const val rxjava = "2.2.14"
    const val rxjavaAndroid = "2.1.1"

    const val retrofit = "2.6.1"
    const val gson = "2.8.6"
    const val gsonConverter = "2.6.2"
    const val httpLoggingInterceptor = "4.2.1"
    const val retrofitRxAdapter = "2.6.2"

    const val junit = "4.12"
    const val assertjCore = "3.12.2"
    const val mockitoKotlin = "2.1.0"
    const val mockitoInline = "3.0.0"
    const val testRunner = "1.2.0"
    const val espressoCore = "3.2.0"
}

object StandardLibraries {
    const val kotlinStd = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlinStd}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
}

object ExternalLibaries {
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.daggerCompiler}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitRxAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofitRxAdapter}"
    const val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.httpLoggingInterceptor}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}"

    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    const val rxjavaAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxjavaAndroid}"

    const val lifeCycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycle}"
    const val lifeCycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycleViewModel}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val assertjCore = "org.assertj:assertj-core:${Versions.assertjCore}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val mockitoInline = "org.mockito:mockito-inline:${Versions.mockitoInline}"
    const val lifecycleTesting = "androidx.arch.core:core-testing:${Versions.lifeCycle}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
}