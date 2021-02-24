package models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Recipes {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="RECIPE_ID")
    private long id;

    @Column (name = "RECIPE_TITLE")
    private String recipeTitle = "";

    @Column(name = "INGREDIENTS_ID")
    ArrayList<String> ingredients = new ArrayList<String>();

    private String recipeBody = "";
}
