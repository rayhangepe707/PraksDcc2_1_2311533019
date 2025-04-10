package Pekan1;

import java.util.ArrayList;
import java.util.Scanner;

public class DaftarSiswa {
	private static ArrayList<String> daftarNamaSiswa = new ArrayList<>();
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int pilihan;
		do {
			System.out.println("\nMenu:");
			System.out.println("1.Tambah Nama Siswa");
			System.out.println("2. Tampilkan Daftar Nama Siswa");
			System.out.println("3. Hapus Nama Siswa");
			System.out.println("4. Cari Nama Siswa");
			System.out.println("5. Keluar");
			System.out.print("Pilih menu: ");
			pilihan = nextLine(); // Consume newline
			switch (pilihan) {
			case 1:
				tambahNamaSiswa(scanner);
				break;
			case 2:
				tampilkanDaftarNamaSiswa();
				break;
			case 3:
				hapusNamaSiswa(scanner);
				break;
			case 4: 
				cariNamaSiswa(scanner);
				break;
			case 5:
				System.out.print("keluar dari program");
			default:
				System.out.println("Pilihan tidak valid");
			}
		}while (pilihan !=5);	
			
		
	}
	private static void cariNamaSiswa(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	private static void hapusNamaSiswa(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	private static void tampilkanDaftarNamaSiswa() {
		// TODO Auto-generated method stub
		
	}
	private static void tambahNamaSiswa(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	private static int nextLine() {
		// TODO Auto-generated method stub
		return 0;
	}
	 

}
