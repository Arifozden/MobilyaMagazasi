package oslomet.generiske;

public class MobilyaImp extends Mobilya{
    public MobilyaImp(String isim, String tip, int agirlik, int fiyat, int numara) {
        super(isim, tip, agirlik, fiyat, numara);
    }

    public String toString(){
        return getNumara()+"_"+getIsim();
    }

    public int compareTo(Mobilya m){
        return this.getNumara() - m.getNumara();
    }
}
