package pokeos2.pkg0;

public class PrioQueue {

    public class node {

        private Object node;
        private int priority;

        public node(Object name, int prio) {
            this.node = name;
            this.priority = prio;
        }

        public Object getNode() {
            return node;
        }

        public int getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return node + "-" + priority;
        }
    }

    private node[] heap;
    private int heapSize;
    private final int capacity = 100;

    public PrioQueue() {
        heap = new node[this.capacity + 1];
        heapSize = 0;
    }

    public void clear() {
        heap = new node[capacity + 1];
        heapSize = 0;
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public boolean isFull() {
        return heapSize == capacity - 1;
    }

    public int size() {
        return heapSize;
    }

    public void insert(int dir, int priority) {
        System.out.println("------ insert");
        node newJob = new node(dir, priority);

        heap[++heapSize] = newJob;
        int pos = heapSize;
        while (pos != 1 && newJob.priority > heap[pos / 2].priority) {
            heap[pos] = heap[pos / 2];
            pos /= 2;
        }
        heap[pos] = newJob;
    }

    public node dequeue() {
        int parent, child;
        node first, last;
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return null;
        }

        first = heap[1];
        last = heap[heapSize--];

        parent = 1;
        child = 2;
        while (child <= heapSize) {
            if (child < heapSize && heap[child].priority < heap[child + 1].priority) {
                child++;
            }
            if (last.priority >= heap[child].priority) {
                break;
            }

            heap[parent] = heap[child];
            parent = child;
            child *= 2;
        }
        heap[parent] = last;
        return first;
    }

    public node get(int pos) {
        return heap[pos];
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return (int) heap[1].node;
    }

    public int peekTam() {
        if (isEmpty()) {
            return -1;
        }
        return (int) heap[1].priority;
    }

}
