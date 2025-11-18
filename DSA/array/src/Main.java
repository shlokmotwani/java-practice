
public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(Search.binarySearch(arr, 10));
        System.out.println(Search.binarySearch(arr, 40));
        System.out.println(Search.binarySearch(arr, 50));
        System.out.println(Search.binarySearch(arr, 80));
        System.out.println(Search.binarySearch(arr, 100));
    }
}