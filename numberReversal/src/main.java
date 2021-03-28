/*
 * This application will have the user input a number then will reverse that number and display it
 */

//import java.util.*;
import java.io.*;

 class ReverseNumber{

     static void reverseArray(int arr[],int start,int end){
     
          int temp;
	     if(start>=end)
	           return;	    
	     temp = arr[start];
	     arr[start] = arr[end];
	     arr[end] = temp;
	
            reverseArray(arr,start+1,end-1);	
     }
	static void printArray(int arr[],int size){
	
	     for(int i=0;i<size;i++)
	         System.out.println(arr[i]+" ");
		 System.out.println(" ");    
	     
	}	
  
	public static void main(String args[]){
	
	    int arr[] = {1,2,3,4,5,6};
	    printArray(arr,6);
	    reverseArray(arr,0,5);
	    System.out.println("reverse number is");
	    printArray(arr,6);	
	}	

}
