package heap;

public class BinaryHeap {

    int[] arr;
    int size, capacity;

    BinaryHeap(int c) {
        arr= new int[c];
        size= 0;
        capacity= c;
    }

    int left(int i) {return (2*i + 1);}
    int right(int i) {return (2*i + 2);}
    int parent(int i) {return (i-1)/2;}

    void insert(int x) {
        if(size == capacity) return;
        size++;
        arr[size-1]= x;
        for (int i= size-1; i!= 0 && arr[parent(i)]>arr[i];) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i= parent(i);
        }
    }

    void minHeapify(int i) {
        int lt= left(i), rt= right(i);
        int smallest= i;
        if(lt<size && arr[lt] < arr[i])
            smallest= lt;
        if(rt<size && arr[rt] < arr[smallest])
            smallest= rt;
        if(smallest!=i) {
            int temp= arr[i];
            arr[i]= arr[smallest];
            arr[smallest]= arr[i];
            minHeapify(smallest);
        }
    }

    int extractMin() {
        if(size == 0) return Integer.MAX_VALUE;
        if(size == 1) { size --; return arr[0]; }
        int temp= arr[0];
        arr[0]= arr[size-1];
        arr[size-1]= temp;
        size --;
        minHeapify(0);
        return arr[size];
    }

    void decreaseKey(int i, int x) {
        arr[i]= x;
        while(arr[i] < arr[parent(i)] && i != 0) {
            int temp= arr[i];
            arr[i]= arr[parent(i)];
            arr[parent(i)]= temp;
            i= parent(i);
        }
    }

    void buildHeap() {
        for(int i= (size -2)/2; i>=0; i--) {
            minHeapify(i);
        }
    }

    void delete(int i) {
        decreaseKey(i,Integer.MIN_VALUE);
        extractMin();
    }

    public static void main(String[] args) {
        BinaryHeap minHeap= new BinaryHeap(10);
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(15);
        minHeap.insert(40);
        minHeap.insert(50);
        minHeap.insert(3);
        minHeap.insert(100);
        minHeap.insert(25);
        minHeap.insert(45);
        minHeap.insert(12);
        System.out.println(minHeap.extractMin());

    }

}
