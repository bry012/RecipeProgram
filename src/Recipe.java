

public class Recipe {
	
	String name;
	String[] ingredients;
	String[] categories;
	String[] directions;
	
	Recipe(String _name, String[] _ingredients, String[] _categories, String[] _directions) {
		this.name = _name;
		this.ingredients = _ingredients;
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
	public void print() {
		System.out.println("--- " + name + " ---");
		
		System.out.println("\tIngredients:");
		for (int i = 0; i < ingredients.length; i++) {
			System.out.println("\t\t" + ingredients[i]);		//
		}
		System.out.println("\tCategories:");
		for (int c = 0; c < categories.length; c++) {
			System.out.println("\t\t" + categories[c]);			// Each of these goes through the array of strings and prints each
		}
		System.out.println("\tDirections:");
		for (int d = 0; d < directions.length; d++) {
			System.out.println("\t\t" + directions[d]);			//
		}
	}
	


}
