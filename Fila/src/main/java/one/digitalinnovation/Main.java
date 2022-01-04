package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila<>();

        // make the Queue
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        //minhaFila.enqueue(1); // dont accept because of generics (make code safer)
        System.out.println(minhaFila);

        // The first element go out
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        // add new element
        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);

        // to see the first
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);


    }
}
