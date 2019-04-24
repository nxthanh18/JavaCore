/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.ex3lv2;

/**
 *
 * @author genharunari
 * Câu 3: 	Quản lý điểm Thí sinh
Để quản lý điểm thi đầu vào trường ĐHBK của các thí sinh, ta xây dựng lớp ThiSinh mô tả các thí sinh bao gồm các thuộc tính và phương thức sau:
-	Tên Thí Sinh
-	Điểm thi 3 môn: Toán, Lý và Hóa
-	Nhập thông tin của thí sinh gồm tên và 3 môn
-	In thông tin tên và tổng điểm 3 môn
-	Tính tổng điểm của thí sinh
Trên cơ sở lớp đã xây dựng được, viết chương trình làm các công việc sau:
-	Nhập danh sách kết quả thi của các thí sinh vào từ bàn phím
-	In danh sách thí sinh
-	In danh sách điểm giảm dần
-	In danh sách trúng tuyển (điểm chuẩn là 17 điểm)

 */
public class ThiSinh {
    private String name;
    private float scoreMath, scorePhysical, scoreChemistry;
    
    public ThiSinh(){
        name = "";
        scoreMath = 0;
        scorePhysical = 0;
        scoreChemistry = 0;
    }

    public ThiSinh(String name, float scoreMath, float scorePhysical, float scoreChemistry) {
        this.name = name;
        this.scoreMath = scoreMath;
        this.scorePhysical = scorePhysical;
        this.scoreChemistry = scoreChemistry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(float scoreMath) {
        this.scoreMath = scoreMath;
    }

    public float getScorePhysical() {
        return scorePhysical;
    }

    public void setScorePhysical(float scorePhysical) {
        this.scorePhysical = scorePhysical;
    }

    public float getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(float scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-20s %-20s %-20s %-20s\n", name, scoreMath, scorePhysical, scoreChemistry, sumScore());
    }

    
    
    public float sumScore(){
        float sum = 0;
        sum = scoreMath + scorePhysical + scoreChemistry;
        return sum;
    }
}
