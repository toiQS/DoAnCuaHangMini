package DoAnOOP;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    private List<Nhanvien> nhanvienList;
    public QuanLy(){
        this.nhanvienList = new ArrayList<>();
    }
    public void addNhanVien(Nhanvien nhanvien){
        this.nhanvienList.add(nhanvien);
    }
    public void showList(){
        this.nhanvienList.forEach(o -> System.out.println(o.toString()));
    }
}
