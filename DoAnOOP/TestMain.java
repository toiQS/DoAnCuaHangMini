package DoAnOOP;

import java.util.Scanner;

public class TestMain {
    public static void ChucNang(){
        System.out.println("Cac chuc nang cu the cua chuong trinh: "); //in ra dòng các chức năng cụ thể của chương trình
        System.out.println("1:  them"); //thêm
        System.out.println("2:  xoa");  // Xóa
        System.out.println("3: sua"); //Sửa
        System.out.println("4: tim kiem"); //tìm kiếm
        System.out.println("5: thoat"); //thoát
    }
    public static void DanhSachNhanVien(){

    }
    public static void DanhSachHangHoa(){

    }
    public static void DanhSachQuayA(){

    }
    public static void DanhSachHangHoaTrongKho(){ //danh sách hàng hóa trong kho(cân nhắc có thể thêm)

    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        QuanLy NVien = new QuanLy();
        String type = a.nextLine();
        ChucNang();
        while (true){
            switch (type){
                case "1": {

                }
            }
        }
    }
}
