package sort8;

import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayToSort={133,0,-5,31,12,12,2};
//		System.out.println("- - - SELECTION SORT - - -");
//		System.out.println(Arrays.toString(arrayToSort));
//		selectionSort(copy(arrayToSort));
//		System.out.println("- - - BUBBLE SORT - - -");
//		bubbleSort(copy(arrayToSort));
		sort11(arrayToSort);
		System.out.println(Arrays.toString(arrayToSort));
	}
	
	public static int[] copy(int[] arr){
		int[] copy = new int[arr.length];
		for(int i = 0; i < copy.length; i++){
			copy[i]=arr[i];
		}
		return copy;
	}
	
	public static void swap(int[] arr, int i, int j){
		System.out.println("Swapping "+arr[i]+" and "+arr[j]);
		int placeHolder=arr[j];
		arr[j]=arr[i];
		arr[i]=placeHolder;
		System.out.println(Arrays.toString(arr));
	}
	public static void sort11(int[] array){
		System.out.println(java.util.Arrays.toString(array));
	   for(int i=0;i<array.length; i++){
	        for(int j = 0; j<array.length -1- i; j++){
	        	if(array[j]>array[j+1]){
	                int temp = array[j];
	                System.out.println("looking at j: " + array[j] + " and j+1: " + array[j+1]);
	                array[j]=array[j+1];
	                array[j+1]=temp;
	                System.out.println("current j: " + array[j] + " current j+1:" + array[j+1]);
	            }
	        	
	        	System.out.println(java.util.Arrays.toString(array));
	        }
	     }
	 }
	
	public static void selectionSort(int[] arrayToSort){
		int minIndex=0;
		int minimum=arrayToSort[0];
		for(int i=0;i<arrayToSort.length;i++){
			minIndex=i;
			minimum=arrayToSort[i];
			for(int j=i;j<arrayToSort.length;j++){
				if(arrayToSort[j]<minimum){
					minimum=arrayToSort[j];
					minIndex=j;
				}
			}
			swap(arrayToSort, i, minIndex);
		}
	}
	
	public static void bubbleSort(int[] array){
	    System.out.println("Bubble sort with "+Arrays.toString(array));
	    for(int i=0; i < array.length-1; i++){
	        for(int j=1; j < array.length-i; j++){
	            if(array[j-1] > array[j]){
	                swap(array,j-1,j);
	                System.out.println("becomes "+Arrays.toString(array));
	            }
	        }
	System.out.println("Ends as "+Arrays.toString(array));
	    }
	}
	public static void sort1(int [ ] num){            
	     int i=0;

	     for (int j = 1; j < num.length; j++){
	           int key = num[j];
	           for(i = j - 1; (i >= 0 && num[i] > key); i--){
	                 num[i+1] = num[i];
	          }
	          num[i+1] = key;
	           System.out.println(java.util.Arrays.toString(num));
	     }
	}
}