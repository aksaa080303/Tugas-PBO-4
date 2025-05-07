package overloading;

class pulauJawa {
    public void provinsi(String namaProvinsi) {
        System.out.println("provinsi " + namaProvinsi);
    }

    public void provinsi(String namaProvinsi,int populasi){
        System.out.println("provinsi "+ namaProvinsi + "dengan jumlah penduduk "+ populasi);
    }

    public void provinsi(String namaProvinsi,int populasi,int luasWilayah){
        System.out.println("provinsi "+ namaProvinsi + "dengan luas wilayah "+ luasWilayah + " dan penduduk sebanyak "+ populasi);
    }
}

public class overloading1{
    public static void main(String[] args) {
        pulauJawa jawa = new pulauJawa();
        jawa.provinsi("Jawa Barat");
        jawa.provinsi("Jawa Barat ", 100000);
        jawa.provinsi("Jawa Barat ", 100000, 5000000);
    }
}

