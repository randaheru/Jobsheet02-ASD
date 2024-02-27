public class Buku25 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        stok = stok - jml;
    }

    void restock(int jml) {
        stok = stok + jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    public Buku25() {

    }

    public Buku25(String jdl, String pg, int hal, int stok, int hrg) {
        judul = jdl;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = hrg;
    }

    
    int hitungHargaTotal(int jmlBukuTerjual) {
        return harga * jmlBukuTerjual;
    }

    
    double hitungDiskon(int hargaTotal) {
        double diskon = 0;
        if (hargaTotal > 150000) {
            diskon = 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05;
        }
        return diskon;
    }

    
    double hitungHargaBayar(int hargaTotal) {
        double diskon = hitungDiskon(hargaTotal);
        return hargaTotal - (hargaTotal * diskon);
    }
}
