package tp.pkg3.pkg2;

public class EquilibrioDeParentesis {
    public static void validar(String cadena, Pila pila){
        
        for(char caracter:cadena.toCharArray()){
            if(validacionDeApertura(caracter)){
                pila.push(caracter);
                
            }else if(pila.pilaVacia()){
                System.out.println("Parentesis irregulares.");
                return;
            }else if((pila.verElemento()=='(' && caracter==')') || 
                    (pila.verElemento()=='[' && caracter==']') ||
                    (pila.verElemento()=='{' && caracter=='}') ||
                    (pila.verElemento()=='<' && caracter=='>')){
                pila.pop();
            }else if(validacionTipoCaracter(caracter)){
                System.out.println("Parentesis irregulares.");
                return;                
            }
        }
        
        System.out.println("Parentesis son regulares.");
    }
    
    private static boolean validacionDeApertura(char aux){
        if (aux=='<' || 
           aux=='(' ||
           aux=='{' ||
           aux=='['){
            return true;
        }else{
            return false;
        }
    }
    
    private static boolean validacionTipoCaracter(char aux){
        if(aux=='(' || aux==')' ||
           aux=='[' || aux==']' ||
           aux=='{' || aux=='}' ||
           aux=='<' || aux=='>'){
            return true;
        }else{
            return false;
        }
    }
}
