package models;

public class Impresoras extends ProductoInsInformaticos{
    private Integer impMinuto;

    public Impresoras() {
    }

    public Impresoras(Integer stock, String nombre, Double precio, String fabricante, Integer impMinuto) {
        super(stock, nombre, precio, fabricante);
        this.impMinuto = impMinuto;
    }

    public Integer getImpMinuto() {
        return impMinuto;
    }

    public void setImpMinuto(Integer impMinuto) {
        this.impMinuto = impMinuto;
    }

    @Override
    public String toString() {
        return "Impresoras{" +
                "impMinuto=" + impMinuto +
                "} " + super.toString();
    }
}
