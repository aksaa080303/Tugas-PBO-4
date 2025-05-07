package overriding;

class KarakterAnime {
    protected String nama;

    public KarakterAnime(String nama) {
        this.nama = nama;
    }

    public void seranganUtama() {
        System.out.println(nama + " menggunakan serangan biasa.");
    }
}


class Ninja extends KarakterAnime {
    public Ninja(String nama) {
        super(nama);
    }

    @Override
    public void seranganUtama() {
        System.out.println(nama + " mengaktifkan Sharingan dan menyerang dengan Chidori!");
    }
}

class Penyihir extends KarakterAnime {
    public Penyihir(String nama) {
        super(nama);
    }

    @Override
    public void seranganUtama() {
        System.out.println(nama + " melepaskan Black Divider dari grimoire-nya!");
    }
}

class Saiyan extends KarakterAnime {
    public Saiyan(String nama) {
        super(nama);
    }

    @Override
    public void seranganUtama() {
        System.out.println(nama + " berubah jadi Super Saiyan dan menggunakan Kamehameha");
    }
}


public class overriding {
    public static void main(String[] args) {
        KarakterAnime k1 = new Ninja("Kakashi");
        KarakterAnime k2 = new Penyihir("Asta");
        KarakterAnime k3 = new Saiyan("Goku");

        k1.seranganUtama();
        k2.seranganUtama();
        k3.seranganUtama();
}
}
