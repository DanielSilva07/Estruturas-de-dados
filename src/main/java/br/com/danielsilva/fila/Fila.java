package br.com.danielsilva.fila;

public class Fila {
// Fila FIFO

    public static void main(String[] args) {
        Fila f = new Fila();

        //enqueue = O(1)
        //dequeue = O(1)
        //front = O(1)
        //rear = O(n)


        f.enqueue(1);
        f.enqueue(45);
        f.enqueue(50);
        f.enqueue(80);

        System.out.println(f.getFront());
        System.out.println(f.getRear());

//        System.out.println(f.isEmpty());
//        System.out.println(f.size);

    }

   protected int [] capacidade;
   protected int size ;
   protected int front ;
   protected int rear ;


public Fila(){
    this.capacidade = new int[7];
    this.front=0;


}

public void enqueue(int item){
capacidade [rear] = item;
rear = (rear + 1)%5;
size++;
}

public int dequeue(){
    int item = capacidade[front];
    front = (front + 1)%5;
    size = size - 1;
return item;
}

public int getSize(){
    return size;
}

public boolean isEmpty(){
    return getSize()==0;
}

    public int getFront() {
        return capacidade[(front)%5];
    }

    public int getRear(){
        return capacidade [(rear-1)%5];
    }
}
