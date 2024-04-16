package tp.pkg3.pkg2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();
        String cad=cargarCadena();
        EquilibrioDeParentesis.validar(cad, pila);
    }

    private static String cargarCadena() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cadena deseada:");
        return leer.nextLine();
    }
    
}
