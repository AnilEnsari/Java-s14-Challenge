package WitBurgerComp;
public class DeluxeBurger extends  Hamburger{
    private String cips ;
    private String drink ;

    public DeluxeBurger( String meat, double price, String breadRollType) {
        super("DeluxeBurger", meat, price, breadRollType);

    }

    public String getCips() {
        return cips;
    }

    public void setCips(String cips) {
        this.cips = cips;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public DeluxeBurger( ) {
        super("DeluxeBurger", "double", 19.10, " Double Sandwich");


    }
    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("You cant add anything to DeluxeBurger!");
    }
    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("You cant add anything to DeluxeBurger!");
    }
    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("You cant add anything to DeluxeBurger!");
    }
    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("You cant add anything to DeluxeBurger!");
    }
}
