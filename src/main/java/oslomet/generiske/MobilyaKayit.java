package oslomet.generiske;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobilyaKayit <T extends Mobilya>{
    private List<T> mobilyalar;


    public MobilyaKayit(){
        mobilyalar= new ArrayList<>();
    }
    public void mobilyaEkle(T mobilya){
        mobilyalar.add(mobilya);
    }

    public T getMobilya(int numara){
        for(T mobilya : mobilyalar){
            if(mobilya.getNumara()==numara)
                return mobilya;
        }
        return null;
    }

    public void mobilyaSil(int numara){
        for(T mobilya : mobilyalar){
            if(mobilya.getNumara()==numara)
                mobilyalar.remove(mobilya);
        }
    }

    public void hepsiniYazdir(){
        for(T mobilya : mobilyalar){
            System.out.println(mobilya);
        }
    }
    public void duzenle(){
        Collections.sort(mobilyalar);
    }
}
