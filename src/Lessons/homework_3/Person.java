package Lessons.homework_3;

public class Person {

    String surname;
    String name;
    String patronymic;

    public Person(String name, String surname, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public Person(String surnameNamePatronymic) {
        String[] fullNameOfThePerson;
        String delimeter = " ";
        fullNameOfThePerson = surnameNamePatronymic.split(delimeter);
        this.surname = fullNameOfThePerson[0];
        this.name = fullNameOfThePerson[1];
        this.patronymic = fullNameOfThePerson[2];
    }

    @Override
    public String toString() {
        return "Person{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
