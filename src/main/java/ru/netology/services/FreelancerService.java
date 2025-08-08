package ru.netology.services;

public class FreelancerService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;   // месяцев отдыха
        int money = 0;   // деньги на счету

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {     // отдых
                count++;
                money = money - expenses; // обязательные траты
                money = money / 3;        // остаётся треть после отдыха
            } else {                      // работа
                money = money + income - expenses;
            }
        }
        return count;
    }
}