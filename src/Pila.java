import java.util.Stack;

public class Pila {
    private int capacidad;
    private String[] arreglo;
    private int cima;

    public Pila(int capacidad) {
        this.capacidad = capacidad;
        this.arreglo = new String[capacidad];
        this.cima = -1;
    }

    public String push(String elemento) {
        if (estaLlena()) {
            System.out.println("No hay mas citas disponibles");
        }
        cima++;
        arreglo[cima] = elemento;
        System.out.println("El \"" + elemento + "\" ya ha sido atendido");
        return elemento;
    }


    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == capacidad - 1;
    }

    public void mostrarPila() {
        if (estaVacia()) {
            System.out.println("Aun no hay clientes atendidos");
        }
        System.out.print("Clientes Atendidos: ");
        for (int i = cima; i >= 0; i--) {
            System.out.print(arreglo[i] + " ");
        }
    }
}
