# Автоматизированные тесты для
https://reqres.in/
-----

## Содержание:

* <a>Технологии и инструменты</a>
* <a>Реализованные проверки</a>
* <a>Сборка в Jenkins</a>
* <a>Запуск из командной строки</a>
* <a>Allure отчет</a>
* <a>Интеграция с Allure Test Ops</a>
* <a>Отчет в Telegram</a>



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

## Запуск из командной строки

Реализована возможность как локального, так и удалённого запуска.

Для запуска используется команда: <code>gradle clean test</code>

В отдельный config-file вынесены настройки для запуска: адрес сайта, основной путь, одинаковый для всех тестов.

Пример файла с настройками можно посмотреть в src/test/resources/config, файл exampleCredentials.properties.

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

