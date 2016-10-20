package arrays;

import java.util.Arrays;

public class ArrayMethodsHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {6, 1, 3, 5, 2};
		int[] test2 = {7, 5, 3, 1};
		//System.out.println(searchUnsorted(test, 7));
		System.out.println(searchSorted(test, 0));
		//sortDescending(test);
		//System.out.println(isSorted(test));
	}
	
	public static int searchUnsorted(int[] arrayToSearch, int key){
		if(arrayToSearch.length > key-1){
			return arrayToSearch[key-1];
			}
		return -1;
	}
	public static int searchSorted(int[] sortedArrayToSearch, int key){
		if(sortedArrayToSearch.length > key - 1){
			int[] sortedArray = new int[sortedArrayToSearch.length];
			sortedArray = sortDescending(sortedArrayToSearch);
			return sortedArray[key];
		}
	     return -1;
	    }
	public static int[] sortDescending(int[] list){
		boolean inSortDescendingLoop = true;
		int i = 0;
		int j = 1;
		int loopCounter = 0;
		while(inSortDescendingLoop == true){
			if(loopCounter == list.length -1){
	//			System.out.println("RESET");
				i = 0;
				j = 1;
				loopCounter = 0;
			}
			int num1 = list[i];
			int num2 = list[j];
	//		System.out.println("num1 is: "+ num1);
	//		System.out.println("num2 is: "+ num2);
			if(isSorted(list) == true){
	//			System.out.println("out of loop");
				break;
			}
			else{
				if(list [i] < list [j]){
	//				System.out.println("Swaping " + num1 + " and " + num2);
					list[i] = num2;
					list[j] = num1;
				}
				if(list [i] >= list [j]){
	//				System.out.println("yes " + list[i] + ">=" + list[j] + " METHOD 2");
					i++;
					j++;
					loopCounter++;
	//				System.out.println("Now entering loopCounter: " + loopCounter);
				}
			}
		}
	//	System.out.println(Arrays.toString(list));
		return list;
	}
    public static boolean isSorted(int[] array){
    	boolean inSortCheck = true;
    	boolean yaOrNah = false;
    	int i = 0;
    	int j = 1;
    	int loopCounter = 0;
    	while(inSortCheck == true){
    //		System.out.println("I am comparing: " + array[i] + " and " + array[j]);
    		if(array[i] >= array[j]){
    //			System.out.println("yes " + array[i] + ">=" + array[j]);
				i++;
				j++;
   				loopCounter++;
   	//			System.out.println("loopCounter is at: " + loopCounter);
   	//			System.out.println("i is at: " + i);
   	//			System.out.println("j is at: " + j); 
   				if(loopCounter == array.length - 1){
   					yaOrNah = true;
    				inSortCheck = false;
    			}
			}
    		else{
   	//			System.out.println("no " + array[i] + "<" + array[j]);
   				inSortCheck = false;
   			}
   		}
    return yaOrNah;
    }
}

