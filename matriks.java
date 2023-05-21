import java.util.Scanner;
public class matriks{
Scanner scn=new Scanner (System.in);

    public void isi (int data [] []){
        System.out.println("Masukkan nilai matriks: ");
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Baris ke-"+(i+1)+" kolom ke-"+(j+1)+": ");
                data [i][j]=scn.nextInt();
            }
        }
    }

    public void tampilan (int tampil[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(tampil[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public int [][] penjumlahan (int M1[][], int M2 [][]){
        int [][] penjumlahan=new int [3][3];
        for(int i=0; i<3;i++){
            for(int j=0;j<3;j++){
                penjumlahan[i][j]=M1[i][j]+M2[i][j];
            }
        } return penjumlahan;
    }

    public static void main(String[] args) {
        matriks matrix =new matriks();
        int [][] matriks1=new int [3][3];
        int [][] matriks2=new int[3][3];
        int [][] hasil=new int[3][3];

        System.out.println("PENJUMLAHAN 2 BUAH MATRIKS\n==============================");
        matrix.isi(matriks1);
        matrix.isi(matriks2);

        System.out.println("Matriks pertama: ");
        matrix.tampilan(matriks1);
        System.out.println("Matriks kedua: ");
        matrix.tampilan(matriks2);

        hasil=matrix.penjumlahan(matriks1,matriks2);
        System.out.println("Hasil penjumlahan kedua matriks adalah: ");
        matrix.tampilan(hasil);
    }

}
