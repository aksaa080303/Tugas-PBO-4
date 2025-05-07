package overriding;

class MakhlukLaut {
    protected String nama;

    public MakhlukLaut(String nama) {
        this.nama = nama;
    }

    public void serang() {
        System.out.println(nama + " menyerang dengan cara umum.");
    }

    public void bergerak() {
        System.out.println(nama + " bergerak biasa di laut.");
    }
}

class Hiu extends MakhlukLaut {
    public Hiu(String nama) {
        super(nama);
    }

    @Override
    public void serang() {
        System.out.println(nama + " menggigit lawan dengan gigi tajam!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berenang cepat seperti peluru pistol");
    }
}

class UburUbur extends MakhlukLaut {
    public UburUbur(String nama) {
        super(nama);
    }

    @Override
    public void serang() {
        System.out.println(nama + " menyengat musuh dengan listrik!");
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " melayang lembut di arus air");
    }
}

public class overriding2{
    public static void main(String[] args) {
        MakhlukLaut karakter = new Hiu("Hiu Martil");
        MakhlukLaut karakter2 = new UburUbur("Ubur-ubur Kristal");

        karakter.bergerak();
        karakter.serang();

        karakter2.bergerak();
        karakter2.serang();
    }
}

