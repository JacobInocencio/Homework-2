/**
 * This class is meant to complete 10 objectives using arrays including finding values,
 * checking conditions, modifying arrays, and sorting.
 */

public class AlgorithmsProject {

    public static void main(String[] args) {

        //These are test arrays used to run all the methods
        int[] smallArray = {5, 3, 6, 2, 8};
        int[] medArray = {3, 10, 6, 8, 9, 7, 5, 5};
        int[] threeArray = {4, 6, 7, 8, 8, 8, 9, 10};
        int[] fiveArray = {2, 5, 8, 5, 3, 9, 8, 5, 5};
        int[] nicArray = {4, 5, 16, 36, 37, 67, 3498};
        int[] randArray = {56, 1000, 73, 69, 67, 83};

        int targetNum = 5;

        //This prints and tests the smallest number and index methods
        System.out.println("smallArray:");
        System.out.println("Smallest: " + smallestNum(smallArray));
        System.out.println("Smallest Index: " + smallestIndex(smallArray));
        System.out.println("Average: " + arrayMean(smallArray));
        System.out.println("All Even: " + checkEven(smallArray));
        System.out.println("");

        //This tests changing consecutive 5s into 0s
        System.out.println("medArray:");
        consFive(medArray);
        printArray(medArray);
        System.out.println("");

        //This checks if there are 3 numbers in a row
        System.out.println("threeArray:");
        System.out.println("Three in a row: " + threeNums(threeArray));
        System.out.println("");

        //This counts how many times a number shows up in an array
        System.out.println("fiveArray:");
        System.out.println("How many 5s: " + howMany(fiveArray, targetNum));
        System.out.println("");

        //This prints the reversed version of an array
        System.out.println("Reverse:");
        printArray(reverseArray(fiveArray));
        System.out.println("");

        //This prints the array shifted to the right
        System.out.println("Shift Right:");
        printArray(toTheRight(nicArray));
        System.out.println("");

        //This sorts the array using selection sort
        System.out.println("Sorted:");
        select(randArray);
        printArray(randArray);
    }

    /**
     * This method prints all values in an array
     */
    public static void printArray(int[] arr) {

        //This loop goes through the array and prints each value
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    /**
     * This method finds the smallest number in an array
     */
    public static int smallestNum(int[] arr) {

        //This stores the smallest value found so far
        int lowest = arr[0];

        //This loop checks each number in the array
        for(int i = 1; i < arr.length; i++) {

            //This updates the smallest value if a smaller number is found
            if(arr[i] < lowest) {
                lowest = arr[i];
            }
        }

        return lowest;
    }

    /**
     * This method finds the index of the smallest number in an array
     */
    public static int smallestIndex(int[] arr) {

        //This stores the smallest value and its index
        int lowest = arr[0];
        int index = 0;

        //This loop checks each value in the array
        for(int i = 1; i < arr.length; i++) {

            //This updates the smallest value and index if needed
            if(arr[i] < lowest) {
                lowest = arr[i];
                index = i;
            }
        }

        return index;
    }

    /**
     * This method finds the average of all numbers in an array
     */
    public static int arrayMean(int[] arr) {

        //This stores the total of all numbers
        int total = 0;

        //This loop adds all values together
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total / arr.length;
    }

    /**
     * This method checks if all numbers in an array are even
     */
    public static boolean checkEven(int[] arr) {

        //This loop checks each number in the array
        for(int i = 0; i < arr.length; i++) {

            //If any number is odd, return false
            if(arr[i] % 2 != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * This method changes two consecutive 5s into 0s
     */
    public static void consFive(int[] arr) {

        //This loop checks for two 5s in a row
        for(int i = 0; i < arr.length - 1; i++) {

            //If two 5s are found, they are changed to 0
            if(arr[i] == 5 && arr[i + 1] == 5) {
                arr[i] = 0;
                arr[i + 1] = 0;
            }
        }
    }

    /**
     * This method checks if 3 numbers in a row are the same
     */
    public static boolean threeNums(int[] arr) {

        //This loop checks groups of 3 numbers
        for(int i = 0; i < arr.length - 2; i++) {

            //If 3 numbers in a row match, return true
            if(arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
                return true;
            }
        }

        return false;
    }

    /**
     * This method counts how many times a number appears in an array
     */
    public static int howMany(int[] arr, int target) {

        //This keeps track of how many times the number appears
        int count = 0;

        //This loop checks every value in the array
        for(int i = 0; i < arr.length; i++) {

            //If the value matches, increase count
            if(arr[i] == target) {
                count++;
            }
        }

        return count;
    }

    /**
     * This method reverses an array
     */
    public static int[] reverseArray(int[] arr) {

        //This creates a new array to store reversed values
        int[] newArr = new int[arr.length];

        //This index tracks where to place values
        int j = 0;

        //This loop goes backwards through the original array
        for(int i = arr.length - 1; i >= 0; i--) {

            //This copies values into the new array
            newArr[j] = arr[i];
            j++;
        }

        return newArr;
    }

    /**
     * This method shifts all values in an array to the right
     */
    public static int[] toTheRight(int[] arr) {

        //This creates a new array for shifted values
        int[] newArr = new int[arr.length];

        //This moves the last value to the first position
        newArr[0] = arr[arr.length - 1];

        //This shifts all other values right
        for(int i = 1; i < arr.length; i++) {
            newArr[i] = arr[i - 1];
        }

        return newArr;
    }

    /**
     * This method sorts an array using selection sort
     */
    public static void select(int[] arr) {

        //This loop goes through each position in the array
        for(int i = 0; i < arr.length - 1; i++) {

            //This stores the index of the smallest value
            int minIndex = i;

            //This finds the smallest value in the remaining array
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            //This swaps the values
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
