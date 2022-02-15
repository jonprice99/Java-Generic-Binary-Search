/* Name: Jonathan Price
   Date: 11/01/2018
   Class: CIT-130-Z04B
   
   The purpose of this file is to implement and test a
   Generic binary search with two types of data to prove
   that bsearch is truly Generic. */
   
public class GenericBinarySearch
{  
   public static void main(String[] args) 
   {   
       //Create integer array and display contents
       Integer[] integers = {0, 2, 4, 6, 8, 10};
       System.out.println("Integer test array contains:");
       print(integers);
       
       //Hold location of object in array
       int result;
       
       //Holds ints to be checked
       int int1 = -2;
       int int2 = 0;
       int int3 = 2;
       int int4 = 3;
      
       //Display results for int1
       result = GenericBinarySearch.<Integer>bsearch(integers, 0, 6, int1);
       if(result != -1)
       {
          System.out.println(int1 + " is at index " + result + ".");
       }
       else if (result == -1)
       {
          System.out.println(int1 + " is not in the array.");
       }
       
       //Display results for int2
       result = GenericBinarySearch.<Integer>bsearch(integers, 0, 6, int2);
       if(result != -1)
       {
          System.out.println(int2 + " is at index " + result + ".");
       }
       else if (result == -1)
       {
          System.out.println(int2 + " is not in the array.");
       }
       
       //Display results for int3
       result = GenericBinarySearch.<Integer>bsearch(integers, 0, 6, int3);
       if(result != -1)
       {
          System.out.println(int3 + " is at index " + result + ".");
       }
       else if (result == -1)
       {
          System.out.println(int3 + " is not in the array.");
       }
       
       //Display results for int4
       result = GenericBinarySearch.<Integer>bsearch(integers, 0, 6, int4);
       if(result != -1)
       {
          System.out.println(int4 + " is at index " + result + ".");
       }
       else if (result == -1)
       {
          System.out.println(int4 + " is not in the array.");
       }
       
       //Create the array of strings and display contents
       String[] strings = {"apples", "blueberries", "cherries", "grapes", "oranges"};
       System.out.println("\nString test array contains:");
       print(strings);
       
       //Holds strings to be checked
       String str1 = "apples";
       String str2 = "watermelons";
       String str3 = "grapes";
       
       //Display results for str1
       result = GenericBinarySearch.<String>bsearch(strings, 0, 5, str1);
       if(result != -1)
       {
          System.out.println("'" + str1 + "'" + " is at index " + result + ".");
       }
       else if (result == -1)
       {
          System.out.println("'" + str1 + "'" + " is not in the array.");
       }
       
       //Display results for str2
       result = GenericBinarySearch.<String>bsearch(strings, 0, 5, str2);
       if (result != -1)
       {
          System.out.println("'" + str2 + "'" + " is at index " + result + ".");
       }
       else if (result == -1)
       {
          System.out.println("'" + str2 + "'" + " is not in the array.");
       }
       
       //Display results for str3
       result = GenericBinarySearch.<String>bsearch(strings, 0, 5, str3);
       if (result != -1)
       {
          System.out.println("'" + str3 + "'" + " is at index " + result + ".");
       }
       else if (result == -1)
       {
          System.out.println("'" + str3 + "'" + " is not in the array.");
       }
   }
  
   //Print() method to display the elements of an array
   public static <T> void print(T[] a)
   {
       //Display each element of the array
       for (int i = 0; i < a.length; i++)
       {
           System.out.print(a[i]+" ");
       }
       
       //Create a new line
       System.out.println();
   }
  
   //Generic binary search method
   public static <T extends Comparable> int bsearch(T[] a, int first, int last, T key) 
   {       
      if (first < last)
      {
         //Determine the middle of the array
         int mid = first + (last - first) / 2;
         
         //Compare key to mid
         if (key.compareTo(a[mid]) < 0)
         {
            return bsearch(a, first, mid, key);           
         } 
         else if (key.compareTo(a[mid]) > 0)
         {
            return bsearch(a, mid+1, last , key);
         }
         else 
         {
            return mid;
         }
      }
      return -1; //Returns "nonexistant in array"
   }  
}