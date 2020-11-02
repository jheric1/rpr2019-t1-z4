package ba.unsa.etf.rpr;


public class Artikl {
    String naziv;
    int cijena;
    String kod;
    Artikl(){
        naziv="";
        cijena=0;
        kod="";
    }

    Artikl(String ime, int cij, String kodi){
        naziv= ime;
        cijena=cij;
        kod=kodi;
    }
    String getNaziv(){
        return naziv;
    }
    String getKod(){
        return kod;
    }
    int getCijena(){
        return cijena;
    }


}