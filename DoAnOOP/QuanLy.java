package DoAnOOP;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    public List<Nhanvien> nhanvienList;
    public QuanLy(){
        this.nhanvienList = new ArrayList<>();
    }
    public void addNhanVien(Nhanvien nhanvien){
        this.nhanvienList.add(nhanvien);
    }
}
