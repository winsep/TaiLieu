package advance.dev.model;

public class Sach extends TaiLieu {
	private String tenTacGia;
	private int soTrang;

	public Sach(String maTaiLieu, String tenNhaXuatBan, int inSoLuongPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, tenNhaXuatBan, inSoLuongPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
		// TODO Auto-generated constructor stub
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public String toString() {
		return "Sach [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + super.toString() + "]";
	}

}
