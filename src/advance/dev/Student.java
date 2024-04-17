package advance.dev;

// Lớp Student kế thừa từ lớp Person
public class Student extends Person {
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	private String maSinhVien;
	private String lop;

	// Constructor của lớp Student
	public Student(String ten, int tuoi, String soDienThoai, double diemToan, double diemLy, double diemHoa,
			String maSinhVien, String lop) {
		super(ten, tuoi, soDienThoai);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSinhVien = maSinhVien;
		this.lop = lop;
	}

	// Phương thức tính điểm trung bình của sinh viên
	public double diemTrungBinh() {
		return (diemToan + diemLy + diemHoa) / 3;
	}
}
