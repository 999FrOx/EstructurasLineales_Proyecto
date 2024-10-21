import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    List<String> lista01 = new ArrayList<>();
    //crear lista con List y ArrayList
    public void agregarLista(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el elemnto que desea agregar: ");
        String elemento = scanner.next();
        lista01.add(elemento);
    }

}
