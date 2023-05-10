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

    /*
     * Metodo che aggiunge il prodotta al carrello
     */
    public void aggiungiProdotti(Prodotto p) {
        prodotti.add(p);
    }

    /*
     * Metodo che rimuove il prodotto dal carrello
     */
    public void rimuoviProdotti(Prodotto p) {
        prodotti.remove(p);
    }

    /*
     * Metodo che ritorna il totale del carrello
     */
    public String calcolaTotale() {
        double sum = 0;
        for (Prodotto pr : prodotti) {
            sum += pr.getPrezzo();

        }
        return "Il totale del carrello è " + sum;
    }
    /*
     * Metodo che stampa in console i prodotti
     */
    public void printInfo() {
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto);

        }
    }

    /*
     * Metodo che scrive il carrello in un file esterno .csv
     */
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
