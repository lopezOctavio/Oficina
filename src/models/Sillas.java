package models;

public class Sillas extends Muebles{
    private Boolean traeRuedas;

    public Sillas() {
    }

    public Sillas(Integer stock, String nombre, Double precio, Boolean traeRuedas) {
        super(stock, nombre, precio);
        this.traeRuedas = traeRuedas;
    }

    public Sillas(Boolean traeRuedas) {
        this.traeRuedas = traeRuedas;
    }

    public Boolean getTraeRuedas() {
        return traeRuedas;
    }

    public void setTraeRuedas(Boolean traeRuedas) {
        this.traeRuedas = traeRuedas;
    }

    @Override
    public String toString() {
        return "Sillas{" +
                "traeRuedas=" + traeRuedas +
                "} " + super.toString();
    }
}
