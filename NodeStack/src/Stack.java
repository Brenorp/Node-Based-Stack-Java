import org.w3c.dom.traversal.NodeIterator;

public class Stack { //LIFo
    private Node top;
    private int size;

    public Stack (){
        top = null;
        size = 0;
    }

    public boolean isEmpty(){
        if(getSize() == 0){
            return true;
        }else{
            return false;
        }
    }

    public int getSize(){
        return size;
    }

    public void push (int info){
        Node node = new Node(info, this.top);
        top = node;
        size++;
    }

    public int peek(){
        return this.top.getInfo();
    }

    public int pop(){
        int info;

        if(isEmpty() == true) {
            System.out.println("stack vazia");
            return 0; //TODO: aprender a jogar um erro e trata-lo
        }

        if(getSize() == 1) {
            info = top.getInfo();
            top = null;
            size--;
            return info;
        }else{
            info = top.getInfo();
            top = top.getNext();
            size--;
            return info;
        }
    }

    public void iterateStack (){
        Node iterator = top;
        if(isEmpty()){
            System.out.println("stack vazia");
        }else{
            System.out.printf(iterator.getInfo() + "" + "\n");
            for(int i=0;i<size-1;i++){
                iterator = iterator.getNext();
                System.out.printf(iterator.getInfo() + "\n");
            }
        }
    }
}
