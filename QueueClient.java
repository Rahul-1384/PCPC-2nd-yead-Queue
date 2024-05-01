public class QueueClient{
    public static void main(String[] args) throws Exception {
        QueueFunctions q=new QueueFunctions();
        System.out.println(q.isEmpty());
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        System.out.println();
        System.out.println(q.isFull());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.display();
        q.enqueue(60);
        System.out.println();
        q.display();
    }
    
}
