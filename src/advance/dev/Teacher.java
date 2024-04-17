package advance.dev;

// Lớp Teacher kế thừa từ lớp Person
public class Teacher extends Person {
	private String maGiaoVien;
	private double heSoLuong;

	// Constructor của lớp Teacher
	public Teacher(String ten, int tuoi, String soDienThoai, String maGiaoVien, double heSoLuong) {
		super(ten, tuoi, soDienThoai);
		this.maGiaoVien = maGiaoVien;
		this.heSoLuong = heSoLuong;
	}

	// Phương thức tính lương của giáo viên
	public double tinhLuong() {
		// Giả sử mức lương cơ bản là 5 triệu đồng
		double luongCoBan = 5000000;
		return luongCoBan * heSoLuong;
	}
}
