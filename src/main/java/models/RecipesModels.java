package models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class RecipesModels {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="RECIPE_ID")
    private long id;

    @Column (name = "RECIPE_TITLE")
    private String recipeTitle = "";

    @Column(name = "INGREDIENTS_ID")
    ArrayList<String> ingredients = new ArrayList<String>();

    @Column(name = "RECIPE_BODY")
    private String recipeBody = "";

    public long getid(){
        return id;
    }

    public void setid(){
        this.id = id;
    }

    public String getRecipeTitle(){
        return recipeTitle;
    }

    public void setRecipeTitle(){
        this.recipeTitle = recipeTitle;
    }


    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(){
        this.ingredients = ingredients;
    }

    public String getRecipeBody(){
        return recipeBody;
    }

    public void setRecipeBody(){
        this.recipeBody = recipeBody;
    }


}
