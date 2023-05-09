import java.util.Scanner;
import javax.xml.transform.Source;
public class calculatorarray{
public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Kalkulator Sederhana\n=========================================");
    System.out.println("Pilih operasi dasar aritmatika berikut:\n1. Penjumlahan\n2. Pengurangan");
    System.out.print("Pilihan Anda: ");
    int operator,angka1,angka2,angka3,angka4;
    operator=scn.nextInt();

    System.out.println("Masukkan angka pertama: ");
    angka1=scn.nextInt();
    System.out.println("Masukkan angka kedua: ");
    angka2=scn.nextInt();
    System.out.println("Masukkan angka ketiga: ");
    angka3=scn.nextInt();
    System.out.println("Masukkan angka keempat: ");
    angka4=scn.nextInt();
    
    int [] angka={angka1,angka2,angka3,angka4};
    int total=angka[0];
  
    switch (operator){
    case 1:
        for (int i = 1; i < angka.length; i++) {
        total += angka[i];
    }
        System.out.println("Hasil penjumlahan: " + total);
        break;
    case 2:
    for (int i = 1; i < angka.length; i++) {
        total -= angka[i];}
    
        System.out.println("Hasil pengurangan: " + total);
        break;
    default:
    System.out.println("Tidak Valid");
    System.exit(0);

    }

}
}