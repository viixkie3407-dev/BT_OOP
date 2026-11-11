package bai9;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private int mSoSP;
	
	public CongNhan() {
		maCN = "";
		mHo = "";
		mTen = "";
		mSoSP = 0;
	}
	
	public CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) {
		this.maCN = maCN;
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) {
		this.mHo = mHo;
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) {
		this.mTen = mTen;
	}
	public int getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(int mSoSP) {
		if (mSoSP > 0) {
			this.mSoSP = mSoSP;
		} else {
			this.mSoSP = 0;
		}
	}
	
	public double tinhLuong() {
		double donGia;
		
		if (mSoSP >= 1 && mSoSP <= 199) {
			donGia = 0.5;
		} else if (mSoSP >= 200 && mSoSP <= 399) {
			donGia = 0.55;
		} else if (mSoSP >= 400 && mSoSP <= 599) {
			donGia = 0.6;
		} else {
			donGia = 0.65;
		}
		
		return mSoSP * donGia;
	}
	
	@Override 
	public String toString() {
		return "MaCN: " + maCN + ", Ho: " + mHo + ", Ten: " + mTen + ", So SP: " + mSoSP + ", Luong: " + tinhLuong();
	}
}
