package tuan3_hangthucpham;

import java.time.LocalDate;

public class TestHangThucPham {

	public static void main(String[] args) {
		try {
			HangThucPham htp1 = new HangThucPham("001", "Gao", 100000, LocalDate.of(2018, 7, 10), LocalDate.of(2018, 7, 10));
			HangThucPham htp2 = new HangThucPham("002", "Mi", 5000, LocalDate.of(2018, 3, 1), LocalDate.of(2018, 9, 1));
			HangThucPham htp3 = new HangThucPham("003", "Nuoc", 10000, LocalDate.of(2017, 3, 1), LocalDate.of(2018, 3, 1));
			
			System.out.println("Ma_Hang     Ten_Hang           Don_Gia           Ngay_San_Xuat     Ngay_Het_Han     Ghi_Chu");
			System.out.println("----------------------------------------------------------------------------------------------");
			
			System.out.println(htp1);
			System.out.println(htp2);
			System.out.println(htp3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}