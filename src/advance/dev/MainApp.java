package advance.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Person[] persons = new Person[10]; // Khai báo mảng 10 Person

		nhap(persons); // Nhập thông tin cho 10 người gồm 4 giáo viên và 6 sinh viên
		xuat(persons); // In thông tin của 10 người
		findTeacher(persons); // Tìm giáo viên có lương cao nhất
		findStudent(persons); // Tìm sinh viên có điểm trung bình cao nhất
	}

	// Phương thức nhập thông tin cho mảng persons gồm 4 Teacher và 6 Student
	public static void nhap(Person[] persons) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			if (i < 4) {
				System.out.println("Nhập thông tin cho giáo viên thứ " + (i + 1) + ":");
				System.out.print("Tên: ");
				String ten = scanner.nextLine();
				System.out.print("Tuổi: ");
				int tuoi = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Số điện thoại: ");
				String soDienThoai = scanner.nextLine();
				System.out.print("Mã giáo viên: ");
				String maGiaoVien = scanner.nextLine();
				System.out.print("Hệ số lương: ");
				double heSoLuong = scanner.nextDouble();
				scanner.nextLine();

				persons[i] = new Teacher(ten, tuoi, soDienThoai, maGiaoVien, heSoLuong);
			} else {
				System.out.println("Nhập thông tin cho sinh viên thứ " + (i - 3) + ":");
				System.out.print("Tên: ");
				String ten = scanner.nextLine();
				System.out.print("Tuổi: ");
				int tuoi = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Số điện thoại: ");
				String soDienThoai = scanner.nextLine();
				System.out.print("Điểm Toán: ");
				double diemToan = scanner.nextDouble();
				System.out.print("Điểm Lý: ");
				double diemLy = scanner.nextDouble();
				System.out.print("Điểm Hóa: ");
				double diemHoa = scanner.nextDouble();
				scanner.nextLine();
				System.out.print("Mã sinh viên: ");
				String maSinhVien = scanner.nextLine();
				System.out.print("Lớp: ");
				String lop = scanner.nextLine();

				persons[i] = new Student(ten, tuoi, soDienThoai, diemToan, diemLy, diemHoa, maSinhVien, lop);
			}
		}
	}

	// Phương thức in thông tin của mảng persons
	public static void xuat(Person[] persons) {
		System.out.println("Thông tin của mảng persons:");
		for (Person person : persons) {
			if (person instanceof Teacher) {
				System.out.println("Giáo viên: " + person.getTen());
				System.out.println("Lương: " + ((Teacher) person).tinhLuong());
			} else if (person instanceof Student) {
				System.out.println("Sinh viên: " + person.getTen());
				System.out.println("Điểm trung bình: " + ((Student) person).diemTrungBinh());
			}
			System.out.println("------------------------");
		}
	}

	// Phương thức tìm giáo viên có lương cao nhất
	public static void findTeacher(Person[] persons) {
		double maxLuong = 0;
		String tenGVMaxLuong = "";

		for (Person person : persons) {
			if (person instanceof Teacher) {
				double luong = ((Teacher) person).tinhLuong();
				if (luong > maxLuong) {
					maxLuong = luong;
					tenGVMaxLuong = person.getTen();
				}
			}
		}

		System.out.println("Giáo viên có lương cao nhất: " + tenGVMaxLuong + " - Lương: " + maxLuong);
	}

	// Phương thức tìm sinh viên có điểm trung bình cao nhất
	public static void findStudent(Person[] persons) {
		double maxDiemTB = 0;
		String tenSVMaxDiemTB = "";

		for (Person person : persons) {
			if (person instanceof Student) {
				double diemTB = ((Student) person).diemTrungBinh();
				if (diemTB > maxDiemTB) {
					maxDiemTB = diemTB;
					tenSVMaxDiemTB = person.getTen();
				}
			}
		}

		System.out.println(
				"Sinh viên có điểm trung bình cao nhất: " + tenSVMaxDiemTB + " - Điểm trung bình: " + maxDiemTB);
	}
}