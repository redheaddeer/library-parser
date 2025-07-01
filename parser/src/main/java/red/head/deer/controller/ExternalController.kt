package red.head.deer.controller

import org.springframework.http.*

@RestController
@RequestMapping("/")
class ExternalController {
    @GetMapping("parse")
    fun parse(): ResponseEntity<Any>? {
        return null
    }
}