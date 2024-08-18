package guihbc.com.github.hello.controller

import guihbc.com.github.hello.domain.CreateUserRequest
import guihbc.com.github.hello.domain.CreateUserResponse
import guihbc.com.github.hello.usecase.UserUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userUseCase: UserUseCase) {
    @PostMapping(value = ["/user"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun createUser(@RequestBody body: CreateUserRequest): CreateUserResponse {
        return userUseCase.createUser("Guilherme");
    }
}
