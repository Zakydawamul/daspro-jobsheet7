import java.util.Scanner;
public class PenjualanTiketBioskop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int hargaTiket = 50000;
        int totalTiket = 0;
        int totalPenjualan = 0;
        int totalHarga;
        int jumlahTiket;

        while (true) {
            System.out.println("Masukkan jumlah tiket yang dibeli (ketik -1 untuk keluar): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == -1) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan jumlah tiket yang valid!");
                continue;
            }
            totalTiket += jumlahTiket;

            double diskon = 0;
            if (jumlahTiket > 4) {
                diskon = 0.10;
            } else if (jumlahTiket > 10) {
                diskon = 0.15;
            }
            totalHarga = (int) (jumlahTiket * hargaTiket * (1 - diskon));
            totalPenjualan += totalHarga;
            
            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp " + totalHarga );
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan tiket: " + totalPenjualan);

        sc.close();
    }
    
}
