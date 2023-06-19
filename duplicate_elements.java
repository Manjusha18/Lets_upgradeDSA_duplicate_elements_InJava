
// Problem: Find All Duplicates in an Array

// Instructions: Given an array of integers, find all the elements that appear twice in the array and return them.

// Example Test Case:

// Input: [4, 3, 2, 7, 8, 2, 3, 1]

// Output: [2, 3]

import java.util.ArrayList;
class duplicate_elements_java {
    public static void main(String[] args) {
        
        int arr[]={4, 3, 2, 7, 8, 2, 3, 1};
        duplicate_elements(arr);
        
    }
    public static void duplicate_elements(int arr[]){
        int n=arr.length;
        boolean ifPresent = false;
        ArrayList<Integer> al = new ArrayList<Integer>();
 
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {

                    if (al.contains(arr[i])) {
                        break;
                    }

                    else {
                        al.add(arr[i]);
                        ifPresent = true;
                    }
                }
            }
        }
        if (ifPresent == true) {
 
            System.out.print(al);
        }
        

    }
}



