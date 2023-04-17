package oslomet.generiske;

public class MobilyaMagaza {
    public static void main(String[] args) {
        MobilyaKayit<Mobilya> mk=new MobilyaKayit<>();

        mk.mobilyaEkle(new MobilyaImp("Kaz","Sandalye",10,1000,2));
        mk.mobilyaEkle(new MobilyaImp("Kedi","Masa",30,2000,1));

        mk.hepsiniYazdir();

        mk.duzenle();

        mk.hepsiniYazdir();
    }
}
