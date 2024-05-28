package advance.dev.model;

public class TaiLieu {
	private String maTaiLieu;
	private String tenNhaXuatBan;
	private int inSoLuongPhatHanh;

	public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int inSoLuongPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.tenNhaXuatBan = tenNhaXuatBan;
		this.inSoLuongPhatHanh = inSoLuongPhatHanh;
	}

	// get,set

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getTenNhaXuatBan() {
		return tenNhaXuatBan;
	}

	public void setTenNhaXuatBan(String tenNhaXuatBan) {
		this.tenNhaXuatBan = tenNhaXuatBan;
	}

	public int getInSoLuongPhatHanh() {
		return inSoLuongPhatHanh;
	}

	public void setInSoLuongPhatHanh(int inSoLuongPhatHanh) {
		this.inSoLuongPhatHanh = inSoLuongPhatHanh;
	}

	@Override
	public String toString() {
		return "TaiLieu [maTaiLieu=" + maTaiLieu + ", tenNhaXuatBan=" + tenNhaXuatBan + ", inSoLuongPhatHanh="
				+ inSoLuongPhatHanh + "]";
	}

}
