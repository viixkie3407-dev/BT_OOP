package tuan3_hangthucpham;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	
	private static final String TEN_HANG_MAC_DINH = "xxx";
	private static final double DON_GIA_MAC_DINH = 0;
	private static final LocalDate NGAY_MAC_DINH = LocalDate.now();
	
	public HangThucPham (String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		setMaHang(maHang);
		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}
	
	public HangThucPham(String maHang) throws Exception {
		if (maHang == null || maHang.trim().isEmpty()) {
			throw new Exception("Loi: Ma hang rong!");
		}
		
		this.maHang = maHang;
		this.tenHang = TEN_HANG_MAC_DINH;
		this.donGia = DON_GIA_MAC_DINH;
		this.ngaySanXuat = NGAY_MAC_DINH;
		this.ngayHetHan = NGAY_MAC_DINH;
	}
	
	public String getMaHang() {
		return maHang;
	}
	
	public void setMaHang(String maHang) throws Exception {
		if (maHang == null || maHang.trim().isEmpty()) {
			throw new Exception("Loi: Ma hang rong!");
		}
		
		this.maHang = maHang;
	}
	
	public String getTenHang() {
		return tenHang;
	}
	
	public void setTenHang(String tenHang) {
		if (tenHang == null || tenHang.trim().isEmpty()) {
			this.tenHang = TEN_HANG_MAC_DINH;
		} else {
			this.tenHang = tenHang;
		}
	}
	
	public double getDonGia() {
		return donGia;
	}
	
	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else {
			this.donGia = DON_GIA_MAC_DINH;
		}
	}
	
	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}
	
	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat != null && (ngaySanXuat.isBefore(LocalDate.now()) || ngaySanXuat.isEqual(LocalDate.now()))) {
			this.ngaySanXuat = ngaySanXuat;
		} else {
			this.ngaySanXuat = NGAY_MAC_DINH;
		}
	}
	
	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}
	
	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan != null && ngaySanXuat != null && (ngayHetHan.isAfter(ngaySanXuat) || ngayHetHan.isEqual(ngaySanXuat))) {
			this.ngayHetHan = ngayHetHan;
		} else {
			this.ngayHetHan = ngaySanXuat;
		}
	}
	
	public boolean hetHan() {
		return ngayHetHan.isBefore(LocalDate.now());
	}
	
	private String formatNgay(LocalDate ngay) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return ngay.format(dtf);
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00");
		String ghiChu = hetHan() ? "Hang het han" : "";
		return String.format("%-10s %-15s %15sVND %15s %15s %15s", maHang, tenHang, df.format(donGia), formatNgay(ngaySanXuat), formatNgay(ngayHetHan), ghiChu);
	}
}