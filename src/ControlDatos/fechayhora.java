package ControlDatos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
*
* @author Mario
*/
public class fechayhora {
    
public static void main(String[] args) {
    
Date date = new Date();
//Caso 1: obtener la hora y salida por pantalla con formato:
DateFormat hourFormat = new SimpleDateFormat("ssmmHHddMMyy");
long cod = Long.parseLong(hourFormat.format(date).toString());
    System.out.println("hola :"+cod);
//Caso 2: obtener la fecha y salida por pantalla con formato:
DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
System.out.println("Fecha: "+dateFormat.format(date));
//Caso 3: obtenerhora y fecha y salida por pantalla con formato:
DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
System.out.println("Hora y fecha: "+hourdateFormat.format(date));
}
}