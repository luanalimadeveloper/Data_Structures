package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        // make the Queue
        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));
        System.out.println(minhaFila);

        // The first element go out
        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        // add new element
        minhaFila.enqueue(new No("ultimo"));
        System.out.println(minhaFila);

        // to see the first
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);


    }
}
