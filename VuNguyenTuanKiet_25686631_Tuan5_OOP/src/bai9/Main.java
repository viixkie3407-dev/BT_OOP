package bai9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong cong nhan: ");
		int n = sc.nextInt();
		
		DanhSachCongNhan ds = new DanhSachCongNhan(n);
		
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap cong nhan thu " + (i + 1));
			sc.nextLine();
			
			System.out.print("Ma cong nhan: ");
			String maCN = sc.nextLine();
			
			System.out.print("Ho: "); 
			String ho = sc.nextLine();
			
			System.out.print("Ten: ");
			String ten = sc.nextLine();
			
			System.out.print("So SP: "); 
			int soSP = sc.nextInt();
			
			CongNhan cn = new CongNhan(maCN, ho, ten, soSP);
			
			if (ds.themCongNhan(cn)) {
				System.out.println("Them cong nhan thanh cong!");
			} else {
				System.out.println("Danh sach da day!");
			}
		}
		
		System.out.println("\n===== DANH SACH CONG NHAN =====");
		ds.xuatDanhSach();
		
		System.out.println("\nSo luong cong nhan: " + ds.tinhSoLuong());
		
		System.out.println();
		ds.xuatTren200SanPham();
		
		ds.sapXepGiamDan();
		
		System.out.println("\n===== SAU KHI SAP XEP GIAM DAN =====");
		ds.xuatDanhSach();
		
		sc.close();
	}
}
