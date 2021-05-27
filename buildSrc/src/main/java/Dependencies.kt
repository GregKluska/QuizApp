object Dependencies {

    val appKaptLibraries = arrayListOf<String>().apply {
        add(Google.hilt_compiler)
    }

    val appLibraries = arrayListOf<String>().apply {
        add(Jetbrains.kotlin_stdlib)
        add(Square.retrofit)
        add(Square.retrofit_gson)
        add(Google.hilt_android)
    }

    val androidTestLibraries = arrayListOf<String>().apply {}

    val testLibraries = arrayListOf<String>().apply {
        add(UnitTest.jupiter_api)
        add(UnitTest.jupiter_engine)
    }
}
