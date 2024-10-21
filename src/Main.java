import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de citas: ");
        int capacidad = scanner.nextInt();

        Cola cola = new Cola(capacidad);
        Pila pila = new Pila(capacidad);

        while (true) {
            System.out.println("\n1. Agendar Cita: ");
            System.out.println("2. Cliente atendido: ");
            System.out.println("3. Mostrar Clientes en espera: ");
            System.out.println("4. Mostrar clientes atendidos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Lista lista = new Lista();
                    System.out.print("Ingrese el Nombre del Cliente: ");
                    String name = scanner.next();
                    try {
                        int opt;
                        do {
                            System.out.println("Seleccione una opción: \n" + "1. Agregar Servicio \n" +
                                    "2. Ver Servicios \n" +
                                    "3. Registrar \n");
                            opt = scanner.nextInt();

                            switch (opt) {
                                case 1:
                                    lista.agregarLista();
                                    break;

                                case 2:
                                    System.out.println("Los servicios para este cliente son: " + lista.lista01);

                                    break;

                                case 3:
                                    System.out.println("Cliente agregado");
                                    cola.encolar(name);
                                    break;
                                default:
                                    System.out.println("Ingrese una opción válida!!!");
                            }
                        } while (opt !=3);
                        System.out.println("El cliente " + name + " ha sido registrado exitosamente!!! ");
                        System.out.println("Los Servicios son: " + lista.lista01);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:


                    try {
                        String elementoDesencolado = cola.desencolar();
                        System.out.println(elementoDesencolado + " El cliente " + elementoDesencolado + "ha sido atendido.");
                        pila.push(elementoDesencolado);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    cola.mostrarCola();
                    break;
                case 4:
                    pila.mostrarPila();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
//Ángel Gabriel Guzmán Ramirez
// Jimena Hernández Luna
// Luis Manuel Pérez GOnzález