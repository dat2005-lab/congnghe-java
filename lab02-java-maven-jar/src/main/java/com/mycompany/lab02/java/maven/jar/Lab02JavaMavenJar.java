/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab02.java.maven.jar;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Lab02JavaMavenJar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Nhập thông tin sinh viên
        System.out.print("Nhập mã SV:");
        String maSV =sc.nextLine();
        
        System.out.print("Nhập họ ten:");
        String hoTen =sc.nextLine();
        //Nhập điểm chuyên cần
        double ChuyenCan ;
        do{
            System.out.print("Nhập điểm chuyên cần:");
            ChuyenCan =sc.nextDouble();
            if(ChuyenCan <0 || ChuyenCan > 10){
                System.out.println("Điểm không hợp lệ vui lòng nhập lại");
            }
        
           }while(ChuyenCan < 0|| ChuyenCan > 10);
        
        double GiuaKy;
        do{
            System.out.print("Nhập điểm giữa kỳ :");
            GiuaKy =sc.nextDouble();
            if(GiuaKy < 0|| GiuaKy >10 ){
                System.out.println("Điểm không hợp lệ vui lòng nhập lại");
            }
          } while(GiuaKy <0|| GiuaKy >10); 
        
        double CuoiKy;
        do{
            System.out.print("Nhập điểm cuối kỳ là:");
            CuoiKy =sc.nextDouble();
            if(CuoiKy <0|| CuoiKy >10) {
                System.out.println("Điểm không hợp lệ vui lòng nhập lại");
            }
        }while(CuoiKy <0|| CuoiKy > 10);
        // Tính điểm tổng kết
        double TongDiem= ChuyenCan *0.1 + GiuaKy *0.3 + CuoiKy *0.6;
        //Xếp loại
        String XepLoai;
         if(TongDiem >=8.5){
            XepLoai ="A";
            
         }else if(TongDiem >= 7.0){
             XepLoai ="B";
             
         }else if(TongDiem >=5.5){
             XepLoai = "C";
         }else if(TongDiem >=4.0){
             XepLoai ="D";
         }else{
             XepLoai ="F";
         }
          // Hiển thị kết quả
        System.out.println("\n===== KẾT QUẢ =====");
        System.out.println("Mã sinh viên : " + maSV);
        System.out.println("Họ tên       : " + hoTen);
        System.out.printf("Điểm tổng kết: %.2f\n", TongDiem);
        System.out.println("Xếp loại     : " + XepLoai);

        sc.close();     
    }
         
    }    
        
        
    
