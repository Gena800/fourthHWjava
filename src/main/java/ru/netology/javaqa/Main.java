package ru.netology.javaqa;


public class Main {
    public static void main(String[] args) {
        BonusService Service = new BonusService();
        long amount = 100;
        boolean registered = false;
        long y = Service.calculate(amount, registered);

        System.out.println(y);
    }
}