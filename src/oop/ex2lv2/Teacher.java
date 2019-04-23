/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex2lv2;

/**
 *
 * @author genharunari
 * Câu 2: 	Viết các lớp sau và thực thiện
Viết lớp Person có
	Thuộc tính:
		Họ và tên
		Tuổi
		Giới tính
	Phương thức:
		Contructure
		Các hàm set/get các thuộc tính
		In thông tin
Viết lớp Student kế thừa từ Person có
	Thuộc tính:
		Lớp
		Điểm trung bình
	Phương thức:
		Các hàm set/get các thuộc tính
		In thông tin
Viết lớp Teacher kế thừa từ Person có
	Thuộc tính:
		Lương
	Phương thức:
		Các hàm set/get các thuộc tính
		In thông tin		
Tạo menu như bên dưới và có các chức năng của nó
	Ấn 1. Nhập danh sách sinh viên
	Ấn 2. Nhập danh sách giáo viên
	Ấn 3. In danh sách sinh viên
	Ấn 4. In danh sách giáo viên
		Ấn 5. Thoát
 */
public class Teacher extends Person{
    private int salary;
    
    public Teacher(){
        name = "";
        sex = "";
        age = 0;
        salary = 0;
    }

    public Teacher(String name, String sex, int age, int salary) {
        super(name, sex, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s\n", name, sex, age, salary);
    }
}