package TugasInheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih = 0;

        do {
            System.out.println("\n=== MENU TUGAS INHERITANCE & POLYMORPHISM ===");
            System.out.println("1. Uji BujurSangkar");
            System.out.println("2. Uji Lingkaran");
            System.out.println("3. Uji Silinder");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
                System.out.print("Masukkan sisi bujursangkar : ");
                double s = input.nextDouble();
                input.nextLine();
                System.out.print("Masukkan warna            : ");
                String w = input.nextLine();

                Bentuk bs = new BujurSangkar(s, w);
                bs.printInfo();
            } else if (pilih == 2) {
                System.out.print("Masukkan radius lingkaran : ");
                double r = input.nextDouble();
                input.nextLine();
                System.out.print("Masukkan warna            : ");
                String warnaLingkaran = input.nextLine();

                Bentuk lk = new Lingkaran(r, warnaLingkaran);
                lk.printInfo();
            } else if (pilih == 3) {
                System.out.print("Masukkan tinggi silinder  : ");
                double t = input.nextDouble();
                System.out.print("Masukkan radius silinder  : ");
                double r = input.nextDouble();
                input.nextLine();
                System.out.print("Masukkan warna            : ");
                String w = input.nextLine();

                Bentuk sl = new Silinder(t, r, w);
                sl.printInfo();
            } else if (pilih == 4) {
                System.out.println("Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 4);

        input.close();
    }
}