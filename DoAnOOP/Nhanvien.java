package DoAnOOP;

public class Nhanvien extends ThongTin {
    private String GioiTinh; //giới tính
    private String DiaChi;  // địa chỉ
    private String SDT; // Số Điện Thoại
    private String NgayVaoLam;  // ngày vào làm
    private int CCCD; // căn cước công dân
    public static int ilt = 0; //đếm thứ tự nhân viên

    public Nhanvien(String Ten, String Ma, String GioiTinh, int CCCD, String DiaChi, String NgayVaoLam, String SDT){
        super(Ten, Ma);
        this.GioiTinh = GioiTinh;
        this.CCCD = CCCD;
        this.DiaChi = DiaChi;
        this.NgayVaoLam = NgayVaoLam;
        this.SDT = SDT;
    }

    public String getGioiTinh(){
        return GioiTinh;
    }
    public void setGioiTinh(String GioiTinh){
        this.GioiTinh = GioiTinh;
    }

    public int getCCCD(){
        return CCCD;
    }
    public void setCCCD(int CCCD){
        this.CCCD = CCCD;
    }

    public String getDiaChi(){
        return DiaChi;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi = DiaChi;
    }

    public String getNgayVao(){
        return NgayVaoLam;
    }
    public void setNgayVaoLam(String NgayVaoLam){
        this.NgayVaoLam = NgayVaoLam;
    }

    public String getSDT(){
        return SDT;
    }
    public void setSDT(String SDT){
        this.SDT = SDT;
    }
    
    @Override
    public String toString(){
        return ilt+".Họ Tên: " + Ten + "/" + "Mã số nhân viên: "+Ma+"/Giới Tính: "+ GioiTinh+"/CCCD: "+CCCD+"/Địa Chỉ: "+ DiaChi+"/Ngày Vào Làm: "+NgayVaoLam+
                "SDT: "+ SDT;
    }

}
