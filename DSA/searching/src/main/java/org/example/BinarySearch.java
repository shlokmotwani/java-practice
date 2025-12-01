package org.example;

public class BinarySearch {
    public static int search(int[] A, int target){
        int N = A.length;
        int left = 0;
        int right = N-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(target == A[mid]){
                return mid;
            }
            else if(target < A[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = new int[]{10, 20, 30, 40, 50, 60, 70, 80};
        System.out.println(search(A, 10));
        System.out.println(search(A, 40));
        System.out.println(search(A, 50));
        System.out.println(search(A, 80));
        System.out.println(search(A, 100));
    }
}
