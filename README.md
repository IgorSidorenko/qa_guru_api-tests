# Автоматизированные тесты для
https://reqres.in/
-----

## Содержание:

* <a href="#link-технологии-и-инструменты">Технологии и инструменты</a>
* <a href="#link-реализованные-проверки">Реализованные проверки</a>
* <a href="#link-сборка-в-jenkins">Сборка в Jenkins</a>
* <a href="#link-запуск-из-инструменты-командной-строки">Запуск из командной строки</a>
* <a href="#link-allure-отчет">Allure отчет</a>
* <a href="#link-интеграция с Allure Test Ops">Интеграция с Allure Test Ops</a>
* <a href="#link-отчет-в-telegram">Отчет в Telegram</a>



## Технологии и инструменты
В проекте используются:

<p align="center">
<img width="6%" src="images/logo/Java.svg">
<img width="6%" src="images/logo/Intelij_IDEA.svg">
<img width="6%" src="images/logo/Gradle.svg">
<img width="6%" src="images/logo/JUnit5.svg">
<img width="6%" src="images/logo/Jenkins.svg">
<img width="6%" src="images/logo/Selenide.svg">
<img width="6%" src="images/logo/Selenoid.svg">
<img width="6%" src="images/logo/GitHub.svg">
<img width="6%" src="images/logo/Allure_Report.svg">
<img width="6%" src="images/logo/Telegram.svg">
</p>

#### Список проверок, реализованных в автотестах
- [x] Вызов пользователя
- [x] Возвращение ошибки при отсутствии пароля
- [x] Вызов списка пользователей
- [x] Создание пользователя
- [x] Изменение данных пользователя
- [x] Удаление пользователя
- [x] Успешная регистрация пользователя
- [x] Проверка email в списке пользователей (Groovy)


## Сборка в Jenkins
Для удалённого запуска можно настроить запуск в Jenkins. Пример прогона:

<img src="images/screenshots/jenkins_report.png">

## Allure отчет
Результат прогона тестов можно посмотреть в отчёте. Информация в тесте представлена в виде шагов с действиями.

<img src="images/screenshots/test_example.png">

## Интеграция с Allure TestOps
<img src="images/screenshots/testops_example.png">

<img src="images/screenshots/testops_example2.png">

## Отчет в Telegram
Результат прохождения тестов отправляется в Telegram с помощью бота. Пример сообщения с отчётом:

<p align="center">
<img src="images/screenshots/telegram2.png">
</p>

