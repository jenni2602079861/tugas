import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String address;

    public Patient(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

public class datapasien {
    private static List<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int choose;
        do {
             System.out.println("");
            System.out.println("            Patient's Data Program");
            System.out.println("            ++++++++++++++++++++++");
            System.out.println("1. Input New Data");
            System.out.println("2. View Patient's Data");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            choose = scn.nextInt();
            scn.nextLine();

            switch (choose) {
                case 1:
                    inputNewData(scn);
                    break;
                case 2:
                    viewPatientsData(scn);
                    break;
                case 3:
                System.out.println("Program closed.");
                System.exit(0);
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choose!=3);
    }

    private static void inputNewData(Scanner scn) {
        String name;
        int age;
        String address;

        do {
            System.out.print("Input name [3..20]: ");
            name = scn.nextLine();
        } while (name.length()<3 || name.length()>20);

        do {
            System.out.print("Input age [10..100]: ");
            try {
                age = scn.nextInt();
                scn.nextLine();
            } catch (InputMismatchException e) {
                age = -1;
                System.out.print("Input must be numeric!");
                System.out.println();
                scn.nextLine();
            }
        } while (age < 10 || age > 100);

        do {
            System.out.print("Input address [5..30]: ");
            address = scn.nextLine();
        } while (address.length()<5 || address.length()>30);

        patients.add(new Patient(name, age, address));
        System.out.println("Data has been successfully inserted!");
    }

    private static void viewPatientsData(Scanner scn) {
        if (patients.isEmpty()) {
            System.out.println("No Data!");
            return;
        }

        System.out.println();
        displayPatientsData();

        int choice;
        do {
            System.out.println();
            System.out.println("1. Sort Data by Name Ascending");
            System.out.println("2. Sort Data by Name Descending");
            System.out.println("3. Sort Data by Age Ascending");
            System.out.println("4. Sort Data by Age Descending");
            System.out.println("5. Back");
            System.out.print("Choose: ");

            choice = scn.nextInt();
            scn.nextLine();
            System.out.println();

            switch (choice) {
                case 1:
                    sortDataByNameAscending();
                    break;
                case 2:
                    sortDataByNameDescending();
                    break;
                case 3:
                    sortDataByAgeAscending();
                    break;
                case 4:
                    sortDataByAgeDescending();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice!=5);
    }

    private static void sortDataByNameAscending() {
        Collections.sort(patients, Comparator.comparing(Patient::getName));
        displayPatientsData();
    }

    private static void sortDataByNameDescending() {
        Collections.sort(patients, Comparator.comparing(Patient::getName).reversed());
        displayPatientsData();
    }

    private static void sortDataByAgeAscending() {
        Collections.sort(patients, Comparator.comparingInt(Patient::getAge));
        displayPatientsData();
    }

    private static void sortDataByAgeDescending() {
        Collections.sort(patients, Comparator.comparingInt(Patient::getAge).reversed());
        displayPatientsData();
    }

    private static void displayPatientsData() {
        System.out.printf("%-5s%-20s%-5s%-30s%n", "No.", "Name", "Age", "Address  ");
        System.out.println("=======================================");

         for (int i = 0; i < patients.size(); i++) {
            Patient patient = patients.get(i);
            System.out.printf("%-5s%-20s%-5d%-30s%n", (i + 1), patient.getName(), patient.getAge(), patient.getAddress());
        }
    }
}