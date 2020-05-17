public class NhanVien {
    protected String ten;
    protected long luong;

    public NhanVien(){
    }

    public NhanVien(String ten){
        this.ten = ten;
    }

    protected String loaiNhanVien(){
        return "";
    }

    public void tinhLuong(){
        //child class must override
    }

    public void xuatThongTin(){
        System.out.println("---------nhan vien : "+ten +"-----------");
        System.out.println("loai nhan vien : "+loaiNhanVien());
        System.out.println("luong : "+luong);
    }
}
