package org.gdsc_android.picky_panda.data

data class ResponseLoginData(
    val code: Int,
    val message: String,
){
    data class Data(
        val socialId: String,
        val accessToken: String,
        val refreshToken: String
    )
}