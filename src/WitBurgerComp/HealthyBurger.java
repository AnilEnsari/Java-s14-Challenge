package WitBurgerComp;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, "Tofu", price, breadRollType);
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


        StringBuilder builder = new StringBuilder();
        if (healthyExtra1Name != null) {
            builder.append("HealthyAddition1: " + healthyExtra1Name);
            super.setPrice(getPrice() + healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            builder.append("HealthyAddition2: " + healthyExtra2Name);
            super.setPrice(getPrice() + healthyExtra2Price);
        }
        super.itemizeHamburger();
        System.out.println(builder);

    }
}
