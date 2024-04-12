package fhw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputParser {
    public static PersonData parseInput(String input) {
        // Проверка на кириллицу для Фамилии, Имени и Отчества
        Pattern pattern = Pattern.compile("[а-яА-ЯёЁ\\s]+");
        Matcher matcher = pattern.matcher(input);
        if (!matcher.find()) {
            System.out.println("Ошибка: Фамилия, Имя и Отчество должны содержать только кириллические символы.");
            return null;
        }

        String[] parts = input.split(" ");
        if (parts.length != 6) {
            System.out.println("Ошибка: Неверное количество данных. Должно быть 6 значений.");
            return null;
        }

        String lastName = parts[0];
        String firstName = parts[1];
        String middleName = parts[2];
        String birthDate = parts[3];
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(parts[4]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат номера телефона.");
            return null;
        }
        char gender = parts[5].charAt(0);
        if (gender != 'f' && gender != 'm') {
            System.out.println("Ошибка: Неверный формат пола. Используйте 'f' или 'm'.");
            return null;
        }

        return new PersonData(lastName, firstName, middleName, birthDate, phoneNumber, gender);
    }
}

