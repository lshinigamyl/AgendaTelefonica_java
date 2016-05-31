package controlador;

public interface Datos_MYSQL {
    String Driver = "com.mysql.jdbc.Driver";
    String Base_de_Datos = "pruebaAgenda";
    String URL = "jdbc:mysql://localhost:3306/"+Datos_MYSQL.Base_de_Datos;
    String user = "root";
    String password = "";
}
