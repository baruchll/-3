import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Restaurant {
    String resName;
    HashMap<Ingredient,Double> ingredients;

    public Restaurant(String resName){
        this.resName = resName;
        this.ingredients = new HashMap<>();

        }

    void addIngredient(Ingredient i, double amount){
        ingredients.put(i,amount);
    }
    Double totalCost(){
        double sum = 0;
        for (Map.Entry<Ingredient, Double> i : ingredients.entrySet()) {
            sum += i.getKey().getIngPrice() * i.getValue();
        }

        return sum;
    }
    boolean isAvailable(Dish dish){
        for (Map.Entry<String, Double> i : dish.getIngredients().entrySet()){
            Ingredient temp = new Ingredient(null,"banana", 15.0);
            if(ingredients.containsKey(temp)){
                return true;
            }
        }
        return false;
    }
}