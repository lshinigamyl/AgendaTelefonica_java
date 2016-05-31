package controlador;

import java.sql.PreparedStatement;
import modelo.Datos;



public class SetDatos {
    
    private static SetDatos clase;
    
    private SetDatos() {
        
    }
    
    public static /* sincronized*/ SetDatos ObtenerInstancia(){
        /* usamos sincronisacion para evitar que los tread accedan de uno en uno al metodo */
        if(clase!=null){
            System.out.println("La clase ya estaba creada\n");
        }
        if(clase==null){
            clase= new SetDatos();
            System.out.println("La clase recien se ah creado :) \n");
        }
        return clase;
    }
    
     public static void Añadir(Datos ep){
        String sql="Insert into datos values(?,?,?)";
        try{//preparar un objeto para ejecutar instrucciones sql 
          
            PreparedStatement st =Conexion.Conecta().prepareStatement(sql);
            //relacionar cada ? con su dato respectivo
            st.setLong(1, ep.getCodPer());
            st.setInt(2, ep.getCodAtrib());
            st.setString(3, ep.getDato());
            
            st.executeUpdate();//grabar o actulizar la instruccion sql
            // executeupdate es para insertar o grabarr
        }catch(Exception ex){
            System.out.println("error"+ex.getMessage());
            
        }
     }
    
}
