package Ejercicio2;

public abstract class Vehiculo {
    //Atributos de clase
    private static int vehiculosCreados;
    private static int kilometrosTotales;
    //Atributos de instancia
    private int kilometrosRecorridos;
    
    //Constructor
    public Vehiculo() {
        this.vehiculosCreados = 0;
        this.kilometrosTotales = 0;
        this.kilometrosRecorridos = 0;
    }

    public int getkilometrosRecorridos() {
        return kilometrosRecorridos;
    }
    public static int getkilometrosTotales() {
        return kilometrosTotales;
    }
    public int getVehiculosCreados(){
        return vehiculosCreados;
    }
    public void setkilometrosRecorridos(int km) {
				kilometrosRecorridos += km;
        kilometrosTotales += km;
		}
    public void setVehiculosCreados(int nuevoVehiculo){
				vehiculosCreados = nuevoVehiculo;
		}

}
