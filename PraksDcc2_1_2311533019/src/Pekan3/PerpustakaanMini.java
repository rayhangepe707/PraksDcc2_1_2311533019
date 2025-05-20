package Pekan3;
import java.util.Scanner;
import java.util.Stack;

// Kelas Buku
class PerpustakaanMini {
    String judul;

    PerpustakaanMini(String judul) {
        this.judul = judul;
    }

    public String toString() {
        return judul;
    }
}

// Kelas utama
public class PerpustakaanMini {
    static Stack<PerpustakaanMini> tumpukan = new Stack<>();
    static Scanner input = new Scanner(System.in);

    // Tambahkan 6 buku awal ke dalam tumpukan
    static void tambahBukuAwal() {
        tumpukan.push(new PerpustakaanMini("Algoritma Dasar"));
        tumpukan.push(new PerpustakaanMini("Struktur Data"));
        tumpukan.push(new PerpustakaanMini("Basis Data"));
        tumpukan.push(new PerpustakaanMini("Pemrograman Java"));
        tumpukan.push(new PerpustakaanMini("Jaringan Komputer"));
        tumpukan.push(new PerpustakaanMini("Sistem Operasi"));
    }

    static void tambahBuku() {
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();
        tumpukan.push(new PerpustakaanMini(judul));
        System.out.println("Buku \"" + judul + "\" telah ditambahkan ke tumpukan.");
    }

    static void ambilBuku() {
        if (tumpukan.isEmpty()) {
            System.out.println("Tumpukan kosong, tidak ada buku yang bisa diambil.");
        } else {
            PerpustakaanMini diambil = tumpukan.pop();
            System.out.println("Buku \"" + diambil + "\" telah diambil dari tumpukan.");
        }
    }

    static void tampilkanTumpukan() {
        if (tumpukan.isEmpty()) {
            System.out.println("Tumpukan kosong.");
        } else {
            System.out.println("Daftar buku di tumpukan (paling atas ditampilkan dulu):");
            for (int i = tumpukan.size() - 1; i >= 0; i--) {
                System.out.println("- " + tumpukan.get(i));
            }
        }
    }

    static void cariBuku() {
        System.out.print("Masukkan judul buku yang ingin dicari: ");
        String judulDicari = input.nextLine();
        boolean ditemukan = false;

        for (PerpustakaanMini buku : tumpukan) {
            if (buku.judul.equalsIgnoreCase(judulDicari)) {
                ditemukan = true;
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Buku \"" + judulDicari + "\" ditemukan dalam tumpukan.");
        } else {
            System.out.println("Buku \"" + judulDicari + "\" tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        // Tambahkan buku awal
        tambahBukuAwal();

        int pilihan;

        do {
            System.out.println("\n=== MENU PERPUSTAKAAN MINI ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Lihat Tumpukan Buku");
            System.out.println("4. Cari Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // hapus newline

            switch (pilihan) {
                case 1 -> tambahBuku();
                case 2 -> ambilBuku();
                case 3 -> tampilkanTumpukan();
                case 4 -> cariBuku();
                case 5 -> System.out.println("Terima kasih telah menggunakan sistem.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}