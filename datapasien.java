import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class datapasien {
    static ArrayList<Patient> pasien = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        while (true) {
            displayMainMenu();
            int choose = scn.nextInt();

            switch (choose) {
                case 1:
                    inputDataPasien(scn);
                    break;
                case 2:
                    viewDataPasien(scn);
                    break;
                case 3:
                    System.out.println("Program Closed");
                    return;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    static void displayMainMenu() {
        System.out.println("");
        System.out.println("            Patient's Data Program");
        System.out.println("            ++++++++++++++++++++++");
        System.out.println("1. Input New Data");
        System.out.println("2. View Patient's Data");
        System.out.println("3. Exit");
        System.out.print("Choose: ");
    }

    static void inputDataPasien(Scanner scn) {
        System.out.print("Input name [3..20]: ");
        scn.nextLine();
        String name = scn.nextLine();

        System.out.print("Input age [10..100]: ");
        int age = scn.nextInt();

        System.out.print("Enter address [5..30]: ");    
        scn.nextLine();
        String address = scn.nextLine();

        if (validateData(name, age, address)) {
            Patient patient = new Patient(name, age, address);
            pasien.add(patient);
            System.out.println("Data has been successfully inserted!");
        } else {
            System.out.println("Invalid");
        }
    }

    static void viewDataPasien(Scanner scn) {
        if (pasien.isEmpty()) {
            System.out.println("No Data!");
            return;
        }

        System.out.println("No\tName\tAge\tAddress");
        for (int i = 0; i < pasien.size(); i++) {
            Patient patient = pasien.get(i);
            System.out.println((i + 1) + "\t" + patient.getName() + "\t" + patient.getAge() + "\t" + patient.getAddress());
        }

        displaySortMenu();
        int choose = scn.nextInt();

        switch (choose) {
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
                System.out.println("Invalid choice. Returning to main menu.");
        }
    }

    static void displaySortMenu() {
        System.out.println("\nSort Data:");
        System.out.println("1. Sort Data by Name Ascending");
        System.out.println("2. Sort Data by Name Descending");
        System.out.println("3. Sort Data by Age Ascending");
        System.out.println("4. Sort Data by Age Descending");
        System.out.println("5. Back");
        System.out.print("Choose: ");
    }

    static void sortDataByNameAscending() {
        Collections.sort(pasien, Comparator.comparing(Patient::getName));
        System.out.println("Data sorted by name (ascending) successfully!");
    }

    static void sortDataByNameDescending() {
        Collections.sort(pasien, Comparator.comparing(Patient::getName).reversed());
        System.out.println("Data sorted by name (descending) successfully!");
    }

    static void sortDataByAgeAscending() {
        Collections.sort(pasien, Comparator.comparingInt(Patient::getAge));
        System.out.println("Data sorted by age (ascending) successfully!");
    }

    static void sortDataByAgeDescending() {
        Collections.sort(pasien, Comparator.comparingInt(Patient::getAge).reversed());
        System.out.println("Data sorted by age (descending) successfully!");
    }

    static boolean validateData(String name, int age, String address) {
        return name.length() >= 3 && name.length() <= 20 &&
                age >= 10 && age <= 100 &&
                address.length() >= 5 && address.length() <= 30;
    }
}

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