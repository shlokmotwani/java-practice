import java.util.Arrays;

public class FinishMaximumJobs {
    public int solve(int[] A, int[] B) {
        int N = A.length;
        Job[] jobs = new Job[N];
        for(int i=0; i<N; i++){
            jobs[i] = new Job(A[i], B[i]);
        }
        Arrays.sort(jobs);
        int count = 1;
        int lastEndTime = 0;
        Job prev = jobs[0];
        for(int i=1; i<N; i++){
            Job curr = jobs[i];
            if(prev.end <= curr.start){
                count++;
                prev = curr;
            }
        }
        return count;
    }

    class Job implements Comparable<Job>{
        int start;
        int end;

        Job(int start, int end){
            this.start = start;
            this.end = end;
        }

        public int compareTo(Job compared){
            // if(this.end == compared.end){
            //     int d1 = this.end - this.start;
            //     int d2 = compared.end - compared.start;
            //     return d1 >= d2 ? this.end : compared.end;
            // }
            return this.end - compared.end;
        }
    }
}
