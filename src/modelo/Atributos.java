package modelo;

/*
Clase creada para crear objetos con dos atributos
*/
public class Atributos {
    private int codAtrib;
    private String nomAtrib;
    private boolean usoAtrib;

    public Atributos() {
        
    }
/* Preguntas  crear los metodos set y get toman mas memoria?

    */

    public Atributos(int codAtrib, String nomAtrib, boolean usoAtrib) {
        this.codAtrib = codAtrib;
        this.nomAtrib = nomAtrib;
        this.usoAtrib = usoAtrib;
    }
    

    public String getNomAtrib() {
        return nomAtrib;
    }

    public void setNomAtrib(String nomAtrib) {
        this.nomAtrib = nomAtrib;
    }

    public boolean getUsoAtrib() {
        return usoAtrib;
    }

    public void setUsoAtrib(boolean usoAtrib) {
        this.usoAtrib = usoAtrib;
    }

    public int getCodAtrib() {
        return codAtrib;
    }

    public void setCodAtrib(int codAtrib) {
        this.codAtrib = codAtrib;
    }
    
}
