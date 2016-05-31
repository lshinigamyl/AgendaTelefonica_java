package controlador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Atributos;


public  class GetAtributos {
    
    private static GetAtributos clase;
    private static String[] A= new String[CountAtrib(true)];

    public static String[] getA() {
        Columnas();
        return A;
    }


    private GetAtributos() {
        
    }
    public static /* sincronized*/ GetAtributos ObtenerInstancia(){
        /* usamos sincronisacion para evitar que los tread accedan de uno en uno al metodo */
        if(clase!=null){
            System.out.println("La clase ya estaba creada\n");
        }
        if(clase==null){
            clase= new GetAtributos();
            System.out.println("La clase recien se ah creado :) \n");
        }
        return clase;
    }
    
    public static List<Atributos> Atrib(){
        List<Atributos> lis=new ArrayList();
        
        Conexion.Conecta();
        String sql="select * from atributos";
        try{
            PreparedStatement st=Conexion.Conecta().prepareStatement(sql);
            //Llevar la consulta a memoria
            //execute query es para ver , select from
            ResultSet rs=st.executeQuery();
            while(rs.next()){//leer fila por fila
                //next() es para leer fila con fila
                Atributos ep=new Atributos(rs.getInt(1),rs.getString(2),rs.getBoolean(3));
                lis.add(ep);//agregar a la lista            
            }
        }catch(Exception ex){
            System.out.println("error"+ex.getMessage());
            ex.printStackTrace();
        }
        return lis;
    }
    
    public static int CountAtrib(boolean Uso){
        int var=0;
        Conexion.Conecta();
        String sql="SELECT COUNT(*) FROM atributos where usoAtrib = "+Uso;
        try{
            PreparedStatement st=Conexion.Conecta().prepareStatement(sql);
            //Llevar la consulta a memoria
            //execute query es para ver , select from
            ResultSet rs=st.executeQuery();
            while(rs.next()){//leer fila por fila
                var=rs.getInt(1);
                //next() es para leer fila con fila
                         }
            
        }catch(Exception ex){
            System.out.println("error"+ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("CountAtrib = "+var);
        return var;
    }
    
    
    public static void Columnas(){
        Conexion.Conecta();
        String sql="SELECT nomAtrib FROM atributos where usoAtrib = true";
        try{
            PreparedStatement st=Conexion.Conecta().prepareStatement(sql);
            //Llevar la consulta a memoria
            //execute query es para ver , select from
            ResultSet rs=st.executeQuery();
            int i=0;
            while(rs.next()){//leer fila por fila
                
                A[i]=rs.getString(1);
                i++;
                //next() es para leer fila con fila
                         }
            i=0;
            
        }catch(Exception ex){
            System.out.println("error"+ex.getMessage());
            ex.printStackTrace();
        }        
      
    } 
        
    
    
    //SELECT nomAtrib FROM atributos where usoAtrib = true


        
    
    
}
