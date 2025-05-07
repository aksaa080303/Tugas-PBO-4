package overloading;

public class overloading2 {
    public void setAlarm(int jam) {
        System.out.println("Alarm disetel jam: " + jam + ":00");
    }

    public void setAlarm(int jam, int menit,String waktu) {
        System.out.println("Alarm disetel jam: " + jam + ":" + menit + waktu);
    }

    public void setAlarm(String Kapan) {
        System.out.println("Alarm disetel untuk: " + Kapan);
    }

    public static void main(String[] args) {
        overloading2 baru = new overloading2();
        baru.setAlarm(04);
        baru.setAlarm(04,30, " AM");
        baru.setAlarm("setiap hari");
    }
}