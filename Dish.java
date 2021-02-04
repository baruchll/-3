import java.util.HashMap;

public class Dish {
    private String dishID;
    private String dishName;
    private HashMap <String, Double> ingredients;
    private int dishPrice;

    public Dish(String dishID, String dishName, HashMap<String, Double> ingredients, int dishPrice){
        this.dishID = dishID;
        this.dishName = dishName;
        this.ingredients = ingredients;
        this.dishPrice = dishPrice;
    }

    public String getDishID() {
        return dishID;
    }

    public void setDishID(String dishID) {
        this.dishID = dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public HashMap<String, Double> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Double> ingredients) {
        this.ingredients = ingredients;
    }

    public int getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(int dishPrice) {
        this.dishPrice = dishPrice;
    }
    public double profit(){
        Double p = 0.0;
        double sum = 0;
        for (Double i : ingredients.values()) {
            p += i.doubleValue();
            sum =dishPrice - p;
        }
        return sum;
    }

}