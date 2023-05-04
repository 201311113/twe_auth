package com.twe.auth.common.utils

import javax.crypto.SecretKey

object JwtUtils {

    private val secretKey: SecretKey

    fun generateToken(type: TokenType, userId: Long, ): String{

    }

    fun validateToken(token: String): Boolean{

    }

    fun getUserId(token: String): Long{

    }

    enum class TokenType{
        ACCESS,
        REFRESH
    }
}