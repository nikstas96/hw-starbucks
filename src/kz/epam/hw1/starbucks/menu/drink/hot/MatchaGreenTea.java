package kz.epam.hw1.starbucks.menu.drink.hot;

public class MatchaGreenTea extends HotDrink {
    private boolean groundJapaneseGreenTea;

    public boolean isGroundJapaneseGreenTea() {
        return groundJapaneseGreenTea;
    }

    public void makeDrink() {
        super.makeDrink();
        setGroundJapaneseGreenTea(true);
        System.out.println(SIZE_OF_CUP + getSizeOfCup());
        System.out.println(MATCHA_GREEN_TEA + READY);
    }

    private void setGroundJapaneseGreenTea(boolean groundJapaneseGreenTea) {
        this.groundJapaneseGreenTea = groundJapaneseGreenTea;
    }

}
