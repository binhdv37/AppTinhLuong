import java.util.Scanner;

public class MainClass {
        public static void main(String[] args) {
            //yeu cau nguoi dung nhap so luong nhan vien
                Scanner sc = new Scanner(System.in);
                System.out.print("so luong nhan vien : ");
                int soNhanVien = sc.nextInt();
                sc.nextLine();
                //tao 1 mang nhan vien
                NhanVien[] mangNhanVien = new NhanVien[soNhanVien];
                //xet tung nhan vien 1, yeu cau nguoi dung cung cap cac thong tin vs tung nhan vien
                    for(int i=0;i<soNhanVien;i++){
                        System.out.print("ten nhan vien so "+(i+1) +" : ");
                        String ten = sc.nextLine();
                        System.out.print("la nhan vien full time hay parttime (1 - fulltime ; 2 - parttime) : ");
                        if(sc.nextInt()==1){
                    System.out.print("chuc vu (1 - sep;0 - linh) : ");
                    int loaiChucVu = sc.nextInt();
                    sc.nextLine();
                    System.out.print("ngay lam them : ");
                    int ngayLamthem = sc.nextInt();
                    sc.nextLine();
                    mangNhanVien[i] = new NhanVienFullTime(ten,ngayLamthem,loaiChucVu);
                }
                else {
                    System.out.print("so gio lam : ");
                    int soGioLam = sc.nextInt();
                    sc.nextLine();
                    mangNhanVien[i] = new NhanVienPartTime(ten,soGioLam);
                }
                mangNhanVien[i].tinhLuong();
            }
            System.out.println("\n ket qua tinh luong : \n");
            for(NhanVien nhanVien : mangNhanVien){
                nhanVien.xuatThongTin();
            }
        }
}
