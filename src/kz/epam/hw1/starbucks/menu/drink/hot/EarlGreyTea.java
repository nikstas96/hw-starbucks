package kz.epam.hw1.starbucks.menu.drink.hot;

public class EarlGreyTea extends HotDrink implements Boiling {
    private boolean blackTea;
    private boolean bergamotEssence;
    private boolean lavenderFlowers;

    public boolean isLavenderFlowers() {
        return lavenderFlowers;
    }

    public void setLavenderFlowers(boolean lavenderFlowers) {
        this.lavenderFlowers = lavenderFlowers;
    }

    public boolean getBergamotEssence() {
        return bergamotEssence;
    }

    public void setBergamotEssence(boolean bergamotEssence) {
        this.bergamotEssence = bergamotEssence;
    }

    public boolean isBlackTea() {
        return blackTea;
    }

    public void addIngredientsForBlackTea() {
        setBergamotEssence(true);
        System.out.println("Добавлен экстракт бергамота");
        setLavenderFlowers(true);
        System.out.println("Лаванда добавлена");
    }

    public void makeDrink() {
        super.makeDrink();
        setBlackTea(true);
        addIngredientsForBlackTea();
        System.out.println(SIZE_OF_CUP + getSizeOfCup());
        System.out.println(EARL_GREY_TEA + READY);
    }

    private void setBlackTea(boolean blackTea) {
        this.blackTea = blackTea;
    }
}
