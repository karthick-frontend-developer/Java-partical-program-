public class Binary{
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) 
                return mid;
            if (arr[mid] < key) 
                left = mid + 1;     
            else 
                right = mid - 1; 
        }
        return -1; 
    }
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,9};
        int index = binarySearch(arr,8);
            System.out.println("Element found in location(Binary serach): " + index);
    }
}
