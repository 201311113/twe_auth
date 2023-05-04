package com.twe.auth.controller

import com.twe.auth.dto.response.AuthResponse
import com.twe.auth.service.AuthService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/auth"])
class AuthController(
        private val authService: AuthService
) {
    @PostMapping("")
    fun issuance(
        @RequestBody
    ): AuthResponse.Issuance{
        return authService.issuance()
    }

    fun reissuance(

    ): AuthResponse.Issuance{
        return authService.issuance()
    }

    fun validateToken(
        token: String
    ): AuthResponse.Validate{
        return authService.validate()
    }

}