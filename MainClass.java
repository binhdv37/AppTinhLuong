import java.util.Scanner;

public class MainClass {
        public static void main(String[] args) {
            //yeu cau nguoi dung nhap so luong nhan vien
                Scanner sc = new Scanner(System.in);
                System.out.print("Số lượng nhân viên : ");
                int soNhanVien = sc.nextInt();
                sc.nextLine();
                //tao 1 mang nhan vien
                NhanVien[] mangNhanVien = new NhanVien[soNhanVien];
                //xet tung nhan vien 1, yeu cau nguoi dung cung cap cac thong tin vs tung nhan vien
                    for(int i=0;i<soNhanVien;i++){
                        System.out.print("Tên nhân viên số "+(i+1) +" : ");
                        String ten = sc.nextLine();
                        System.out.print("Là nhân viên fulltime hay parttime (1 - fulltime ; 2 - parttime) : ");
                        if(sc.nextInt()==1){
                    System.out.print("Chức vụ (1 - sếp;0 - lính) : ");
                    int loaiChucVu = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ngày làm thêm : ");
                    int ngayLamthem = sc.nextInt();
                    sc.nextLine();
                    mangNhanVien[i] = new NhanVienFullTime(ten,ngayLamthem,loaiChucVu);
                }
                else {
                    System.out.print("Số giờ làm : ");
                    int soGioLam = sc.nextInt();
                    sc.nextLine();
                    mangNhanVien[i] = new NhanVienPartTime(ten,soGioLam);
                }
                mangNhanVien[i].tinhLuong();
            }
            System.out.println("\n Kết quả tính lương : \n");
            for(NhanVien nhanVien : mangNhanVien){
                nhanVien.xuatThongTin();
            }
        }
}
