package DoAnOOP;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    private List<Nhanvien> nhanvienList; //tạo danh sách nhân viên
    public QuanLy(){
        this.nhanvienList = new ArrayList<>();
    }
    public void addNhanVien(Nhanvien nhanvien){ //thêm nhân viên
        nhanvienList.add(nhanvien);
    }

    public int delNhanVien(String Ten, String CCCD){
        for(Nhanvien nhanvien_2 : nhanvienList){
            if(nhanvien_2.getTen().equals(Ten) && nhanvien_2.getCCCD()==CCCD){
                nhanvienList.remove(nhanvien_2);
                return 0;
            }
        }
    }

    private List<HangHoa> hangHoaList;// tạo danh sách hàng hóa

}
