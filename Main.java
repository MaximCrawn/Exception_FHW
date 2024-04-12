package fhw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите данные в формате: Фамилия Имя Отчество дата_рождения(dd.mm.yyyy) номер_телефона пол(f/m)");
            String input = scanner.nextLine();

            PersonData person = InputParser.parseInput(input);
            if (person != null) {
                FileWriterHelper.writeToFile(person.getLastName() + ".txt", person.getLastName() + " " + person.getFirstName() + " " + person.getMiddleName() + " "
                        + person.getBirthDate() + " " + person.getPhoneNumber() + " " + person.getGender());
            }

            System.out.println("Желаете продолжить ввод? (yes/no)");
            String continueInput = scanner.nextLine().toLowerCase();
            if (!continueInput.equals("yes")) {
                break;
            }
        }
    }
}


