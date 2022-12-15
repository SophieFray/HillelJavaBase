package com.hillel.viarhiozov.homeworks.homework11;

import java.time.LocalDate;
import java.time.Period;


public class Person {
    //    not editable
    private String name;
    private LocalDate birthDate;
    private int age;
    private String email;
    private String phone;


    //    editable
    private String surname;
    private int weight;
    private String bloodPressure;
    private int stepsPerDay;


    public Person(String name, int year, int month, int dayOfMonth, String email, String phone, String surname, int weight, String bloodPressure, int stepsPerDay) {

        this.name = name;
        this.birthDate = LocalDate.of(year, month, dayOfMonth);
        this.age = Period.between(this.birthDate, LocalDate.now()).getYears();
        this.email = email;
        this.phone = phone;
        this.surname = surname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsPerDay = stepsPerDay;
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }


}
