package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int treshold) {
        int wallet = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (wallet >= treshold) {
                wallet -= expenses;
                wallet /= 3;
                counter++;
            } else {
                wallet += income;
                wallet -= expenses;
            }

        }
        return counter;
    }
}



