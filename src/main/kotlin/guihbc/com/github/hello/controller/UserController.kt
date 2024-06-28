package guihbc.com.github.hello.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @PostMapping(value = ["/user"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun createUser(): Any? {
        return null;
    }
}
