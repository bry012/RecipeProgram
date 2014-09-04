import java.util.ArrayList;
import java.util.Scanner;


/*
 * 
 *	Pardon my java, haven't used it all summer. 
 *  Feel free to completely ignore this, I just wanted something as a 
 *  starting point but its completely open to suggestions.
 *  
 */


public class Driver {
	
	
	
	public static void main(String[] args) {
		
		Scanner searchScanner = new Scanner(System.in);
		int choice = 400; //arbitrary number to make while loop run
		Scanner UIscan = new Scanner(System.in);
		String check = "";
		ArrayList<Recipe> searchedList;

		
		 ArrayList<Recipe>recipeList = new ArrayList<Recipe>();
		 recipeList.add(new Recipe("Pepperoni Pizza",
				 new String[] {"cheese","pepperoni","crust"}, 
				 new String[] {"Italian","Dinner"}, 
				 new String[] {"put stuff on crust","cook it"}));
		 recipeList.add(new Recipe("Bacon Burger",
				 new String[] {"cheese","bacon","burger","buns"}, 
				 new String[] {"'Murican","Dinner"}, 
				 new String[] {"cook meats","slap it together"}));
		
		 recipeList.add(new Recipe("Cheese Burger",
				 new String[] {"cheese","bacon","burger","buns"}, 
				 new String[] {"'Murican","Dinner"}, 
				 new String[] {"cook meats","slap it together"}));
		 
		 
		 recipeList.add( new Recipe("Enchanted Golden Apple",
				 new String[] {"Block of Gold","Apple"}, 
				 new String[] {"Minecraft","Enchanted"}, 
				 new String[] {"use workbench","arrange ingredients"}));
		 
		 
			
		System.out.println("####################################\n"
					+ "  Welcome to your virtual cook book\n"
					+ "####################################");
					
			
		while(choice!=0){
						
			while(choice!=1 && choice!= 2 && choice!=0){	
				System.out.println("\nPlease enter the number of the option you would like to perform."
							+ "\n1:Sort Recipes\n"
							+ "2:Search recipes\n"
							+ "0:Exit");
				check = UIscan.nextLine(); //takes in user choice as string 
				try{
						choice = Integer.parseInt(check);
					} catch(NumberFormatException e){
						choice=400; //set back to arbitrary number to continue while loop
						System.out.println("Please enter the number of one of the above options");
					}
					
				}
				if(choice==1){
					choice = 400; //arbitrary #
					System.out.println("How would you like to sort?\n"
							+"1: Alphabetically\n"
							+ "2: By Category");
					check = UIscan.nextLine(); //takes in user choice as string 
					try{
						choice = Integer.parseInt(check);
					} catch(NumberFormatException e){
						choice=400; //set back to arbitrary number to continue while loop
						System.out.println("That input is not recognised.");
					}
					if(choice==1){ 	// SORT ALPHABETICALLY
						choice=400;
						System.out.println("<SORT ALPHABETICALLY>");
					}
					if(choice==2){ // SORT BY CATEGORY
						choice=400;
						System.out.println("---Sorted By Category---");
						ArrayList<String> categoryList = Search.findCategories(recipeList); // get list of all used categories
	
						for(String tempCategory : categoryList) {
							ArrayList<Recipe> foundList = Search.searchByCategory(tempCategory, recipeList);
							// perform category search on each category
							System.out.println(tempCategory + ": ");
							for (Recipe recipe : foundList){
								 System.out.println("\t"+recipe.getName());
							}
						}
						System.out.println("");
					}
				}
				else if(choice==2){
					choice = 400; //arbitrary #
					System.out.println("How would you like to search?\n"
							+"1: Search by recipe name\n"
							+ "2: Search by ingredients\n"
							+ "3: Search by category");
					check = UIscan.nextLine(); //takes in user choice as string 
					try{
						choice = Integer.parseInt(check);
					} catch(NumberFormatException e){
						choice=400; //set back to arbitrary number to continue while loop
						System.out.println("That input is not recognised.");
					}
					// SEARCH BY NAME
					if(choice==1){
						choice = 400; //reset
						System.out.println("Please enter in the name of the recipe you would like to search for: ");
						String searchName = searchScanner.nextLine();
						 
						 searchedList = Search.searchByName(searchName, recipeList);
						 
						 System.out.println("Recipes that match your search term:");
						 for (Recipe recipe : searchedList){
							 System.out.println(recipe.getName());
						 }
						
					}
					// SEARCH BY INGREDIENT
					else if(choice==2){
						choice = 400; //reset
						System.out.println("Please enter in a ingredient of the recipe you would like to search for: ");
						String searchIngredient = searchScanner.nextLine();
						 
						 searchedList = Search.searchByIngredient(searchIngredient, recipeList);
						 
						 System.out.println("Recipes that match your search term:");
						 for (Recipe recipe : searchedList){
							 System.out.println(recipe.getName());
						 }
						
					}
					// SEARCH BY CATEGORY
					else if(choice==3){
						choice = 400; //reset
						System.out.println("Please enter in the category of the recipe you would like to search for: ");
						String searchCategory = searchScanner.nextLine();
						 
						searchedList = Search.searchByCategory(searchCategory, recipeList);
						 
						 System.out.println("Recipes that match your search term:");
						 for (Recipe recipe : searchedList){
							 System.out.println(recipe.getName());
						 }
						
					}
					
					
					
					
					
				}
				
				
				
				
				
			}
		
		 
		
			 
		
		 



}
}
