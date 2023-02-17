public class Main {
    public static void main(String[] args) {
        Item coke = new Item("drink", "coke", 1.50);
        coke.printItem();
        coke.setSize("large");
        coke.printItem();

        Item avocado = new Item("Topping", "avocado", 1.5);
        avocado.printItem();
    }
}
