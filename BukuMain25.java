public class BukuMain25 {
    public static void main(String[] args) {
    
        Buku25 bk1 = new Buku25();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        System.out.println("Informasi Buku 1 sebelum terjual dan harga diubah:");
        bk1.tampilInformasi();

        bk1.terjual(5);
        bk1.gantiHarga(60000);

        System.out.println("\nInformasi Buku 1 setelah terjual 5 dan harga diubah menjadi Rp 60000:");
        bk1.tampilInformasi();

        Buku25 bk2 = new Buku25("Self Reward", "Maheera Ayesha", 160, 29, 59000);

        System.out.println("\nInformasi Buku 2 sebelum terjual:");
        bk2.tampilInformasi();

        bk2.terjual(11);

        System.out.println("\nInformasi Buku 2 setelah terjual 11:");
        bk2.tampilInformasi();

        int totalHargaBk1 = bk1.hitungHargaTotal(5);
        double diskonBk1 = bk1.hitungDiskon(totalHargaBk1);
        double hargaBayarBk1 = bk1.hitungHargaBayar(totalHargaBk1);

        System.out.println("\nHarga Total Buku 1: Rp " + totalHargaBk1);
        System.out.println("Diskon Buku 1: " + (diskonBk1 * 100) + "%");
        System.out.println("Harga Bayar Buku 1 setelah diskon: Rp " + hargaBayarBk1);

        int totalHargaBk2 = bk2.hitungHargaTotal(11);
        double diskonBk2 = bk2.hitungDiskon(totalHargaBk2);
        double hargaBayarBk2 = bk2.hitungHargaBayar(totalHargaBk2);

        System.out.println("\nHarga Total Buku 2: Rp " + totalHargaBk2);
        System.out.println("Diskon Buku 2: " + (diskonBk2 * 100) + "%");
        System.out.println("Harga Bayar Buku 2 setelah diskon: Rp " + hargaBayarBk2);
    }
}
