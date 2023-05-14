import java.util.Scanner;
public class calculatorarray{
    public static void main(String[] args) {
        int[]angka=new int[4];
        Scanner scn=new Scanner(System.in);
        System.out.println("Kalkulator Sederhana\n=========================================");
        System.out.println("Pilih nomor operator dasar aritmatika berikut:\n1. Penjumlahan\n2. Pengurangan");
        System.out.print("Pilihan Anda: ");
        int operator=scn.nextInt();
        for(int i=0;i<angka.length;i++){
            System.out.print("input angka ke-" +(i+1)+ "= ");
            angka[i]=scn.nextInt();
        }
        if(operator==1){
            for (int i=1; i<angka.length; i++) {
                angka[0] += angka[i];
        }
        System.out.println("Hasil penjumlahan: " + angka[0]);
    }
        else if(operator==2){
            for (int i=1; i<angka.length; i++) {
                angka[0] -= angka[i];
        }
        System.out.println("Hasil pengurangan: " + angka[0]);
    }
        else{
            System.out.println("Tidak Valid");
            System.exit(0);}
       
        }
    }
