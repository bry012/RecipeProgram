

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
	


}
