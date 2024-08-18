package guihbc.com.github.hello.usecase

import guihbc.com.github.hello.domain.CreateUserResponse
import org.springframework.stereotype.Service

@Service
class UserUseCase {
    fun createUser(name: String): CreateUserResponse {
        return CreateUserResponse("Hello, $name from kotlin!")
    }
}
