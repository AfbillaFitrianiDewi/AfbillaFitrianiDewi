
package konversigit;

/**
 *
 * @author AFBILLA FITRIANI DEWI
 */
import java.util.Scanner;

public class KonversiGit {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //instansikan objek untuk mengambil nilai input
        System.out.println("Masukan angka dalam beberapa detik : ");
        int detik = input.nextInt();
        //menyimpan nilai input user kevariable detik
        
        System.out.println("Hasil konversi : " + detik + " Detik = " + konversiDetikKeMenit (detik) + " Menit ");
        System.out.println("Hasil Konversi : " + detik + " Detik = " + konversiDetikKeJam (detik) + " Jam ");
        //tampilkan output hasil konversi
    }
    
    public static int konversiDetikKeMenit(int detik){
        //menggunakan method overloading
        int hasil = 0;
        int menit = detik / 60;
        //menghitung konversi dari detik ke menit
        hasil = hasil + menit;
        return hasil;
        //mengembalikan nilai
    }
    public static int konversiDetikKeJam(int detik){
        //menggunakan method overloading
        int hasil = 0;
        int jam = detik / 3600;
        //menghitung konversi dari detik ke jam
        hasil = hasil + jam;
        return hasil;
        //mengembalikan nilai
    }
}
