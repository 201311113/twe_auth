package com.twe.auth.service

import com.twe.auth.dto.response.AuthResponse

interface AuthService {
    fun issuance():AuthResponse.Issuance
    fun reissuance():AuthResponse.Issuance
    fun validate(): AuthResponse.Validate
}