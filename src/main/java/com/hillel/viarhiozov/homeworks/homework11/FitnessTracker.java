package com.hillel.viarhiozov.homeworks.homework11;

public class FitnessTracker {
    public static void main(String[] args) {

        Person _1 = new Person("Alex", 1995, 9, 3, "mr.acksel@gmail.com", "063 697 59 16",
                "Volkov", 76, "130/70", 5489);


        Person _2 = new Person("Fedor", 1905, 12, 4, "fedor@gmail.com", "063 25 25 266",
                "Puch", 120, "140/80", 12365);


        Person _3 = new Person("Sophie", 2001, 1, 1, "Fray@gmail.com", "063 000 00 01",
                "Fray", 45, "110/70", 489);


        Person _4 = new Person("Gladis", 1886, 1, 4, "Glad@gmail.com", "063 697 55 55",
                "Glad", 56, "170/70", 59);


        printAccountInfo(_1);
        printAccountInfo(_2);
        printAccountInfo(_3);
        printAccountInfo(_4);

        _3.setWeight(12);
        _3.setBloodPressure("140/50");
        printAccountInfo(_3);

        _4.setStepsPerDay(10);
        printAccountInfo(_4);

    }

    public static void printAccountInfo(Person person) {
        System.out.println("\nName: " + person.getName() + "\nSurname: " + person.getSurname() + "\nBirthDate: "
                + person.getBirthDate() + "Age: " + person.getAge() + "\nEmail: " +
                person.getEmail() + "\nPhone: " + person.getPhone() + "\nWeight: " + person.getWeight() +
                "\nBlood Pressure: " + person.getBloodPressure() + "\nSteps Per Day: " + person.getStepsPerDay());
    }

}
