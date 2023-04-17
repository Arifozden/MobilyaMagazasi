package oslomet.generiske;

abstract class Mobilya implements Comparable<Mobilya>{
    private String isim;
    private String tip;
    private int agirlik;
    private int fiyat;
    private int numara;

    public Mobilya(String isim, String tip, int agirlik, int fiyat, int numara) {
        this.isim = isim;
        this.tip = tip;
        this.agirlik = agirlik;
        this.fiyat = fiyat;
        this.numara = numara;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public abstract String toString();
}
