package kz.epam.hw1.starbucks.order;

import kz.epam.hw1.starbucks.menu.drink.hot.HotDrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Order {
    private int drinkTypeChoice;

    public void makeOrder() {
        drinkTypeChoice();
    }

    private void drinkTypeChoice() {
        BufferedReader forDrinkChoice = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Для выбора горячих напитков нажмите 1\n" +
                    "Для выбора холодных напитков нажмите 2\n");
            drinkTypeChoice = Integer.parseInt(forDrinkChoice.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (drinkTypeChoice == 1) {
            HotDrink.hotDrinkChoice();
        } else if (drinkTypeChoice == 2) {
            //тут для холодных напитков
        } else {
            drinkTypeChoice();
        }
    }
}
