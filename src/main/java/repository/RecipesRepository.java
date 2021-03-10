package repository;

import models.RecipesModels;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesRepository extends CrudRepository <RecipesModels, Long> {

    RecipesModels getRecipesByName(String recipeTitle);

}
