package kz.epam.hw1.starbucks.menu.drink.hot;

public class Americano extends HotDrink {
    private boolean brewedEspresso;

    public boolean isBrewedEspresso() {
        return brewedEspresso;
    }

    public void makeDrink() {
        super.makeDrink();
        setBrewedEspresso(true);
        System.out.println(BREWED_ESPRESSO);
        System.out.println(SIZE_OF_CUP + getSizeOfCup());
        System.out.println(AMERICANO + READY);
    }

    private void setBrewedEspresso(boolean brewedEspresso) {
        this.brewedEspresso = brewedEspresso;
    }
}
