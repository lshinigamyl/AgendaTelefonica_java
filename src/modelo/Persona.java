package modelo;


public class Persona {
    private long    codPer;
    private String  nomPer="";    
    private String  apePer="";
    private String  fecha="";

    public Persona(long codPer, String nomPer, String apePer, String fecha) {
        this.codPer = codPer;
        this.nomPer = nomPer;
        this.apePer = apePer;
        this.fecha = fecha;
    }

    public Persona() {
    }

    public long getCodPer() {
        return codPer;
    }

    public void setCodPer(long codPer) {
        this.codPer = codPer;
    }

    public String getNomPer() {
        return nomPer;
    }

    public void setNomPer(String nomPer) {
        this.nomPer = nomPer;
    }

    public String getApePer() {
        return apePer;
    }

    public void setApePer(String apePer) {
        this.apePer = apePer;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


}
