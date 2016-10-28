package arrays;

import java.util.Arrays;

public class ArrayMethodsHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {6, 1, 3, 5, 2};
		int[] test2 = {7, 5, 3, 1};
		double[] test3 = {1.0, 2.0, 3.0, 4.0, 5.0, 9.0, 86.3, 5.3};
		//System.out.println(searchUnsorted(test, -1));
		//System.out.println(searchSorted(test, 8));
		//sortDescending(test);
		//System.out.println(isSorted(test));
		System.out.println(Arrays.toString(getStats(test3)));
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
    public static double[] getStats(double[] array){
        /** 
         * This method return a double[] contain a WHOLE BUNCH of stats
         * The double array must keep the following stats about the array parameter:
         * index 0 = the mean
         * index 1 = the max
         * index 2 = the min
         * index 3 = the median
         * index 4 = the number of values greater than or equal to the mean
         * index 5 = the number of values below the mean
          **/
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
    	System.out.println(start);
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
}

