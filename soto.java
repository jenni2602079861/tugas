package menu_makanan;

import kuis.makanan;

public class soto {
    class Soto extends makanan {
    private String name;
    private String jenis;
    private int harga;

    public Soto (String name, String jenis, int harga) {
        this.name = name;
        this.jenis = jenis;
        this.harga = harga;
    }
    @Override
    public String getName(){
        return this.name;
    }

     @Override
    public String getJenis(){
        return this.jenis;
    }

    @Override
    public int getHarga(){
        return this.harga;
    }

    public void food() {
    }
}

}