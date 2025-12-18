package org.example;

public class MinimumDifference {
    public int solve(int N, int M, int[][] A) {
        int ans = Integer.MAX_VALUE;

        //sort the 2D array
        for(int row = 0; row < N; row++){
            Arrays.sort(A[row]);
        }


        for(int row = 0; row < N-1; row++){
            for(int col = 0; col < M; col++){
                int current = A[row][col];
                int largest = Integer.MIN_VALUE;
                int smallest = Integer.MAX_VALUE;

                // find the largest number <= current
                int left = 0;
                int right = M-1;
                while(left <= right){
                    int mid = left + (right - left) / 2;
                    if(A[row+1][mid] < current){
                        largest = A[row+1][mid];
                        left = mid+1;
                    }
                    else if(A[row+1][mid] > current){
                        right = mid - 1;
                    }
                    else{
                        largest = A[row+1][mid];
                        break;
                    }
                }

                // find the smallest number >= current
                left = 0;
                right = M-1;
                while(left <= right){
                    int mid = left + (right - left) / 2;
                    if(A[row+1][mid] < current){
                        left = mid+1;
                    }
                    else if(A[row+1][mid] > current){
                        smallest = A[row+1][mid];
                        right = mid - 1;
                    }
                    else{
                        smallest = A[row+1][mid];
                        break;
                    }
                }
                int minDiff = 0;
                if(largest == Integer.MIN_VALUE){
                    minDiff = smallest-current;
                }
                else if(smallest == Integer.MAX_VALUE){
                    minDiff = current-largest;
                }
                else{
                    minDiff = Math.min(current-largest, smallest-current);
                }
                ans = Math.min(ans, minDiff);
            }
        }
        return ans;
    }
}
