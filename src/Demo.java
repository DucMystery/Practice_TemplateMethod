public class Demo {

    public synchronized static void main(String[] args) {
        System.out.println("============================================");
        Meal meal1 = new HamburgerMeal();
        meal1.doMeal();
        System.out.println("============================================");
        Meal meal = new TacoMeal();
        meal.doMeal();
    }
}
