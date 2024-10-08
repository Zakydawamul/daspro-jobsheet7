import java.util.Scanner;
public class SistemPembayaranParkir07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenisKendaraan, durasi, total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1 mobil, 2 motor, 0 keluar): ");
            jenisKendaraan = sc.nextInt();
            if (jenisKendaraan == 1 || jenisKendaraan == 2) {
                System.out.println("Input durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi >5) {
                    total += 12500;
                } else {
                    if (jenisKendaraan == 1) {
                        total += durasi * 3000;
                    } else {
                        total += durasi * 2000;
                    }
                }
                
            }
            
        } while (jenisKendaraan != 0 );
        System.out.println("Total pembayaran: Rp " + total);
    }
    
}
