package advance.dev;

// Lớp cơ sở Person
public class Person {
	private String ten;
	private int tuoi;
	private String soDienThoai;

	// Constructor của lớp Person
	public Person(String ten, int tuoi, String soDienThoai) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.soDienThoai = soDienThoai;
	}

	// Getter và setter cho các thuộc tính của lớp Person
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
}
