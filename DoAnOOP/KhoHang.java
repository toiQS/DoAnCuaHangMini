package DoAnOOP;

public class KhoHang extends ThongTin{
  public String NgayNhap;
  public String HSD;
  public int SoLuong;
  public String XuatXu;
  public static int dem = 0;
  public KhoHang(String Ten, String Ma, String NgayNhap, String HSD, int SoLuong, String XuatXu){
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
}
