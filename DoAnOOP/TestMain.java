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

    public static void DanhSachNhanVien(){ // Danh sách thông tin dạng có sẵn

    }

    public static void DanhSachHangHoa(){ //Danh sách thông tin hàng hóa có sẵn

    }

    public static void DanhSachQuayA(){ //Danh sách sản phẩm

    }

    public static void DanhSachHangHoaTrongKho(){ //danh sách hàng hóa trong kho(cân nhắc có thể thêm)

    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        QuanLy NVien = new QuanLy();
        String type = a.nextLine();
        System.out.println("Chọn thông tin mà bạn muốn xem: "); //xem xét nhu cầu của người dùng

        String chosse = a.nextLine(); // biến nhập thông tin từ bàn phím

        System.out.println("A. Nhân Viên");
        System.out.println("B. Hang Hóa");
        switch (chosse) {

            case "1": {
                //hiện thông tin nhân viên có sẵn
                ChucNang(); // hiện ra cách chức năng cơ bản người dùng có thể thao tác

                // vòng lặp nhập thông tin để sử dụng list
                 switch (chosse){

                     case "1": {
                         System.out.println("Nhập thông tin: ");
                         while (true) {


                             System.out.print("Họ và Tên: ");
                             String Ten = a.nextLine();

                             System.out.print("Mã Số Nhân Viên: ");
                             String Ma = a.nextLine();

                             System.out.print("Giới Tính: ");
                             String GioiTinh = a.nextLine();

                             System.out.println("Căn Cước Công Dân: ");
                             int CCCD = a.nextInt();

                             System.out.println("Địa Chỉ: ");
                             String DiaChi = a.nextLine();

                             System.out.println("Ngày Vào Làm: ");
                             String NgayVaoLam = a.nextLine();

                             System.out.print("Số Điện Thoại: ");
                             String SDT = a.nextLine();

                             Nhanvien nhanvien = new Nhanvien(Ten, Ma, GioiTinh, CCCD, DiaChi, NgayVaoLam, SDT);
                             NVien.addNhanVien(nhanvien);
                         }
                     }

                     case "2":{

                     }
                 }

            }

            case "2": {
                //hiện thông tin có sẵn của hàng hóa
                ChucNang(); // hiện ra cách chức năng cơ bản người dùng có thể thao tác
            }
        }
    }
}
