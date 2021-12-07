package DoAnOOP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLy {
    private List<Nhanvien> nhanvienList; //tạo danh sách nhân viên
    public QuanLy(){
        this.nhanvienList = new ArrayList<>();
    }
    public void addNhanVien(Nhanvien nhanvien){ //thêm nhân viên
        nhanvienList.add(nhanvien);
    }

   public boolean delNhanVien(String Ma){ //xóa nhân viên dựa theo mã nhân viên
      Nhanvien nhanvien = this.nhanvienList.stream().filter(o -> o.getMa().equals(Ma)).findFirst().orElse(null);
      if(nhanvien == null){
        return false;
      }
      this.nhanvienList.remove(nhanvien);
      return true;
   }

   public List<Nhanvien> searchNhanVien(String Ma){ //tìm kiếm dựa theo mã nhân viên
      return this.nhanvienList.stream().filter(o -> o.getMa().equals(Ma)).collect(Collectors.toList());
   }

   public void showThongTin(){ //xuất ra toàn bộ thông tin trong danh sách nhân viên
      this.nhanvienList.forEach(o -> System.out.println(o.toString()));
   }

   public List<Nhanvien> SuaThongTinNhanVien(int a, Nhanvien nhanvien){
      nhanvienList.set(a,nhanvien);
      return nhanvienList;
   }
}
