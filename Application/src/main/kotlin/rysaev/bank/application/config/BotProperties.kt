package rysaev.bank.application.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "bot.config")
data class BotProperties(val token: String, val username: String)
