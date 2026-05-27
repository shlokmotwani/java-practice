import java.util.ArrayList;

public class ConnectRopes {
    public int solve(int[] A) {
        int N = A.length;
        Heap heap = new Heap();
        for(int x: A){
            heap.insert(x);
        }

        int sum = 0;
        while(true){
            if(heap.size() <= 1){
                break;
            }
            int one = heap.remove();
            int two = heap.remove();
            sum += (one + two);
            heap.insert(one+two);
        }
        return sum;
    }

    class Heap{
        ArrayList<Integer> list;

        Heap(){
            list = new ArrayList<>();
        }

        void insert(int x){
            list.add(x);
            int i = list.size()-1;
            while(i>0){
                int child = list.get(i);
                int pi = (i-1)/2;
                int parent = list.get(pi);
                if(parent <= child){
                    break;
                }
                else{
                    swap(list, i, pi);
                    i = pi;
                }
            }
        }

        int remove(){
            int roolEl = list.get(0);
            swap(list, 0, list.size()-1);
            list.remove(list.size()-1);
            // if(list.size() > 0){
            heapify(0);
            // }
            return roolEl;
        }

        int size(){
            return list.size();
        }

        void heapify(int idx){
            while(idx < list.size()){
                int curr = list.get(idx);
                int lci = 2*idx+1;
                int rci = 2*idx+2;
                int minIdx = idx;
                if(lci < list.size() && list.get(lci) < list.get(minIdx)){
                    minIdx = lci;
                }
                if(rci < list.size() && list.get(rci) < list.get(minIdx)){
                    minIdx = rci;
                }
                if(minIdx == idx){
                    break;
                }
                swap(list, idx, minIdx);
                idx = minIdx;
            }
        }

        void swap(ArrayList<Integer> A, int i, int j){
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
        }
    }
}
