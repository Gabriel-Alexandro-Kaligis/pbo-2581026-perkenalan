import java.util.Scanner;

public class Perkenalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        String NIM = scanner.nextLine();

        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        System.out.print("Masukkan tinggi badan Anda: ");
        double tinggi = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Masukkan tempat tinggal: ");
        String kota = scanner.nextLine();

        System.out.println("Halo " + nama + ", NIM " + NIM + ", umur " + umur + " tahun, tinggi " + tinggi + " cm, tinggal di " + kota + ".");
    }
}