package kz.epam.hw1.starbucks.menu.drink.hot;

public class Cappuccino extends HotDrink {
    private boolean brewedEspresso;
    private int milk;

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public boolean isBrewedEspresso() {
        return brewedEspresso;
    }

    public void makeDrink() {
        addSugar();
        getBoiledLiquid();
        setBrewedEspresso(true);
        System.out.println(BREWED_ESPRESSO);
        System.out.println(SIZE_OF_CUP + getSizeOfCup());
        System.out.println(CAPPUCCINO + READY);
    }

    @Override
    public void getBoiledLiquid() {
        setMilk(100);
        System.out.println("Молоко кипятится");
    }

    private void setBrewedEspresso(boolean brewedEspresso) {
        this.brewedEspresso = brewedEspresso;
    }
}
