package modelo;

public class Datos {
    
    private long codPer;
    private int  codAtrib;
    private String dato;

    public Datos() {
    }

    public Datos(long codPer, int codAtrib, String dato) {
        this.codPer = codPer;
        this.codAtrib = codAtrib;
        this.dato = dato;
    }

    public long getCodPer() {
        return codPer;
    }

    public void setCodPer(long codPer) {
        this.codPer = codPer;
    }

    public int getCodAtrib() {
        return codAtrib;
    }

    public void setCodAtrib(int codAtrib) {
        this.codAtrib = codAtrib;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    
    
    
    
    
}
