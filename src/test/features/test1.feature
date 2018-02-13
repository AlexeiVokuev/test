# language: ru
@runme
Функционал: Логин и разлогин
  Предыстория:

  Структура сценария:
    И открыть главную страницу Yandex
      И войти с почтой <login> и паролем <password>
      То открыта почта Yandex <login>
    И выйти из почты Yandex
    То открыта главная Yandex

    И открыть главную страницу VK
      И войти в VK с почтой <login_vk> и паролем <password_vk>
      То открыта VK новости
      И пользователь <vk_name> авторизован
      И перейти в VK на страницу профиля

    И выйти из VK
    То открыта VK

Примеры:
|login|password|login_vk|password_vk|vk_name|
|baranov.jet119|123Abcdef|testmailatg@gmail.com|atgsmoke123|