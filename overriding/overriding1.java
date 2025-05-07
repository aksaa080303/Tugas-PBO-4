package overriding;

class Surat {
    public void kirim() {
        System.out.println("Mengirim Surat Manual");
    }
}

class Email extends Surat {
    @Override
    public void kirim() {
        System.out.println("Mengirim Surat via Email.");
    }
}

class WhatsApp extends Surat {
    @Override
    public void kirim() {
        System.out.println("Mengirim Surat via WhatsApp.");
    }
}

public class overriding1 {
    public static void main(String[] args) {
        Surat s = new Surat();
        Surat t = new Email();
        Surat u = new WhatsApp();
        s.kirim();
        t.kirim();
        u.kirim();
    }
}
