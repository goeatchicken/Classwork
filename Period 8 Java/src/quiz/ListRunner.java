package quiz;

import java.util.ArrayList;

public class ListRunner {

	static ArrayList<Item> shoppingList;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] justDescriptions = getDescriptions();
		initList(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}


	private static void printPurchasedItems() {
		// TODO Auto-generated method stub
		for(int i = 0; i < shoppingList.size(); i++){
			if(shoppingList.get(i).isPurchased()){
				System.out.println(shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				i--;
			}
		}
	}


	private static void initList(String[] justDescriptions) {
		// TODO Auto-generated method stub
		shoppingList = new ArrayList<Item>();
		for(String s : justDescriptions){
			Item temp = new Item(s);
			shoppingList.add(temp);
		}
//		for(int i = 0; i<justDescriptions.length;i++){
//			shoppingList.add(new Item(justDescriptions[i]));
//		}
	}


	private static void doSomeShopping() {
		// TODO Auto-generated method stub
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
	}


	private static String[] getDescriptions() {
		// TODO Auto-generated method stub
		String[]test = {"coffee", "videogames", "potato chips", "a life"};
		return null;
	}
	
}
