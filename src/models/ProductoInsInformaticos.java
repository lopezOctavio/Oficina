package models;

public class ProductoInsInformaticos extends Producto{
    private String fabricante;

    public ProductoInsInformaticos() {
    }

    public ProductoInsInformaticos(Integer stock, String nombre, Double precio, String fabricante) {
        super(stock, nombre, precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "ProductoInsInformaticos{" +
                "fabricante='" + fabricante + '\'' +
                "} " + super.toString();
    }
}
