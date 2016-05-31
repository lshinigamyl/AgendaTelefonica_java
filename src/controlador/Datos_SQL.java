package controlador;

public interface Datos_SQL {
    String nomBase = "";
    String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String URL = "jdbc:sqlserver://localhost;databaseName="+nomBase;
    String user = "sa";
    String password = "alumno";
}
