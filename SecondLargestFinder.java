public class SecondLargestFinder { 
 
    public static int findSecondLargest(int[] arr) { 
        if (arr.length < 2) { 
            throw new IllegalArgumentException("Array should have at least two elements."); 
        } 
 
        // Initialize largest and second largest to minimum possible values 
        int largest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE; 
 
        // Traverse the array 
        for (int num : arr) { 
            if (num > largest) { 
                // Update second largest to be the previous largest 
                secondLargest = largest; 
                // Update largest to the current number 
                largest = num; 
            } else if (num > secondLargest && num != largest) { 
                // Update second largest if current number is between largest and second largest 
                secondLargest = num; 
            } 
        } 
 
        if (secondLargest == Integer.MIN_VALUE) { 
            throw new IllegalArgumentException("There is no second largest element (all elements might be 
equal)."); 
        } else { 
            return secondLargest; 
        } 
    } 
 
    public static void main(String[] args) { 
        int[] array = {12, 35, 1, 10, 34, 1}; 
        try { 
            System.out.println("The second largest element is: " + findSecondLargest(array)); 
        } catch (IllegalArgumentException e) { 
            System.out.println(e.getMessage()); 
        } 
    } 
}