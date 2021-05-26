package example

import org.springframework.boot.runApplication
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class App

fun main(args: Array<String>) {
 runApplication<App>(*args)
}
