package DoAnOOP;

public class HangHoa extends ThongTin{
    private String NgayNhap;
    private String HSD;
    private int SoLuong;
    private String XuatXu;
    public static int dem = 0;
    public HangHoa(String Ten, String Ma, String NgayNhap, String HSD, int SoLuong, String XuatXu){
        super(Ten, Ma);
        this.NgayNhap = NgayNhap;
        this.HSD = HSD;
        this.SoLuong = SoLuong;
        this.XuatXu = XuatXu;
    }
    public String getNgayNhap(){
        return NgayNhap;
    }
    public void setNgayNhap(String NgayNhap){
        this.NgayNhap = NgayNhap;
    }
    public String getHSD(){
        return HSD;
    }
    public void setHSD(String HSD){
        this.HSD = HSD;
    }
    public int getSoLuong(){
        return SoLuong;
    }
    public void setSoLuong(int SoLuong){
        this.SoLuong = SoLuong;
    }
    public String getXuatXu(){
        return XuatXu;
    }
    public void setXuatXu(String XuatXu){
        this.XuatXu = XuatXu;
    }
    @Override
    public String toString(){
        return  dem +".Tên mặt hàng: "+ Ten+"/Mã mặt hàng: " + Ma + "/Ngày nhập hàng: "+ NgayNhap +"/ Hạn sử dụng: "+ HSD +
                "Số Lượng: " + SoLuong+"/Sản xuất ở: "+ XuatXu;
    }
}
