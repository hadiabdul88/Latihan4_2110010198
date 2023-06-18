
package penilaian;
public class Main {
    public static void main (String []args){
        NilaiAkhir hadi= new NilaiAkhir("hadi","2110010198",90,90,90);
        System.out.println("nama = "+ hadi.getNama());
        System.out.println("npm = "+ hadi.getNpm());
        System.out.println("NilaiAkhir = "+ hadi.hitungNilaiAkhir());
        
        
    }
    
}
