package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa k= new Korpa();
      Artikl a= new Artikl("Biciklo", 1000, "54");
      k.dodajArtikl(a);
      assertAll();
      assertEquals(1, k.getTrenutno());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Artikl a=new Artikl("Biciklo", 1000, "12");
        Korpa k= new Korpa();
        k.dodajArtikl(a);
        k.izbaciArtiklSaKodom("12");
        assertAll();
        assertEquals(0, k.getTrenutno());
    }

    @Test
    void dajUkupnuCijenuArtikala() {
     Korpa k=new Korpa();
     Artikl a=new Artikl("Biciklo", 1000, "17");
     Artikl b=new Artikl("Biciklo", 500, "19");
     k.dodajArtikl(a);
     k.dodajArtikl(b);
     assertAll();
     assertEquals(1500, k.dajUkupnuCijenuArtikala());
    }
}