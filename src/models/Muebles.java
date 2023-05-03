package models;

public  class Muebles extends Producto{

    public Muebles() {
    }

    public Muebles(Integer stock, String nombre, Double precio) {
        super(stock, nombre, precio);
    }

    public Double descuento(Double descuento) {
        Double desc = (super.getPrecio()) - (super.getPrecio()*(descuento/100));
        return desc;
    }



}
