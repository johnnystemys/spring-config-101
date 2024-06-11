package ch.jdc.spring_config_101

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringConfig101Application

fun main(args: Array<String>) {
	runApplication<SpringConfig101Application>(*args)
}
