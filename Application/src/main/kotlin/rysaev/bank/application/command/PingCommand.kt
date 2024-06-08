package rysaev.bank.application.command

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Chat
import org.telegram.telegrambots.meta.api.objects.User
import org.telegram.telegrambots.meta.generics.TelegramClient

class PingCommand : BotCommand("ping", "ping command") {
  override fun execute(telegramClient: TelegramClient, user: User, chat: Chat, strings: Array<out String>) {
    val answer = SendMessage(chat.id.toString(), "pong")
    telegramClient.execute(answer)
  }
}
