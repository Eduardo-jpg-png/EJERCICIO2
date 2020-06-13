package vehiculo;
import java.util.Scanner;
public class Vehiculo {
  public static void main(String[] args) {
  Scanner sc = new Scanner (System.in);
        int numpasajeros, tripu, numrued, tipo;
        String fechmatri;
        
        for (int i=0; i<10; i++) {
        System.out.print("Numero de pasajeros que pueden estar en el transporte : \n");
        numpasajeros = sc.nextInt();
        System.out.println();
        System.out.println("El vehiculo necesita tener tripulacion ");
        System.out.println("1. Sí");
        System.out.println("2. No");
        System.out.print("Opcion : ");
        tripu = sc.nextInt();
        System.out.println();
        System.out.print("Numero de ruedas del vehiculo : ");
        numrued = sc.nextInt();
        System.out.println();
        sc.nextLine();
        System.out.print("Matricula del vehiculo : ");
        fechmatri = sc.nextLine();
        System.out.println();
        System.out.println("Escoge la opcion de donde puede ir tu vehiculo : ");
        System.out.println("1 Tierra");
        System.out.println("2 Agua");
        System.out.println("3 Aire");
        System.out.print("Opcion : ");
        tipo = sc.nextInt();
        caracteristicas v1 = new caracteristicas (numpasajeros, tripu, numrued, fechmatri, tipo);
        v1.datos();
        }
        
    }
    
}