package rysaev.bank.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import rysaev.bank.application.config.BotProperties

@SpringBootApplication
@EnableConfigurationProperties(BotProperties::class)
class Application

fun main(args: Array<String>) {
  runApplication<Application>(*args)
}
