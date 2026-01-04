public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! - This is my first Java program. ");
 
        // declare variables and assign values to them 
        
        int a = 5;
        int b = 10;
        int x = 0;

        int myarray[] = {1, 2, 3, 4, 5};
        
        Main obj = new Main();
        int sum = obj.sum_of_two_numbers(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);            

        // Print all the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < myarray.length; i++) {
            System.out.println("Element at index " + i + ": " + obj.array_element(myarray, i));
        }  
        
        //reverse array
        System.out.println("The elements of the array in reverse order are:");     
        for (int i = myarray.length - 1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + obj.array_element(myarray, i));
        }       

        //sort the array in descending order
        java.util.Arrays.sort(myarray);
        System.out.println("The elements of the array in descending order are:");   
        for (int i = myarray.length - 1; i >= 0; i--) {
            System.out.println("Element at index " + i + ": " + obj.array_element(myarray, i));
        }       

        //create a 2D array having 10 rows and 10 colums in a row. 
        // populate it with numbers from 0 thru 100 
        // print its elements   
        int[][] matrix = new int[10][10];
        int value = 0;  
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = value;
                value += 1;
            }
        } 
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }   

        //print the prime numbers from the matrix    
        
        System.out.println("The prime numbers in the matrix are:");
        for (int i = 0; i <10; i++) 
            for (int j = 0; j < 10; j++) {
            x = matrix[i][j];
            if (is_prime(x)) {
                System.out.println("Prime number: " + x);   
            }
        }       

    }

    int sum_of_two_numbers(int a, int b) {
        return a + b;
    }

    int array_element(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + arr.length);
        }
    }

    static boolean is_prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
