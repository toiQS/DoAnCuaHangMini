package DoAnOOP;

import java.util.Scanner;

public class TestMain {
    public static void ChucNang(){ // show ra các chức năng cho người dùng
        System.out.println("cac chuc nang nguoi dung co the tuong tac duoc: ");
        System.out.println("1 : Them Nhan Vien");
        System.out.println("2: Xoa Nhan Vien");
        System.out.println("3: Sua Thong Tin Trong Danh Sach Nhan Vien");
        System.out.println("4: Tim Kiem Nhan Vien bang Ma So Nhan Vien");
        System.out.println("5: Xuat Thong Tin");
        System.out.println("6: Thoat");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy DanhSachNhanVien = new QuanLy();

        System.out.println("Nhan vien");
        System.out.println("Hang hoa");
        String type = sc.nextLine();

        while (true){
            switch (type){
                case "1":{
                    ChucNang();
                    String t = sc.nextLine();
                    switch (t){
                        case "1":{
                            //nhập thông tin để thêm nhân viên
                            System.out.println("Ho Ten: ");
                            String Ten = sc.nextLine();
                            System.out.println("Ma So Nhan Vien: ");
                            String Ma = sc.nextLine();
                            System.out.println("Gioi Tinh");
                            String GioiTinh = sc.nextLine();
                            System.out.println("CCCD: ");
                            int CCCD = sc.nextInt();
                            System.out.println("Dia Chi:   ");
                            String DiaChi = sc.nextLine();
                            sc.nextLine();
                            System.out.println("Ngay Vao Lam: ");
                            String NgayVaolam = sc.nextLine();
                            System.out.println("SDT: ");
                            String SDT = sc.nextLine();
                            Nhanvien nhanvien = new Nhanvien(Ten, Ma, GioiTinh, CCCD, DiaChi, NgayVaolam, SDT);
                            DanhSachNhanVien.addNhanVien(nhanvien);
                            DanhSachNhanVien.showThongTin();
                            break;
                        }
                        case "2":{
                            System.out.println("Nhap ma Nhan vien muon xoa: ");
                            String Ma = sc.nextLine();
                            DanhSachNhanVien.delNhanVien(Ma);
                            DanhSachNhanVien.showThongTin();
                            break;
                        }
                        case "3":{
                            //sửa thong tin nhân viên dựa theo thứ tự danh sách
                            System.out.println("So Thu Tu Trong Danh Sach: ");
                            int a = sc.nextInt();
                            System.out.println("Nhap Thong Tin Can Sua Doi");   //Nhập thông tin cần sửa đổi
                            System.out.println("Ho Ten: ");
                            String Ten = sc.nextLine();
                            System.out.println("Ma So Nhan Vien: ");
                            String Ma = sc.nextLine();
                            System.out.println("Gioi Tinh");
                            String GioiTinh = sc.nextLine();
                            System.out.println("CCCD: ");
                            int CCCD = sc.nextInt();
                            System.out.println("Dia Chi:   ");
                            String DiaChi = sc.nextLine();
                            System.out.println("Ngay Vao Lam: ");
                            String NgayVaolam = sc.nextLine();
                            System.out.println("SDT: ");
                            String SDT = sc.nextLine();
                            Nhanvien nhanvien = new Nhanvien(Ten, Ma, GioiTinh, CCCD, DiaChi, NgayVaolam, SDT);
                            DanhSachNhanVien.SuaThongTinNhanVien(a -1, nhanvien);
                            DanhSachNhanVien.showThongTin();
                            break;
                        }
                        case "4": {
                            System.out.println("Nhap ma Nhan vien muon tim kiem: ");
                            String Ma = sc.nextLine();
                            DanhSachNhanVien.searchNhanVien(Ma);
                            DanhSachNhanVien.showThongTin();
                            break;
                        }
                        case "5": {
                            System.out.println("Xuat ra Danh Sach Nhan Vien");
                            DanhSachNhanVien.showThongTin();
                            break;
                        }
                        case "6":{
                            //thoát
                        }
                    }
                }
            }
        }
    }
}