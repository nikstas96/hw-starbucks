package kz.epam.hw1.starbucks.menu.drink.hot;

import kz.epam.hw1.starbucks.menu.drink.StarbucksDrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotDrink extends StarbucksDrink implements Boiling {
    final static String AMERICANO = "Americano";
    final static String CAPPUCCINO = "Cappuccino";
    final static String EARL_GREY_TEA = "EarlGreyTea";
    final static String MATCHA_GREEN_TEA = "MatchaGreenTea";
    private static int hotDrinkChoice;
    private int water;
    private boolean sugar;

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public static void hotDrinkChoice() {
        BufferedReader forHotDrinkChoice = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(DRINK_CHOICE +
                "1 - " + AMERICANO + "\n" +
                "2 - " + CAPPUCCINO + "\n" +
                "3 - " + EARL_GREY_TEA + "\n" +
                "4 - " + MATCHA_GREEN_TEA + "\n");
        try {
            hotDrinkChoice = Integer.parseInt(forHotDrinkChoice.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        HotDrink.preparingToMakeHotDrink();
    }

    private static void preparingToMakeHotDrink() {
        HotDrink hotDrink = new HotDrink();
        switch (hotDrinkChoice) {
            case (1):
                hotDrink = new Americano();
                break;
            case (2):
                hotDrink = new Cappuccino();
                break;
            case (3):
                hotDrink = new EarlGreyTea();
                break;
            case (4):
                hotDrink = new MatchaGreenTea();
                break;
            default:
                hotDrinkChoice();
                break;
        }
        hotDrink.setSizeOfCup();
        hotDrink.makeDrink();
    }

    public void addSugar() {
        System.out.println("Хотите ли вы добавить сахар? 1 - Да, 2 - Нет");
        try (BufferedReader addSugar = new BufferedReader(new InputStreamReader(System.in))) {
            if (Integer.parseInt(addSugar.readLine()) == 1) {
                setSugar(true);
                System.out.println("Сахар добавлен");
            } else setSugar(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void makeDrink() {
        addSugar();
        getBoiledLiquid();
    }

    @Override
    public void getBoiledLiquid() {
        setWater(100);
        System.out.println("Вода кипятится");
    }
}
