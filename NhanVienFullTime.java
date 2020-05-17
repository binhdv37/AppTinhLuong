public class NhanVienFullTime extends NhanVien{
    private int ngayLamThem=0;
    private int loaiChucVu ;


    public NhanVienFullTime(String ten,int ngayLamThem,int loaiChucVu){
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }


    public String loaiNhanVien(){
        if(loaiChucVu==Configs.NHAN_VIEN_SEP)return "Nhân viên fulltime sếp";
        else return "Nhân viên fulltime lính";
    }

    public void tinhLuong(){
        if(loaiChucVu==Configs.NHAN_VIEN_SEP) luong=Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem*Configs.LUONG_LAM_THEM_MOI_NGAY;
        else luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem*Configs.LUONG_LAM_THEM_MOI_NGAY;
    }

}
