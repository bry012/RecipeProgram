import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */

/**
 * @author bryan
 *
 */

public class Search {

	public static ArrayList<Recipe> searchByName(String searchedString,ArrayList<Recipe> recipeArray){
		
		ArrayList<Recipe> foundRecipesArray = new ArrayList<Recipe>();
		for (Recipe recipe : recipeArray){
			if(recipe.getName().toLowerCase().contains(searchedString.toLowerCase())){
				foundRecipesArray.add(recipe);
			}
		}
		
		return foundRecipesArray;
		
	}
	
	public static ArrayList<Recipe> searchByIngredient(String searchedString,ArrayList<Recipe> recipeArray){
		
		ArrayList<Recipe> foundRecipesArray = new ArrayList<Recipe>();
		for (Recipe recipe : recipeArray){
			for (String ingredient : recipe.getIngredients()){
				if(ingredient.toLowerCase().contains(searchedString.toLowerCase())){
					foundRecipesArray.add(recipe);
					break;
				}
			}
		}
		
		return foundRecipesArray;
		
	}
	
	public static ArrayList<Recipe> searchByCategory(String searchedString,ArrayList<Recipe> recipeArray){
		
		ArrayList<Recipe> foundRecipesArray = new ArrayList<Recipe>();
		for (Recipe recipe : recipeArray){
			for (String category : recipe.getCategories()){
				if(category.toLowerCase().contains(searchedString.toLowerCase())){
					foundRecipesArray.add(recipe);
					break;
				}
			}
		}
		
		return foundRecipesArray;
		
	}
	
	public static ArrayList<String> findCategories(ArrayList<Recipe> recipeArray){
		ArrayList<String> categoryList = new ArrayList<String>();
		categoryList.add("Test");
		boolean copy = false;
		for (Recipe recipe : recipeArray){
			for (String category : recipe.getCategories()){
				copy = true;
				for (int i = 0; i < categoryList.size(); i++) {
					if (category.toLowerCase().equals(categoryList.get(i).toLowerCase())) {
						copy = false;
					}
				}
				if (copy) {
					categoryList.add("" + category + "");
				}
			}
		}
		categoryList.remove(0);
		return categoryList;
		
		
	}
        
        public static ArrayList<String> sortAlphabetical(ArrayList<Recipe> recipeArray){
            ArrayList<String> alphabeticalList = new ArrayList<String>();
            
            for(Recipe recipe : recipeArray)
            {
                alphabeticalList.add(recipe.getName());
            }
            
            Collections.sort(alphabeticalList);
            
            return alphabeticalList;
        }
	
	
	
	
}
