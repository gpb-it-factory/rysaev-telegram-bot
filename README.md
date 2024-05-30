# Описание проекта Telegram-Bot

Учебный проект Telegram Bot проекта Mini - Bank. 

Схема проекта состоит из трех слоев.
1. Frontend - Telegram Bot, клиенская часть
2. Middle - Сервис для обработки запросов клиента
3. Back - АБС

## UML - диаграмма

@startuml
actor Client as Client
Client -> TelegramBot: request
TelegramBot -> Controller: request
Controller -> Service: request
Service --> Controller : response
Controller --> TelegramBot: response
TelegramBot -> Client : request
@enduml

[![diagram](uml-diagram.png)]

## Стек

Kotlin 

Spring Boot