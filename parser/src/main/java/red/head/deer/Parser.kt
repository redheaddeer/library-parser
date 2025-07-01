package red.head.deer

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Parser

fun main(args: Array<String>) {
    runApplication<Parser>(*args)
}
