import java.util.Scanner;

public class EjercicioVeterinaria {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Cliente clientes[];

        System.out.println("Ingrese la cantidad de clientes: ");
        int cantidadClientes = sc.nextInt();

        clientes = new Cliente[cantidadClientes];

        for (int i = 0; i < clientes.length; i++) {

            System.out.println("Ingrese el numero de cliente: ");
            int numeroCliente = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del cliente: ");
            String nombreCliente = sc.nextLine();
            System.out.println("Ingrese la antiguedad del Cliente: ");
            double antiguedadCliente = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese el nombre de la mascota del Cliente: ");
            String nombreMascota = sc.nextLine();
            System.out.println("Ingrese la edad de la mascota del Cliente: ");
            double edadMascota = sc.nextDouble();

            clientes[i] = new Cliente(numeroCliente, nombreCliente, antiguedadCliente, nombreMascota, edadMascota);

        }

        
        int cantidadClientesCargados = 0;
        for (int i = 0; i < clientes.length ; i++) {
            if(clientes[i] != null)
            cantidadClientesCargados++;
        }
        System.out.println("La cantidad total de clientes cargados es de: " + cantidadClientesCargados);

        
        double acumuladorEdadMascotas = 0;
        int contadorMascotas = 0;

        for (int i = 0; i < clientes.length ; i++) {
            if(clientes[i] != null){
                acumuladorEdadMascotas += clientes[i].getEdadMascota();
                contadorMascotas++;
            }
        }
        System.out.println("El promedio de edad de las mascotas es: " + acumuladorEdadMascotas/contadorMascotas);

        
        int cantidadClientesAntiguedadMayorIgual5 = 0;
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] != null && clientes[i].getAntiguedadCliente() >= 5){
                cantidadClientesAntiguedadMayorIgual5++;
            }
        }
        System.out.println("La cantidad de clientes con antiguedad mayor o igual a 5 años es de: " + cantidadClientesAntiguedadMayorIgual5);
        
    }
    
}
