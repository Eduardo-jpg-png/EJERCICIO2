package vehiculo;
public class caracteristicas {
    int numpasajeros, tripu, numrued, tipo;
    String fechmatri;
    public int getPasajeros() {
        return numpasajeros;
    }
    public int getTripulacion() {
        return tripu;
    }
    public int getNumruedas() {
        return numrued;
    }
    public String getMatricula() {
        return fechmatri;
    }
    public int getTipo() {
        return tipo;
    }
    public caracteristicas (int pasajeros, int tripulacion, int numruedas, String matricula, int tipo) {
        this.numpasajeros = pasajeros;
        this.tripu = tripulacion;
        this.numrued = numruedas;
        this.fechmatri = matricula;
        this.tipo = tipo;
    }
    public void datos() {
        switch (tripu) {
            case 1:
                switch (tipo){
                    case 1:
                        System.out.println("Tu vehiculo es de tipo : Tierra \n" + "Numero de pasajeros que pueden estar : " + numpasajeros + "\nCon la matricula : " + fechmatri);
                        break;
                    case 2:
                        System.out.println("Tu vehiculo es de tipo : Agua\n" + "Numero de pasajeros que pueden estar : " + numpasajeros + "\nCon la matricula : " + fechmatri);
                        break;
                    case 3:
                      System.out.println("Tu vehiculo es de tipo : Aire\n" + "Numero de pasajeros que pueden estar : " + numpasajeros + "\nCon la matricula : " + fechmatri);
                        break;
                    default:
                        System.out.println("Tu vehículo no pertenece a ningún tipo de los aquí listados.");
                }
                break;
            case 2:
                System.out.println("Tu vehiculo es de tipo : IA\n" + "Numero de pasajeros que pueden estar : " + numpasajeros + "\nCon la matricula : " + fechmatri);
                break;
        }
    }
}
