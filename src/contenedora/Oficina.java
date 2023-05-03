package contenedora;

import models.*;

import java.util.ArrayList;

public class Oficina {
    private ArrayList<Producto> productos;

    public Oficina(){
        productos = new ArrayList<>();
    }

    public void addProducto(Producto nuevoProducto){
        productos.add(nuevoProducto);
    }

    public String listarProductos(){
        String lista = "No hay productos";
        if(!productos.isEmpty()){
            lista = "";
            for(Producto producto:productos){
                lista+=producto.toString()+"\n";
            }
        }
        return lista;
    }

    public String actualizarPrecios(int aumentoSilla, int aumentoEscritorio, int aumentoImpresora, int aumentoNotebook){
        String listaComparativa = "";
        for(Producto producto:productos){
            if(producto instanceof Sillas){
                listaComparativa+= "----------\n" +
                        "Precio anterior: " +producto.getPrecio().toString() + "\n";
                        producto.setPrecio((producto.getPrecio() * (100 + aumentoSilla)) / 100);
                        listaComparativa+="Precio actualizado: "+producto.getPrecio().toString()+"\n";
            } else if (producto instanceof Escritorio) {
                listaComparativa+= "----------\n" +
                        "Precio anterior: " +producto.getPrecio().toString() + "\n";
                producto.setPrecio((producto.getPrecio() * (100 + aumentoEscritorio)) / 100);
                listaComparativa+="Precio actualizado: "+producto.getPrecio().toString()+"\n";
            } else if (producto instanceof Impresoras) {
                listaComparativa+= "----------\n" +
                        "Precio anterior: " +producto.getPrecio().toString() + "\n";
                producto.setPrecio((producto.getPrecio() * (100 + aumentoImpresora)) / 100);
                listaComparativa+="Precio actualizado: "+producto.getPrecio().toString()+"\n";
            } else if (producto instanceof Notebook) {
                listaComparativa+= "----------\n" +
                        "Precio anterior: " +producto.getPrecio().toString() + "\n";
                producto.setPrecio((producto.getPrecio() * (100 + aumentoNotebook)) / 100);
                listaComparativa+="Precio actualizado: "+producto.getPrecio().toString()+"\n";
            }
        }
        return listaComparativa;
    }
}
