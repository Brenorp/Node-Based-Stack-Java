public class Main {
    public static void main (String[] args){
        Stack teste = new Stack();

        teste.push(1);
        teste.push(2);
        teste.push(3);
        teste.push(4);
        teste.push(5);

        System.out.println(teste.peek());
        int valor = teste.pop();
        System.out.println("valor recebido:" + valor);

        teste.push(6);

        teste.iterateStack();


    }
}
