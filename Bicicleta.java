package Ejercicio2;

public class Bicicleta extends Vehiculo{
    //Atributos
    private int piñones;
    
    //Constructor
    public Bicicleta(int piñones){
				super();
        this.piñones = piñones;
    }

    //Metodos
    public void derrapa() {
        System.out.println("Estoy derrapando");
    }
}
