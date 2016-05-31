package controlador;

import java.sql.*;

public class Conexion implements Datos_MYSQL {
    
    private static Conexion clase;
    
    private Conexion(){
    
    }
        
    public static /* sincronized*/ Conexion ObtenerInstancia(){
        /* usamos sincronisacion para evitar que los tread accedan de uno en uno al metodo */
        if(clase!=null){
            System.out.println("La clase ya estaba creada\n");
        }
        if(clase==null){
            clase= new Conexion();
            System.out.println("La clase recien se ah creado :) \n");
        }
        return clase;
    }
    
    public static Connection Conecta(){
        
        Connection conexion=null;

        try{
            Class.forName(Driver);
            conexion= DriverManager.getConnection(URL,user,password);
            System.out.println("ok Conexion");
        }
        catch(ClassNotFoundException ex){
            System.out.println("driver no encontro "+ex.getMessage());
        }
        catch(SQLException ex){
               System.out.println("error "+ex.getMessage());
        }
        return conexion;
    } 
    
}
