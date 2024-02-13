package edu.step.oop;

public class Product {
    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId){
        this.productId = productId;
    }
    public Product(int productId, String name, double price){
        this(productId);
        this.name = name;
        this.price = price;
    }
    public Product(int productId, String name, double price, int quantity){
        this(productId, name, price);
        this.quantity = quantity;
    }


    public int getProductId(){
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void cantQuantity(int newQuantity){
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
            System.out.println("Stocul produsului " + name + " a fost actualizat la " + newQuantity + " bucăți.");
        } else {
            System.out.println("Eroare! Cantitatea trebuie să fie un număr pozitiv.");
        }
    }

    public static void main(String[] args) {
        Product printer = new Product(1, "Canon Printer", 520.50, 2);

        System.out.println("ID:" + printer.getProductId() +" Nume:"+printer.getName() + " Pret:" + printer.getPrice() + " Cantitate:"+ printer.getQuantity());

        printer.cantQuantity(4);
    }
}
