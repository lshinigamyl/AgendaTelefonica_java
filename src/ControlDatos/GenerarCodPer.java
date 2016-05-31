package ControlDatos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerarCodPer {
        
    private static GenerarCodPer clase;
    private static Date date;
    private long codPer;
    private static DateFormat getFormat;
    
    
    private GenerarCodPer(){
        
    }
    
    public static /* sincronized*/ GenerarCodPer ObtenerInstancia(){
        /* usamos sincronisacion para evitar que los tread accedan de uno en uno al metodo */
        if(clase!=null){
            System.out.println("La clase ya estaba creada\n");
        }
        if(clase==null){
            clase= new GenerarCodPer();
            date = new Date();
            getFormat= new SimpleDateFormat("ssmmHHddMMyy");            
            System.out.println("La clase recien se ah creado :) \n");
        }
        return clase;
    }
    public void generarcod(){
        //Caso 1: obtener la hora y salida por pantalla con formato:
        codPer= Long.parseLong(getFormat.format(date).toString());
        
        System.out.println(""+codPer);
    }

    public long getCodPer() {
        generarcod();
        System.out.println(codPer);
        return codPer;
    }

    public void setCodPer(long codPer) {
        this.codPer = codPer;
    }
    
}
