package j11;
public class CobaOperasiString {
    public static void main(String[] args) {
        String identitas = "Muhammad Zidan Rakhi Ismed / X - RPL 3 / 26";
        System.out.println("Identitas: " + identitas);
        
        String x = "Operasi";
        System.out.println("Isi variabel x : " + x);
        System.out.println("\"" + x + "\" panjang karakter = " + x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("Isi Variabel y : " + y);
        System.out.println("y adalah kosong : " + x.isEmpty());
    }
}
