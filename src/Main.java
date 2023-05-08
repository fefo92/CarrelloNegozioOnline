import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        Carrello carrello = new Carrello(1, new ArrayList<>());

        Prodotto prodotto1 = new Prodotto("Mouse Logitech", 9.99, TipoDiProdotto.ACCESSORI_TECNOLOGIA);
        Prodotto prodotto2 = new Prodotto("Tastiera Logitech", 14.99, TipoDiProdotto.ACCESSORI_TECNOLOGIA);
        Prodotto prodotto3 = new Prodotto("Cuffie Airpods", 250, TipoDiProdotto.ACCESSORI_TECNOLOGIA);
        Prodotto prodotto4 = new Prodotto("Monitor Dell", 149.90, TipoDiProdotto.TECNOLOGIA);

        carrello.aggiungiProdotti(prodotto1);
        carrello.aggiungiProdotti(prodotto2);
        carrello.aggiungiProdotti(prodotto3);
        carrello.aggiungiProdotti(prodotto4);

//        carrello.rimuoviProdotti(prodotto3);

        carrello.printInfo();
        carrello.salvaCarrello();
        System.out.println(carrello.calcolaTotale());


    }
}