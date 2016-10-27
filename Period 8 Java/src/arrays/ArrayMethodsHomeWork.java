package arrays;

import java.util.Arrays;

public class ArrayMethodsHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {6, 1, 3, 5, 2 , 62, 11, 34, 56, 22, 63, 1, 33, 556, 21};
		int[] test2 = {7, 5, 3, 1};
		int[] test5 = {3, 1, 6, 5, 1, 5, 0};
		int[] test6 = {1, 2, 3, 4, 5, 8};
		double[] test3 = {1.0, 2.0, 3.0, 4.0};
		double[] test4 = {6.0, 1.0, 3.0, 5.0, 2.0 , 62.0, 11.0, 34.0, 56.0, 22.0, 63.0, 1.0, 33.0, 556.0, 21.0};
		//System.out.println(searchUnsorted(test, -1));
		//System.out.println(searchSorted(test, 2));
		//sortDescending(test);
		//System.out.println(isSorted(test));
		//System.out.println(Arrays.toString(getStats(test4)));
		//System.out.println(countDifferences(test5, test));
//		System.out.println(longestConsecutiveSequence(test6));
		System.out.println(generateDistinctItemsList(7));
	}
	
	public static int searchUnsorted(int[] arrayToSearch, int key){
        int k = 0;
        for(int i=0; i<arrayToSearch.length; i++){
            if(arrayToSearch[i] == key){
                k = i;
            }
        }
        if(arrayToSearch[k] == key){
            return k;
        }
        else{
            return -1;
        }
	}
	public static int searchSorted(int[] sortedArrayToSearch, int key){
		int[] sortedArray = new int[sortedArrayToSearch.length];
		sortedArray = sortDescending(sortedArrayToSearch);
		System.out.println(Arrays.toString(sortedArray));
		int k = 0;
		for(int i = 0; i < sortedArray.length; i++){
		    if(sortedArray[i] == key){
		        k = i;
		    }
		}
		if(sortedArray[k] == key){
		    return k;
		}
	    else{
		    return -1;
	    }
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
    public static double[] getStats(double[] array){
    	double start = 0.0;
    	double currentMax = array[0];
    	double currentMin = array[0];
    	double median = 0.0;
    	double[]stats = new double[6];
    	double greaterCount = 0.0;
    	double lessCount = 0.0;
    	double organizedList [] = sortDescending2(array);
    	//mean
    	for(int i = 0; i<array.length; i++){
    		//mean
    		//System.out.println("ADDING: " + array[i] + " TO " + start +". i IS " + i);
    		start += array[i];
    		//max
    		if(currentMax < array[i]){
    			currentMax = array[i];
    		}
    		//min
    		if(currentMin > array[i]){
    			currentMin = array[i];
    		}
    		//median
    	}
    	if(array.length%2 == 0){
    		median = (organizedList[(array.length/2)-1] + organizedList[(array.length/2)])/2;
    	}
    	if(array.length%2 == 1){
    		median = organizedList[((array.length+1)/2)-1];
    	}
    	//greater and less
    	for(int i=0;i<array.length;i++){
    	    if(array[i]>=median){
    	        greaterCount++;
    	    }
    	    if(array[i]<median){
    	        lessCount++;
    	    }
    	}
    	stats[0] = start / array.length;
    	stats[1] = currentMax;
    	stats[2] = currentMin;
    	stats[3] = median;
    	stats[4] = greaterCount;
    	stats[5] = lessCount;
    	return stats;
    }
    public static double[] sortDescending2(double[] list){
		boolean inSortDescendingLoop = true;
		int i = 0;
		int j = 1;
		int loopCounter = 0;
		while(inSortDescendingLoop == true){
			if(loopCounter == list.length -1){
				i = 0;
				j = 1;
				loopCounter = 0;
			}
			double num1 = list[i];
			double num2 = list[j];
			if(isSorted2(list) == true){
				break;
			}
			else{
				if(list [i] < list [j]){
					list[i] = num2;
					list[j] = num1;
				}
				if(list [i] >= list [j]){
					i++;
					j++;
					loopCounter++;
				}
			}
		}
		return list;
	}
    public static boolean isSorted2(double[] array){
    	boolean inSortCheck = true;
    	boolean yaOrNah = false;
    	int i = 0;
    	int j = 1;
    	int loopCounter = 0;
    	while(inSortCheck == true){
    		if(array[i] >= array[j]){
				i++;
				j++;
   				loopCounter++;
   				if(loopCounter == array.length - 1){
   					yaOrNah = true;
    				inSortCheck = false;
    			}
			}
    		else{
   				inSortCheck = false;
   			}
   		}
    return yaOrNah;
    }
    public static int countDifferences(int[] array1, int[] array2){
    	boolean [] a = new boolean[array1.length];
    	boolean [] b = new boolean[array2.length];
    	int[] usedNum = new int [0];
    	int differentCount = 0;
    	if(array1.length <= array2.length){
    		for(int i = 0; i<array1.length; i++){
        		for(int j = 0; j<array2.length; j++){
        			if(b[j] == true){
    					
    				}
        			if(array1[i] == array2[j]){
        				a[i] = true;
        				b[j] = true;
        			}
        		}
        	}
    	}
    	else{
    		for(int i = 0; i<array2.length; i++){
    			for(int j = 0; j<array1.length; j++){
    				if(b[i] == true){
    					
    				}
    				else if(array2[i] == array1[j]){
    					a[j] = true;
    					b[i] = true;
    				}
    			}
    		}
    	}
    	for(int i = 0; i < a.length;i++){
    		if(a[i] == false){
    			differentCount++;
    		}
    	}
    	for(int i = 0; i < b.length;i++){
    		if(b[i] == false){
    			differentCount++;
    		}
    	}
        return differentCount;
    }
//    public static int longestConsecutiveSequence(int[] array1){
//    	int count = 1;
//    	for(int h = 0; h<array1.length;h++){
//      a: 	for(int i = 0; i < array1.length-1;i++){
//        		for(int j = i+1; j<array1.length;j++){
//        			if(array1[i] + 1 == array1[j]){
//        				count++;
//        			}
//        			else{
//        				break a;
//        			}
//        		}
//      		}
//    	}
//        return count;
//    }
    public static int[] generateDistinctItemsList(int n){
    	int [] list = new int [n];
    	int [] list2 = new int [(2*n) - n + 1];
    	int count = n;
    	for(int h = 0; h<= n; h++){
    			list2[h] = count;
    			count++;
    		}
    	shuffle(list2);
    	for(int i = 0; i<n; i++){
    		list[i] = list2[i];
    	}
        return list; 
    }
    private static void shuffle(int[] array) {
		for(int i = 0; i < array.length; i++){
			int random = (int) (Math.random()*6);
			swap(array, i, random);
		}
	}
	private static void swap(int[]arry, int i, int j){
		int placeholder = arry[j];
		arry[j] = arry[i];
		arry[i] = placeholder;
	}
}

