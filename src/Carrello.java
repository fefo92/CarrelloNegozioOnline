import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Carrello {
    int id;
    private List<Prodotto> prodotti;

    public Carrello(int id, List<Prodotto> prodotti) {
        this.id = id;
        this.prodotti = new ArrayList<>(prodotti);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(List<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public void aggiungiProdotti(Prodotto p) {
        prodotti.add(p);
    }

    public void rimuoviProdotti(Prodotto p) {
        prodotti.remove(p);
    }

    public String calcolaTotale() {
        double sum = 0;
        for (Prodotto pr : prodotti) {
            sum += pr.getPrezzo();

        }
        return "Il totale del carrello è " + sum;
    }

    public void printInfo() {
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto);

        }
    }

    public void salvaCarrello() throws IOException {
        File file = new File("carrello.csv");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Nome,");
        bufferedWriter.write("Prezzo,");
        bufferedWriter.write("TipoProdotto,");

        for (Prodotto p : prodotti) {
            String nome = p.getName();
            double prezzo = p.getPrezzo();
            String tipo = String.valueOf(p.getTipo());
            bufferedWriter.write("\n"+ nome + ", " + prezzo + ", " + tipo+ "\n");

        }
        bufferedWriter.close();
    }
}
