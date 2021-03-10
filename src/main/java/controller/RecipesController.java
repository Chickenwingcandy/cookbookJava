package controller;

import models.RecipesModels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.RecipesRepository;
import services.RecipesService;

import java.util.ArrayList;

@RestController
public class RecipesController {

    private RecipesService recipesService = new RecipesService();

    @Autowired
    private RecipesRepository recipesRepository;

    @CrossOrigin
    @RequestMapping(value = "/recipes/{recipeTitle}")
    public RecipesModels getRecipeTitle (@PathVariable String recipeTitle){
        return recipesRepository.getRecipesByName(recipeTitle);
    }

    @CrossOrigin
    @PathVariable(value = "/createRecipe", method = RequestMethod.POST)
    public RecipesModels createRecipe(@RequestParam String recipeTitle, @RequestParam String recipeBody,@RequestParam ArrayList<String> ingredients){
        RecipesModels recipesModels = new RecipesModels();
        recipesModels.setRecipeTitle();

        return recipesModels;
    }
}
