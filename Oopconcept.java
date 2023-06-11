import java.util.Scanner;
class Candidate {
     String name,gender,address,initial;
     int age;

     Candidate( String name,String gender, String address,  int age, String initial){
          this.name = name;
          this.gender = gender;
          this.address = address;
          this.initial = initial;
          this.age = age;
     }
}
public class Oopconcept {
public static void main(String[] args) {
     int Choose, idx = 0;
     Candidate[] kandidat = new Candidate[100];
     Scanner scn = new Scanner(System.in);

     do{
          System.out.println("\nPower Recruitment");
          System.out.println("------------------");
          System.out.println("1. Input New Candidate");
          System.out.println("2. View Candidate's Data");
          System.out.println("3. Remove Candidate");
          System.out.println("4. Exit");
          System.out.print("Choose: ");
          Choose = scn.nextInt();
          scn.nextLine();
     
     switch(Choose){
          case 1:
          String name, gender, address;
          String[] words;
          int age;

          do{
            System.out.print("Input candidate's name: ");
               name = scn.nextLine();
               words = name.split(" ", 10);
               if(words.length < 2){
                    System.out.println("The Minimum Name Length is 2 Words");
               }
          } while(name.length() < 5 || name.length() > 20 || words.length < 2);
         
          String initial = "";
          
          for(int i = 0; i < words.length; i++){
               initial = initial + words[i].charAt(0);
          }
          initial = initial.toUpperCase();

          do{
          System.out.print("Input Candidate's Gender: ");
          gender = scn.nextLine();
          gender = gender.toLowerCase();
          if(!gender.equals("male") && !gender.equals("female")){
               System.out.println("Gender Must be 'Male' or 'Female'");
          }
          }while(!gender.equals("male") && !gender.equals("female"));

          do{
          System.out.print("Input Candidate's Address: ");
          address = scn.nextLine();

          if(!address.endsWith("Street")){
               System.out.println("Address Must End With 'Street'");
               continue;
          }
     }while(!address.endsWith("Street"));


          do{
               System.out.print("Input Candidate's Age: ");
               age = scn.nextInt();
               scn.nextLine();
               if (age < 17){
                    System.out.println("Please Enter a Valid Age Between 17 to 30");
               }else if(age >30){
                    System.out.println("Please Enter a Valid Age Between 17 to 30");
               }
          }while ( age < 17 || age > 30);

          System.out.println("\nThank You for Reggistering! Your Initial is: "+ initial);

          Candidate candidate = new Candidate(name, gender, address, age, initial);
          kandidat[idx] = candidate;
          idx++;
          break;
          
          case 2:
               if(idx == 0){
                    System.out.println("\nNo Data!\n");
               }else{
                    System.out.println();
                    bubbleSort(kandidat,idx);
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("No. \t| Name \t \t| Initial \t| Gender \t \t| Age\t| Address\t \t \t|");
                    for(int i = 0; i<idx; i++){
                    System.out.println(i+1 + ". \t| " + kandidat[i].name+"\t| " + kandidat[i].initial + "\t \t| " + kandidat[i].gender + "\t \t| " + kandidat[i].age + "\t| " + kandidat[i].address + "\t \t|");
                    
               }System.out.println("-----------------------------------------------------------------------------------------");
          }
          break;

          case 3:
               if(idx == 0){
                    System.out.println("\nNo Data!\n");
               }else{
                    System.out.print("Enter the Number of the Candidates to Delete [0 for Cancel]: ");
                    int delete = scn.nextInt();
                    scn.nextLine();

                    if(delete < 0 || delete > idx){
                         System.out.println("Please Enter a Valid Number!");
                    }else if(delete == 0){
                         System.out.println("Canceled");

                    }else{
                         for(int i = delete-1; i<idx-1; i++){
                              kandidat[i] = kandidat[i+1];
                         }
                         kandidat[idx-1] = null;
                         idx--;
                    }
               }
          break;

          case 4:
          System.out.println("\nProgram Exited\n");
          return;
          
          default:
          System.out.println("\nPlease Input a Valid Choice!\n");
          break;

     }
          }while (Choose != 4);
}

     static void bubbleSort(Candidate candidates[], int n){
          int i, j;
          Candidate temp;
          for(i = 0; i < n - 1; i++){
               for(j = 0; j < n - i - 1; j++){
                    if (candidates[j].name.compareTo(candidates[j+1].name) > 0){
                         temp = candidates [j];
                         candidates[j] = candidates[j+1];
                         candidates[j+1] = temp;
                    }
               }
          }
     }

}