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
        
        System.out.println("Isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("Isi variabel z : " + z);
        System.out.println("Isi x sama dengan z (Case Sensitive): "
                           + x.equals(z));
        
        String r = "Operasi";
        System.out.println("Isi variabel r: " + r);
        System.out.println("Isi x sama dengan r (Case Sensitive) : "
                           + x.equals(r));
        System.out.println("Isi x sama dengan r (Not Case Sensitive) : "
                           + x.equalsIgnoreCase(r));
        
        System.out.println("Perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("Perbandingan isi x dengan z (Case Sensitive) : "
                           + x.compareTo(z));
        System.out.println("Perbandingan isi x dengan r (Case Sensitive) : "
                           + x.compareTo(r));
        System.out.println("Perbandingan isi x dengan r (Not Case Sesitive) : "
                           + x.compareToIgnoreCase(r));
        
        String s = "Operasi";
        System.out.println("Isi variabel a : " + s);
        System.out.println("Perbandingan isi r dengan s (Case Sensitive) : "
                           + r.compareTo(s));
    }
}
