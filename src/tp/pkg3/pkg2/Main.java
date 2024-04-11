package tp.pkg3.pkg2;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();
        String cad="[(])";
        EquilibrioDeParentesis.validar(cad, pila);
    }
    
}
