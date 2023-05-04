package com.twe.auth.dto.request

class AuthRequest (

){
    data class Issuance(
            val userId: Long,
            val password: String
    )
}