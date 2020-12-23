public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head =0;
    private int tail=-1;
    private int currentSize=0;
    public MyQueue(int queueSize){
        this.capacity =queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull(){
        boolean status = false;
        if(currentSize == capacity)
            status = true;
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if( currentSize ==0)
            status = true;
        return status;
    }
    public void enqueue(int input){
        if(isQueueFull()){
            System.out.println("Full ! Cant add more");
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = input;
            currentSize++;
        }
            System.out.println("Element " + input + " is pushed to Queue !");
        }
    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Empty ! Nothing to remove");
        } else{
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}
