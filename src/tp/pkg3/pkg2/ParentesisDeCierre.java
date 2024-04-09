package tp.pkg3.pkg2;

public enum ParentesisDeCierre {
    PARENTESIS(')'),
    CORCHETE(']'),
    LLAVE('}');
    
    private final char simbolo;

    ParentesisDeCierre(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }
}
