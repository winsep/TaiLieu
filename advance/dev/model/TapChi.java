package advance.dev.model;

public class TapChi extends TaiLieu{
	private int soPhatHanh;
	private int thangPhatHanh;

	public TapChi(String maTaiLieu, String tenNhaXuatBan, int inSoLuongPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, tenNhaXuatBan, inSoLuongPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
		// TODO Auto-generated constructor stub
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

	@Override
	public String toString() {
		return "TapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + super.toString() + "]";
	}
	
	

}
