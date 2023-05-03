import contenedora.Oficina;
import models.*;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Sillas silla1 = new Sillas(10, "Griega", 4000.0, true);
        Escritorio escritorio1 = new Escritorio(10, "Normal", 5000.0, 100, 100);
        Impresoras impresora1 = new Impresoras(10, "ImpresoraGenerica", 40000.0, "Samsung", 100);
        Notebook note1 = new Notebook(100, "note", 30000.0, "Epson", 356);


        //CREO UNA NUEVA CLASE OFICINA PARA CONTENER LOS PRODUCTOS
        Oficina oficina = new Oficina();

        //AGREGO LOS PRODUCTOS AL ARRAY
        oficina.addProducto(silla1);
        oficina.addProducto(escritorio1);
        oficina.addProducto(impresora1);
        oficina.addProducto(note1);


        //MUESTRO LOS PRODUCTOS DEL ARRAY
        System.out.println(oficina.listarProductos());

        //APLICO LOS DESCUENTOS
        Double descSilla = silla1.descuento(10.0);
        Double descEscr = escritorio1.descuento(10.0);

        silla1.setPrecio(descSilla);
        escritorio1.setPrecio(descEscr);


        System.out.println(oficina.listarProductos());

        //CAMBIO LOS PRECIOS

        System.out.println(oficina.actualizarPrecios(10,10,10,10));



    }
}