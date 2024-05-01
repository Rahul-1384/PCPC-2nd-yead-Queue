import java.util.Scanner;

public class QueueFunctions{
    int size=0;
    int rear=-1;
    int front=0;
    int queue[];

    public QueueFunctions(int size){
        queue=new int[size];
    }

    public QueueFunctions() {
        queue=new int[5];
    }

    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==queue.length;
    }

    public int sizeOfQueue(){
        return size;
    }

    public void enqueue(int data) throws Exception{
        if(isFull()){
            throw new Exception("Queue is Full");
        }
        int idx=(rear+1)%queue.length;
        rear=idx;
        queue[idx]=data;
        size++;
    }

    public int dequeue()throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int data=queue[front];
        front=(front+1)%queue.length;
        size--;
        return data;
    }


    public void display(){
        for(int i=0;i<queue.length;i++){
            System.out.print(queue[i]+" ");
        }
    }
}
