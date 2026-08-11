/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3.java.maven.jar;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Lab3JavaMavenJar {
    public static Scanner sc = new Scanner(System.in);
    public static String MaSv;
    public static String HoTen;
    public static double cc;
    public static double gk;
    public static double ck;
    public static double tk;
    public static String XepLoai;
    
    public static void main(String[] args) {
       NhapduLieu();
       TinhDiem();
       XepLoai();
       HienThiDuLieu();
       
    }
    public static void NhapduLieu(){
        System.out.print("Nhập mã sv: ");
        MaSv= sc.nextLine();
        System.out.print ("Nhập họ tên: ");
        HoTen =sc.nextLine();
        
        cc = NhapDiem("chuyên cần");
        gk= NhapDiem("giữa kỳ");
        ck = NhapDiem("cuối kỳ");
        
    }
  public static void HienThiDuLieu() {
        System.out.println("\n================ KET QUA ================");
        System.out.printf("%-10s | %-20s | %-15s | %-8s\n", "Ma SV", "Ho ten", "Diem tong ket", "Xep loai");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s | %-20s | %-15.2f | %-8s\n", MaSv, HoTen, tk, XepLoai);
        System.out.println("=========================================================");
    }
    public static void TinhDiem(){
        tk = cc*0.1 + gk*0.3 + ck*0.6;
    }
    public static void XepLoai(){
        if(tk >=8.5){
            XepLoai ="A";   
        }
        else if(tk >= 7.0){
            XepLoai ="B";
        }
        else if(tk >= 5.5){
            XepLoai ="C";
        }
        else if(tk >= 4.0){
            XepLoai ="D";
        }
        else{
            XepLoai ="F";
        }
    }
    private static double NhapDiem(String monHoc) {
        double diem;
        while (true) {
            try {
                System.out.print("Nhap " + monHoc + ": ");
                diem = Double.parseDouble(sc.nextLine());
                if (diem >= 0 && diem <= 10) {
                    break;
                } else {
                    System.out.println("-> Loi: Diem khong hop le! Phai nam trong khoang [0 - 10]. Vui long nhap lai.");
                }
            } catch (NumberFormatException e) {
                System.out.println("-> Loi: Dinh dang khong hop le! Vui long nhap vao mot so thuc.");
            }
        }
        return diem;
    }
}

