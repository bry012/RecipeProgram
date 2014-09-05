

public class Recipe {
	
	String name;
	String[] ingredients;
    String[] ingredientAmounts;
	String[] categories;
	String[] directions;
	
	Recipe(String _name, String[] _ingredients, String[] _ingredientAmounts, String[] _categories, String[] _directions) {
		this.name = _name;
		this.ingredients = _ingredients;
        this.ingredientAmounts = _ingredientAmounts;
		this.categories = _categories;
		this.directions = _directions;
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public String[] getCategories(){
		return this.categories;
		
	}
	
	public String[] getIngredients(){
		return this.ingredients;
		
	}
    
    public String[] getIngredientsAndAmounts(){
        java.util.ArrayList<String> ingredientsAndAmounts = new java.util.ArrayList<String>();
        for (int i = 0; i < this.ingredients.length; i++) {
            ingredientsAndAmounts.add(this.ingredientAmounts[i] + " " + this.ingredients[i]);
        }
        return ingredientsAndAmounts.toArray(new String[ingredientsAndAmounts.size()]);
    }
	public String toString() {
		String output = "\n--- " + name + " ---";
		
		output += "\n\tIngredients:";
        String[] myIngredients = this.getIngredientsAndAmounts();
		for (int i = 0; i < myIngredients.length; i++) {
			output += "\n\t\t" + myIngredients[i];		//
		}
		output += "\n\tCategories:";
		for (int c = 0; c < categories.length; c++) {
			output += "\n\t\t" + categories[c];			// Each of these goes through the array of strings and prints each
		}
		output += "\n\tDirections:";
		for (int d = 0; d < directions.length; d++) {
			output += "\n\t\t" + directions[d];			//
		}
		
		return output;
	}
	


}
