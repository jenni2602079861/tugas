import java.util.Scanner;

public class faktoriallooping {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        int angka = 1;
        
while(angka!=0){
            System.out.print("masukkan angka: ");
        angka = input.nextInt();
        int hasil = angka;
        System.out.print("Perkalian faktorial adalah: ");
        for(int a = angka; a>0; a--){
            System.out.print(a);   
            if(a>1){
                System.out.print("x");
            if(angka != a){
                hasil *=a;
            }
            }
        };
        System.out.println("");
        System.out.println("hasil:"+hasil); 
    } 
        }
    }