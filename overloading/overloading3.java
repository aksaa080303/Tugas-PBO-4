package overloading;

public class overloading3 {
    public void kirim(String nama) {
        System.out.println("Mengirim paket ke " + nama);
    }

    public void kirim(String nama, String alamat) {
        System.out.println("Mengirim paket ke " + nama + " di alamat: " + alamat);
    }

    public void kirim(String nama, String alamat, boolean ekspres, int harga, String pembayaran) {
        String layanan = ekspres ? "Ekspres" : "Reguler";
        System.out.println("Mengirim paket ke " + nama + " di " + alamat + " dengan layanan " + layanan+"\nToatal harga: " +harga+" jenis pembayaran: "+pembayaran);
    }

    public static void main(String[] args) {
        overloading3 go = new overloading3();
        go.kirim("Sutisna");
        go.kirim("Sutisna", "Jl. Cibolang");
        go.kirim("Sutisna", "Jl. Informatika No.13", true,100000, "COD");
    }
}
