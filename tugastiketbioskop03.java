import java.util.Scanner;

public class tugastiketbioskop03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiket;
        String namaPelanggan;
        int hargaTiketPerUnit = 50000;
        double totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (atau ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah tiket: ");
            tiket = sc.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silahkan masukkan jumlah yang valid.");
                sc.nextLine(); // Membersihkan input buffer
                continue;
            }

            // Menghitung total harga tanpa diskon
            totalHarga = tiket * hargaTiketPerUnit;

            // Pemberian diskon sesuai jumlah tiket
            if (tiket > 10) {
                totalHarga = totalHarga * 0.85; // Diskon 15%
                System.out.println("Anda mendapatkan diskon 15%");
            } else if (tiket > 4) {
                totalHarga = totalHarga * 0.90; // Diskon 10%
                System.out.println("Anda mendapatkan diskon 10%");
            }

            System.out.println("Total yang harus dibayar: Rp " + totalHarga);

            sc.nextLine(); // Membersihkan input buffer

        } while (true);

        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}
