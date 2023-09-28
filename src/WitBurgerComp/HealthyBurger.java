package WitBurgerComp;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger( String meat, double price, String breadRollType) {
        super("HealthyBurger", meat, price, breadRollType);
    }

    public HealthyBurger(String name, String meat, double price, String breadRollType, String healthyExtra1Name, double healthyExtra1Price) {
        super(name, meat, price, breadRollType);
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public HealthyBurger(String name, String meat, double price, String breadRollType, String healthyExtra1Name, double healthyExtra1Price, String healthyExtra2Name, double healthyExtra2Price) {
        super(name, meat, price, breadRollType);
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {

        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;

    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {

        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;

    }

    public void itemizeHamburger() {
        double totalPrice = getPrice()+ getAddition1Price()+getAddition2Price()+getAddition3Price()+getAddition4Price()+healthyExtra1Price + healthyExtra2Price;
        System.out.println(
                "HealthyAddition1=> Name: " + healthyExtra1Name + "Price: " + healthyExtra1Price + "\n" +
                        "HealthyAddition2=> Name: " + healthyExtra2Name + "Price: " + healthyExtra2Price + "\n" +

                        "Toplam Ücret: " + totalPrice


        );
    }
}
