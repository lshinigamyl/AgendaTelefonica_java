package controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Persona;


public class GetPersonas {
    
    private static GetPersonas clase;
    private ArrayList <String> Atributos = new ArrayList<String>();

    private GetPersonas() {
        
    }
    public static /* sincronized*/ GetPersonas ObtenerInstancia(){
        /* usamos sincronisacion para evitar que los tread accedan de uno en uno al metodo */
        if(clase!=null){
            System.out.println("La clase ya estaba creada\n");
        }
        if(clase==null){
            clase= new GetPersonas();
            System.out.println("La clase recien se ah creado :) \n");
        }
        return clase;
    }
    
    public static List<Persona> Personas(){
        List<Persona> lis=new ArrayList();
        
        Conexion.Conecta();
        String sql="select * from personas";
        try{
            PreparedStatement st=Conexion.Conecta().prepareStatement(sql);
            //Llevar la consulta a memoria
            //execute query es para ver , select from
            ResultSet rs=st.executeQuery();
            while(rs.next()){//leer fila por fila
                //next() es para leer fila con fila
                Persona ep=new Persona(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4));
                lis.add(ep);//agregar a la lista            }
            }
        }catch(Exception ex){
            System.out.println("error"+ex.getMessage());
            ex.printStackTrace();
        }
        return lis;
    }
        
    
}
