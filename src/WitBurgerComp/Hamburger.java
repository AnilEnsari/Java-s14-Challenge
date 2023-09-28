package WitBurgerComp;

public class Hamburger {
  private   String name;
    private  String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private  String addition4Name;
    private   double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public Hamburger(String name, double price, String breadRollType) {
        this.name = name;
        this.meat = "normal";
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String name, String meat, double price, String breadRollType, String addition1Name, double addition1Price) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType, String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType, String addition1Name, double addition1Price, String addition2Name, double addition2Price) {

        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType, String addition1Name, double addition1Price, String addition2Name, double addition2Price, String addition3Name, double addition3Price, String addition4Name, double addition4Price) {

        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public void itemizeHamburger() {
        double totalPrice = price+addition2Price+addition3Price+addition1Price+addition4Price;
        System.out.println(
                        "addition1=> Name: " + addition1Name + "Price: " + addition1Price + "\n" +
                        "addition2=> Name: " + addition2Name + "Price: " + addition2Price + "\n" +
                        "addition3=> Name: " + addition3Name + "Price: " + addition3Price + "\n" +
                        "addition4=> Name: " + addition4Name + "Price: " + addition4Price + "\n" +
                                "Toplam Ücret: " +totalPrice



        );

    }
}
