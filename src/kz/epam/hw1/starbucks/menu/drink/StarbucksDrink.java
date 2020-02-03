package kz.epam.hw1.starbucks.menu.drink;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class StarbucksDrink {
    protected final static String READY = " Готов";
    protected static final String SIZE_OF_CUP = "Размер вашего напитка в мл - ";
    protected static final String BREWED_ESPRESSO = "Добавлены зерна, кофе варится";
    protected static final String DRINK_CHOICE = "Выберите напиток:\n";
    private int sizeOfCup;

    public abstract void makeDrink();

    public void setSizeOfCup() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите размер:\n" +
                "1 - 240ml\n" +
                "2 - 360ml\n" +
                "3 - 480ml\n" +
                "4 - 600ml");
        try {
            switch (Integer.parseInt(reader.readLine())) {
                case (1):
                    sizeOfCup = 240;
                    break;
                case (2):
                    sizeOfCup = 360;
                    break;
                case (3):
                    sizeOfCup = 480;
                    break;
                case (4):
                    sizeOfCup = 600;
                    break;
                default:
                    setSizeOfCup();
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected int getSizeOfCup() {
        return sizeOfCup;
    }

}
