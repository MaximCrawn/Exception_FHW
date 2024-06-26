# Описание программы "Ввод данных о персоне и запись в файл"

Это простое консольное приложение на Java, которое позволяет пользователю вводить данные о персоне и записывать их в файл. Программа запрашивает у пользователя следующие данные о персоне:

- Фамилия
- Имя
- Отчество
- Дата рождения (в формате dd.mm.yyyy)
- Номер телефона (без форматирования)
- Пол (символ 'f' для женского и 'm' для мужского)

После ввода данных программа проверяет их на корректность и записывает в файл с названием, соответствующим фамилии персоны. Однофамильцы будут записаны в один и тот же файл, каждый в отдельную строку.

## Функционал программы

- Запрос у пользователя ввода данных о персоне.
- Проверка введенных данных на корректность по формату и количеству.
- Проверка наличия только кириллических символов для Фамилии, Имени и Отчества.
- Запись данных в файл с соответствующим именем персоны.
- Обработка ошибок ввода данных.
- Обработка исключений при записи в файл.

## Использование программы

1. Запустите программу.
2. Введите данные о персоне в соответствии с указанным форматом.
3. Данные будут записаны в файл.

## Технологии

- Java

## Как использовать

1. Клонируйте репозиторий с помощью команды `git clone`.
2. Откройте проект в вашей IDE.
3. Запустите класс `Main.java`.
4. Введите данные о персоне в консоли.
5. Проверьте файлы в директории проекта, чтобы убедиться, что данные были успешно записаны.

