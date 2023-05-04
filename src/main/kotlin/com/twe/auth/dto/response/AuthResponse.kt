package com.twe.auth.dto.response

class AuthResponse (

){
    data class Issuance(
            val accessToken: String,
    )

    data class Validate(
            val isValid: Boolean
    )
}