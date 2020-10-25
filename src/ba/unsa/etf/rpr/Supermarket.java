package ba.unsa.etf.rpr;

public class Supermarket {
    int max_br=1000;
    int tr_br_artikala=0;
    Artikl[] artikli= new Artikl[1000];
    Artikl[] getArtikli(){
        return artikli;
    }
    void dodajArtikl(Artikl art){

        artikli[tr_br_artikala] = art;
            tr_br_artikala = tr_br_artikala + 1;

    }
    Artikl izbaciArtiklSaKodom(String kodi){
        Artikl a= new Artikl();
        for(int i=0; i<tr_br_artikala; i++){
                if (artikli[i].kod.equals(kodi)) {
                    a=artikli[i];
                    for(int j=i; j<tr_br_artikala; j++) {
                        artikli[i]=artikli[j];
                }
                    tr_br_artikala=tr_br_artikala-1;
            }
        }
        return a;
    }
}
