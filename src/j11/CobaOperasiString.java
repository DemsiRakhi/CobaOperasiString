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
        
        System.out.println("Pada x terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("Isi variabel x besar semua : " + x.toUpperCase());
        System.out.println("Isi variabel x kecil semua : " + x.toLowerCase());
        
        String t = "   Operasi String   ";
        System.out.println("Isi variabel t : \"" + t + "\"");
        System.out.println("Isi variabel t tanpa spasi : \"" + t.trim() + "\"");
        
        System.out.println("Gabungan isi variabel x dan r : " + x.concat(r));
        
        System.out.println("Karakter mulai posisi 3 di variabel x : " + x.substring(3));
        
        System.out.println("Karakter dari posisi 3-5 di variabel x : " + x.substring(3,6));
        
        String tclean = t.trim();
        System.out.println("Isi variabel tolean : " + t.trim());
        System.out.println("Rubah 'i' jadi 'E' di variabel tolean : " + tclean.replace("i","E"));
        
        String[] arrT = tclean.split(" ");
        System.out.println("Pecah kata di variabel tclean : ");
        for(int i = 0; i < arrT.length; i++)
            System.out.println(arrT[i]);
        
        String[] arrTr = tclean.split("r");
        System.out.println("Pecah berdasarkan huruf 'r' di variabel tclean : ");
        for(int i = 0; i < arrTr.length; i++)
            System.out.println(arrTr[i]);
    }    
}
