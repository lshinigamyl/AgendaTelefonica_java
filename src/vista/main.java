package vista;

import controlador.Conexion;
import controlador.GetAtributos;
import controlador.GetPersonas;

public class main {

    public static void main(String[] args) {
        Conexion.ObtenerInstancia();
        GetAtributos.ObtenerInstancia();
        GetPersonas.ObtenerInstancia();
        frame hola = new frame();
        hola.setVisible(true);
    }
    
}
