package advance.dev.model;

public class Bao extends TaiLieu {
	private int ngayPhatHanh;

	public Bao(String maTaiLieu, String tenNhaXuatBan, int inSoLuongPhatHanh, int ngayPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, inSoLuongPhatHanh);
		this.setNgayPhatHanh(ngayPhatHanh);
		// TODO Auto-generated constructor stub
	}

	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}

	public void setNgayPhatHanh(int ngayPhatHanh) {
		this.ngayPhatHanh = ngayPhatHanh;
	}

	@Override
	public String toString() {
		return "Bao [ngayPhatHanh=" + ngayPhatHanh + super.toString() + "]";
	}
	
	

}
