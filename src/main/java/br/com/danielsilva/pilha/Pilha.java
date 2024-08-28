package br.com.danielsilva.pilha;

public class Pilha {

    public static void main(String[] args) {

        Pilha p = new Pilha();

        //push = O(1)
        //pop = O(1)

        p.push(5);
        p.push(4);
        p.push(3);
        p.push(2);
        p.push(1);

        while (!p.isEmpty()){
            int elemento = p.pop();
            System.out.println(elemento);
        }

    }

    int elementos[];
    int topo;

    public Pilha(){
        this.elementos = new int[10];
        this.topo = -1;
    }

    public void push(int e){
        topo++;
        elementos[topo] = e;
    }

    public int pop(){
        int e ;
        e = elementos[topo];
        topo--;
        return e;
    }
    public boolean isEmpty(){
        return (topo == -1);
    }

    public boolean isFull(){
        return (topo == -9);
    }

    public int top(){
        return elementos[topo];
    }

    public int size(){
        return elementos.length;
    }


}