/**Crea la clase Vehiculo, así como las clases Bicicleta y Coche como 
subclases de la primera. Para la clase Vehiculo, crea los atributos de 
clase vehiculosCreadosy kilometrosTotales, así como el atributo de 
instancia kilometrosRecorridos. Crea también algún método específico 
para cada una de las subclases.
@AmandaNR*/
package Ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String [] args){

        Scanner s = new Scanner(System.in);

        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();
        
        int opcion;

				do {
					System.out.println("VEHICULOS");
					System.out.println("-----------------");
					System.out.println("1. Ver kilometros recorridos.");
					System.out.println("2. Ver kilometros totales.");
					System.out.println("3. Derrapar con la bici.");
					System.out.println("4. Tocar el claxon del coche.");
					System.out.println("5. Salir.");

					System.out.print("Elige una opcion: ");
					opcion = s.nextInt();


					switch(opcion){
							case 1: 
							bici.getkilometrosRecorridos();
							coche.getkilometrosRecorridos();
							break;
							case 2:
							Vehiculo.getkilometrosTotales();
							break;
							case 3:
							bici.derrapa();
							break;
							case 4:
							coche.tocaClaxon();
							break;
							default:
					}
				} while (opcion >= 5);
				
			}
	}
