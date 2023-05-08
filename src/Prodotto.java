public class Prodotto {
    private String name;
    private double prezzo;
    private TipoDiProdotto tipo;

    public Prodotto(String name, double prezzo, TipoDiProdotto tipo) {
        this.name = name;
        this.prezzo = prezzo;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public TipoDiProdotto getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiProdotto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "name= '" + name + '\'' + ", prezzo= " + prezzo + '\'' + ", tipo= " + tipo;
    }

}
