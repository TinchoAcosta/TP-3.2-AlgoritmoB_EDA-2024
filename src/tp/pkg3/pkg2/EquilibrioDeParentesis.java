package tp.pkg3.pkg2;

public class EquilibrioDeParentesis {
    public static void validar(String cadena, Pila pila){
        int cont = -1;
        System.out.println("La cadena "+cadena+" es:");
        for(char caracter:cadena.toCharArray()){
            if(validacionDeApertura(caracter)){
                if(pila.pilaVacia()){
                    cont = 0;
                }
                pila.push(caracter);
                cont++;
                
            }else if(pila.pilaVacia()){
                if(validacionTipoCaracter(caracter)){
                    System.out.println("Irregular.");
                    return;                    
                }
            }else if((pila.verElemento()=='(' && caracter==')') || 
                    (pila.verElemento()=='[' && caracter==']') ||
                    (pila.verElemento()=='{' && caracter=='}') ||
                    (pila.verElemento()=='<' && caracter=='>')){
                pila.pop();
                cont--;
            }else if(validacionTipoCaracter(caracter)){
                System.out.println("Irregular.");
                return;                
            }
        }
        
        if(cont==-1){
            System.out.println("No hay parentesis de ningun tipo en la cadena.");
        }else if(cont!=0){
            System.out.println("Irregular.");            
        }else{
            System.out.println("Regular");
        }
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
