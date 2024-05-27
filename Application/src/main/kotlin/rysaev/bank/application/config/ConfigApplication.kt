package rysaev.bank.application.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.telegram.telegrambots.longpolling.TelegramBotsLongPollingApplication
import rysaev.bank.application.updateshandlers.CommandsHandler

@Configuration
class ConfigApplication() {

  @Bean
  fun telegramBotApi(botProperties: BotProperties): TelegramBotsLongPollingApplication {
    val botApplication = TelegramBotsLongPollingApplication()
    botApplication.registerBot(botProperties.token, CommandsHandler(botProperties))
    return botApplication;
  }
}
