package Ejercicio2;

public class Coche extends Vehiculo {
    //Atributos
    private int cilindrada;
    
    //Constructor
    public Coche(int cilindrada){
				super();
        this.cilindrada = cilindrada;
    }

    //Metodos
    public void tocaClaxon() {
        System.out.println("pi - pi");
    }
}
