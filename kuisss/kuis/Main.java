package kuis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import menu_makanan.mie;
import menu_makanan.soto;
import menu_minuman.dingin;
import menu_minuman.panas;

public class Main {
    private static ArrayList<makanan> daftarMakanan = new ArrayList<>();
    private static ArrayList<minuman> daftarMinuman = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Quiz Restoran!");

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu Utama:");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Tambah Menu");
            System.out.println("3. Urutkan Menu");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    lihatMenu();
                    break;
                case 2:
                    tambahMenu();
                    break;
                case 3:
                    urutkanMenu();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    private static void lihatMenu() {
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                lihatMenuMakanan();
                break;
            case 2:
                lihatMenuMinuman();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    private static void lihatMenuMakanan() {
        System.out.println("1. Soto");
        System.out.println("2. Mie");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayMenuMakanan(daftarMakanan, "Soto");
                break;
            case 2:
                displayMenuMakanan(daftarMakanan, "Mie");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    private static void displayMenuMakanan(ArrayList<makanan> menuList, String jenis) {
        System.out.println("Daftar Menu " + jenis + ":");
        for (makanan makanan : menuList) {
            if (makanan.getJenis().equals(jenis)) {
                System.out.println(makanan.getJenis()+" "+makanan.getName()+" "+makanan.getHarga());
            }
        }
    }

    private static void lihatMenuMinuman() {
        System.out.println("1. Panas");
        System.out.println("2. Dingin");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                displayMenuMinuman(daftarMinuman, "Panas");
                break;
            case 2:
                displayMenuMinuman(daftarMinuman, "Dingin");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    private static void displayMenuMinuman(ArrayList<minuman> menuList, String jenis) {
        System.out.println("Daftar Menu " + jenis + ":");
        for (minuman minuman : menuList) {
            if (minuman.getJenis().equals(jenis)) {
                System.out.println(minuman.getJenis()+" "+minuman.getName()+" "+minuman.getHarga());
            }
        }
    }

    private static void tambahMenu() {
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                tambahMenuMakanan();
                break;
            case 2:
                tambahMenuMinuman();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

private static void tambahMenuMakanan() {
    System.out.println("1. Soto");
    System.out.println("2. Mie");
    System.out.print("Pilihan Anda: ");
    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume newline character

    String nama, jenis;
    double harga;
    switch (choice) {
        case 1:
            System.out.print("Masukkan nama soto: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan harga soto: ");
            harga = scanner.nextDouble();
            jenis = "Soto";
            daftarMakanan.add(new Soto(nama, jenis, harga));
            System.out.println("Soto berhasil ditambahkan!");
            break;
        case 2:
            System.out.print("Masukkan nama mie: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan harga mie: ");
            harga = scanner.nextDouble();
            jenis = "Mie";
            daftarMakanan.add(new Mie(nama, jenis, harga));
            System.out.println("Mie berhasil ditambahkan!");
            break;
        default:
            System.out.println("Pilihan tidak valid.");
            break;
    }
}

private static void tambahMenuMinuman() {
    System.out.println("1. Panas");
    System.out.println("2. Dingin");
    System.out.print("Pilihan Anda: ");
    int choice = scanner.nextInt();
    scanner.nextLine();

    String nama, jenis;
    double harga;
    switch (choice) {
        case 1:
            System.out.print("Masukkan nama minuman panas: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan harga minuman panas: ");
            harga = scanner.nextDouble();
            jenis = "Panas";
            daftarMinuman.add(new Panas(nama, jenis, harga));
            System.out.println("Minuman panas berhasil ditambahkan!");
            break;
        case 2:
            System.out.print("Masukkan nama minuman dingin: ");
            nama = scanner.nextLine();
            System.out.print("Masukkan harga minuman dingin: ");
            harga = scanner.nextDouble();
            jenis = "Dingin";
            daftarMinuman.add(new Dingin(nama, jenis, harga));
            System.out.println("Minuman dingin berhasil ditambahkan!");
            break;
        default:
            System.out.println("Pilihan tidak valid.");
            break;
    }
}

    private static void urutkanMenu() {
        System.out.println("1. Secara Menaik (Ascending)");
        System.out.println("2. Secara Menurun (Descending)");
        System.out.print("Pilihan Anda: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(daftarMakanan);
                Collections.sort(daftarMinuman);
                System.out.println("Menu berhasil diurutkan secara menaik.");
                break;
            case 2:
                Collections.sort(daftarMakanan, Collections.reverseOrder());
                Collections.sort(daftarMinuman, Collections.reverseOrder());
                System.out.println("Menu berhasil diurutkan secara menurun.");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }
}