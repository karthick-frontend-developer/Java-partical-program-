public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {1,4,8,9,10};
     
        int index = linearSearch(arr, 8);
        if (index == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + index);      
    }
}
