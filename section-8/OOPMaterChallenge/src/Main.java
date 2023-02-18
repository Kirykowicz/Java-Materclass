public class Main {
    public static void main(String[] args) {
//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("large");
//        coke.printItem();
//
//        Item avocado = new Item("Topping", "avocado", 1.5);
//        avocado.printItem();

//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("bacon", "cheese", "mayo");
//        burger.printItem();

//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("Large");
//        regularMeal.printItemizedList();
//
//        MealOrder secondMeal = new MealOrder("turkey", "7-UP", "chili");
//        secondMeal.addBurgerToppings("lettuce", "cheese", "mayo");
//        secondMeal.setDrinkSize("small");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "7-UP", "chili");
        deluxeMeal.addBurgerToppings("Avocado", "bacon", "lettuce", "cheese", "mayo");
        deluxeMeal.setDrinkSize("small");
        deluxeMeal.printItemizedList();
    }
}
