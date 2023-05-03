package models;

public class Notebook extends ProductoInsInformaticos{
    private Integer memoria;

    public Notebook() {
    }

    public Notebook(Integer stock, String nombre, Double precio, String fabricante, Integer memoria) {
        super(stock, nombre, precio, fabricante);
        this.memoria = memoria;
    }

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "notebook{" +
                "memoria=" + memoria +
                "} " + super.toString();
    }


}
