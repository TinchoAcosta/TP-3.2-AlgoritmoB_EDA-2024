package tp.pkg3.pkg2;

public class Pila {
    private int tope = -1;
    private final int n = 100;
    private char[] pila;
    
    public Pila(){
        pila=new char[n];
        //cargar?¿
    }
    
    public boolean pilaLlena(){
        return tope == n - 1;
    }
    
    public boolean pilaVacia(){
        return tope == -1;
    }
    
    public char verElemento(){
        if(pilaVacia()){
            System.out.println("No existen elementos en la pila.");
            return ' ';
        }else{
            return pila[tope];            
        }
    }
    
    public void push(char x){
        if(tope < n - 1){
            tope = tope + 1;
            pila[tope] = x;
        }else{
            System.out.println("La pila esta completa, "
                    + "no se puede añadir elementos.");
        }
    }
    
    public void pop(){
        if(tope >= 0){
            tope = tope - 1;
        }else{
            System.out.println("La pila esta vacia, "
                    + "no se puede quitar elementos");
        }
    }
    
    public void mostrarPila(){
        System.out.println("**************************************");
        System.out.println("PILA: ");
        for (int i = 0; i < n; i++) {
            System.out.print(pila[i]+" /");
        }
        System.out.println("");
        System.out.println("TOPE: "+verElemento());
        System.out.println("**************************************");
    }
    
}
