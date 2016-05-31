package controlador;

import ControlDatos.GenerarCodPer;
import java.sql.PreparedStatement;
import modelo.Persona;

public class SetPersonas {
    
    private static SetPersonas clase;
    private static GenerarCodPer cod;

    public static GenerarCodPer getCod() {
        return cod;
    }

    public static void setCod(GenerarCodPer aCod) {
        cod = aCod;
    }
    
    private SetPersonas() {
        
    }
    public static /* sincronized*/ SetPersonas ObtenerInstancia(){
        /* usamos sincronisacion para evitar que los tread accedan de uno en uno al metodo */
        if(clase!=null){
            System.out.println("La clase ya estaba creada\n");
        }
        if(clase==null){
            clase= new SetPersonas();
            setCod(GenerarCodPer.ObtenerInstancia());
            System.out.println("La clase recien se ah creado :) \n");
        }
        return clase;
    }
    
     public static void Añadir(Persona ep){
        String sql="insert into personas values(?,?,?,?);";
        try{//preparar un objeto para ejecutar instrucciones sql 
          
            PreparedStatement st =Conexion.Conecta().prepareStatement(sql);
            //relacionar cada ? con su dato respectivo
            st.setLong(1, ep.getCodPer());
            st.setString(2, ep.getNomPer());
            st.setString(3, ep.getApePer());
            st.setString(4, ep.getFecha());
            st.executeUpdate();//grabar o actulizar la instruccion sql
            // executeupdate es para insertar o grabarr
        }catch(Exception ex){
            System.out.println("error"+ex.getMessage());
            
        }
     }
    
}
