package rysaev.bank.application.updateshandlers

import java.lang.String
import java.util.function.Supplier
import org.springframework.stereotype.Component
import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient
import org.telegram.telegrambots.extensions.bots.commandbot.CommandLongPollingTelegramBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update
import rysaev.bank.application.command.PingCommand
import rysaev.bank.application.config.BotProperties

@Component
class CommandsHandler(botProperties: BotProperties) :
  CommandLongPollingTelegramBot(OkHttpTelegramClient(botProperties.token), true,
    Supplier { botProperties.username }) {
  init {
    register(PingCommand())
  }

  override fun processNonCommandUpdate(p0: Update) {
    val textOfMessage = p0.message?.text ?: return
    val echoMessage = SendMessage(
      String.valueOf(p0.message.chatId),
      """
       Hey heres your message:
       $textOfMessage
       from ${Thread.currentThread().name}
       """.trimIndent()
    )
    telegramClient.execute(echoMessage)
  }
}

