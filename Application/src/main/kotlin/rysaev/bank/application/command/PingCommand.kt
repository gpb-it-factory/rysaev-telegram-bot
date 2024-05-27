package rysaev.bank.application.command

import org.telegram.telegrambots.extensions.bots.commandbot.commands.BotCommand
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Chat
import org.telegram.telegrambots.meta.api.objects.User
import org.telegram.telegrambots.meta.generics.TelegramClient

class PingCommand : BotCommand("ping", "ping command") {
  override fun execute(p0: TelegramClient, p1: User, p2: Chat, p3: Array<out String>) {
    val answer = SendMessage(p2.id.toString(), "pong")
    p0.execute(answer)
  }
}
