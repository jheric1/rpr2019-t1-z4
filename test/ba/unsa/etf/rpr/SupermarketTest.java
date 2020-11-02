package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket s=new Supermarket();
        Artikl a=new Artikl("Biciklo", 400, "15");
        s.dodajArtikl(a);

        assertEquals(1, s.getTr_br_artikala());

    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket s=new Supermarket();
        Artikl a=new Artikl("Biciklo", 400, "15");
        s.dodajArtikl(a);
        s.izbaciArtiklSaKodom("15");
        assertEquals(0, s.getTr_br_artikala());
    }
}