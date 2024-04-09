package tp.pkg3.pkg2;

public class EquilibrioDeParentesis {
    public static void validar(String cadena, Pila pila){
        char aux;
        
        for(char caracter:cadena.toCharArray()){
            if(caracter=='>' || caracter=='<' 
               || caracter=='(' || caracter==')'
               || caracter=='{' || caracter=='}'
               || caracter=='[' || caracter==']'){
                pila.push(caracter);
            }
        }
        
        if(pila.verElemento()!='>' & 
           pila.verElemento()!=')' &
           pila.verElemento()!=']' &
           pila.verElemento()!='}'){
            System.out.println("Parentesis irregulares");
        }
        
        while(!pila.pilaVacia()){
            aux = pila.verElemento();
            pila.pop();
            if(aux==ParentesisDeCierre.CORCHETE.getSimbolo()){
                
            }
        }           
    }
}
