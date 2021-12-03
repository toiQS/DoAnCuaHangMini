package DoAnOOP;

import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    private List<Nhanvien> nhanvienList; //tạo danh sách nhân viên
    public QuanLy(){
        this.nhanvienList = new ArrayList<>();
    }
    public void addNhanVien(Nhanvien nhanvien){ //thêm nhân viên
        this.nhanvienList.add(nhanvien);
    }
    public void showList(){ //hiện ra thông tin cần thiết( đang sửa chữa)
        this.nhanvienList.forEach(o -> System.out.println(o.toString()));
    }
}
