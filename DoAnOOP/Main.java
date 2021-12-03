package DoAnOOP;
// import
import java.util.Scanner;

/**
 * @author Le Bao Tai
 * Giao dien co ban cua phan men
 * +------------------------------------------+
 * |         Quan ly sieu thi mini            |
 * | -----------------------------------------|
 * | 1. Them                                  |
 * | 2. Xoa                                   |
 * | 3. Sua                                   |
 * | 4. Tim kiem                              |
 * | 5. Xuat danh sach                        |
 * | 6. Thoat                                 |
 * +------------------------------------------+
 *
 */

public class Main {
    public static void main(String[] args) {

        int endMenu = 0;
        do {
            System.out.println("+------------------------------------------+");
            System.out.println("|         Quan ly sieu thi mini            |");
            System.out.println("| -----------------------------------------|");
            System.out.println("| 1. Them                                  |");
            System.out.println("| 2. Xoa                                   |");
            System.out.println("| 3. Sua                                   |");
            System.out.println("| 4. Tim Kiem                              |");
            System.out.println("| 5. Xuat danh sach                        |");
            System.out.println("| 6. Thoat                                 |");
            System.out.println("+------------------------------------------+");
            System.out.print("Lua chon: ");

            Scanner menuScanner = new Scanner(System.in);
            int menuChoose = menuScanner.nextInt();

            System.out.println();
            switch(menuChoose) {

                // them
                case 1 -> {
                    int endSubMenus = 0;
                    do {

                        System.out.println("+=====================+");
                        System.out.println("|  1. Them nhan vien  |");
                        System.out.println("|  2. Them hang hoa   |");
                        System.out.println("|  3. Tro ve          |");
                        System.out.println("+=====================+");
                        System.out.print("Lua chon: ");

                        Scanner subMenusScanner = new Scanner(System.in);
                        int subMenusChoose = subMenusScanner.nextInt();

                        System.out.println();
                        switch(subMenusChoose) {
                            // them nhan vien
                            case 1 -> {
                                System.out.println("Nhap ho va ten nhan vien: ");
                                System.out.println("Nhap dia chi: ");
                                System.out.println("Tuoi: ");
                                System.out.println("Ngay vao lam");
                                System.out.println();
                            }
                            // them hang hoa
                            case 2 -> {
                                System.out.println("Ten hang hoa: ");
                                System.out.println("Loai hang hoa: ");
                                System.out.println("So luong: ");
                                System.err.println("Ngay ngay: ");
                                System.out.println();
                            }
                            // thoat
                            case 3 -> {
                                endSubMenus = 1;
                            }
                            // neu su lua cho kh ton tai thi thong bao cho nguoi dung "----" va thoat ve menu chinh
                            default -> {
                                endSubMenus = 1;
                                System.out.println("Khong co lua chon nay!!!");
                                System.out.println();
                            }
                        }
                    } while (endSubMenus == 0);
                }

                // xoa
                case 2 -> {
                    int endSubMenus = 0;
                    do {
                        System.out.println("+=====================+");
                        System.out.println("|   1. Xoa nhan vien  |");
                        System.out.println("|   2. Xoa hang hoa   |");
                        System.out.println("|   3. Tro ve         |");
                        System.out.println("+=====================+");
                        System.out.print("Lua chon: ");

                        // khai bao
                        Scanner subMenusScanner = new Scanner(System.in);
                        int subMenusChoose = subMenusScanner.nextInt();

                        System.out.println();
                        switch(subMenusChoose) {
                            // xoa nhan vien
                            case 1 -> {
                                System.out.println("Ho ten nhan vien: ");
                                /** neu co nhieu nhan vien cung ten thi xet them dk
                                 * if () {
                                 *
                                 * }
                                 */
                                System.out.println();
                            }

                            // xoa hang hoa
                            case 2 -> {
                                System.out.println("Ten hang hoa: ");
                                /** neu co cung ten thi xet them dk
                                 * if() {
                                 *
                                 * }
                                 */
                                System.out.println();
                            }

                            // thoat
                            case 3 -> {
                                endSubMenus = 1;
                            }

                            // neu su lua cho kh ton tai thi thong bao cho nguoi dung "----" va thoat ve menu chinh
                            default -> {
                                endSubMenus = 1;
                                System.out.println("Khong co lua chon nay!!!");
                                System.out.println();
                            }
                        }
                    } while (endSubMenus == 0);
                }

                // sua
                case 3 -> {
                    int endSubMenus = 0;
                    do {
                        System.out.println("+=======================+");
                        System.out.println("|   1. Sua nhan vien    |");
                        System.out.println("|   2. Sua hang hoa     |");
                        System.out.println("|   3. Tro ve           |");
                        System.out.println("+=======================+");
                        System.out.print("Lua chon: ");

                        Scanner subMenusScanner = new Scanner(System.in);
                        int subMenusChoose = subMenusScanner.nextInt();

                        System.out.println();
                        switch(subMenusChoose) {
                            case 1 -> {
                                /** cái phần này list nhân viên ra trước rồi chọn nhân viên nào cần sửa thôi
                                 * 1......
                                 * 2......
                                 * 3......
                                 */
                                System.out.print("Chon nhan vien can sua: ");
                                System.out.println();

                                // dưới này là phần method thực thi
                            }

                            case 2 -> {
                                /** cái phần này list hàng hoá ra trước rồi chọn nhân viên nào cần sửa thôi
                                 * 1......
                                 * 2......
                                 * 3......
                                 */
                                System.out.print("Chon hang hoa can sua: ");
                                System.out.println();

                                // dưới này là phần method thực thi
                            }

                            case 3 -> {
                                endSubMenus = 1;
                            }

                            default -> {
                                endSubMenus = 1;
                                System.out.println("Khong co lua chon nay!!!");
                                System.err.println();
                            }
                        }

                    } while (endSubMenus == 0);
                }

                // tim kiem
                case 4 -> {
                    int endSubMenus = 0;
                    do {
                        System.out.println("+=============================+");
                        System.out.println("|   1. Tim kiem nhan vien     |");
                        System.out.println("|   2. Tim kiem hang hoa      |");
                        System.out.println("|   3. Tro ve                 |");
                        System.out.println("+=============================+");
                        System.out.print("Lua chon: ");

                        Scanner subMenusScanner = new Scanner(System.in);
                        int subMenusChoose = subMenusScanner.nextInt();

                        System.out.println();
                        switch(subMenusChoose) {
                            case 1 -> {
                                System.out.print("Nhap Ho Ten nhan vien can tim: ");
                                /** list ra toàn bộ nhân viên có cùng Họ Tên
                                 * 1............
                                 * 2............
                                 */
                                System.out.println();
                            }

                            case 2 -> {
                                System.out.print("Nhap loai hang hoa can tim: ");
                                /** list ra toàn bộ hàng hoá có cùng loại
                                 * 1...............................
                                 * 2...............................
                                 * 3...............................
                                 */
                                System.out.println();
                            }

                            case 3 -> {
                                endSubMenus = 1;
                            }

                            default -> {
                                endSubMenus = 1;
                                System.out.println("Khong co lua chon nay!!!");
                                System.err.println();
                            }
                        }
                    } while (endSubMenus == 0);
                }

                // xuat danh sach
                case 5 -> {
                    int endSubMenus = 0;
                    do {
                        System.out.println("+=============================+");
                        System.out.println("|   1. Danh sach nhan vien    |");
                        System.out.println("|   2. Danh sach hang hoa     |");
                        System.out.println("|   3. Tro ve                 |");
                        System.out.println("+=============================+");
                        System.out.print("Lua chon: ");

                        Scanner subMenusScanner = new Scanner(System.in);
                        int subMenusChoose = subMenusScanner.nextInt();

                        System.out.println();
                        switch(subMenusChoose) {
                            case 1 -> {
                                /** list ra danh sách nhân viên
                                 * 1....
                                 * 2....
                                 * 3....
                                 */
                                System.out.println("Danh sach nhan vien!!!");
                                System.out.println();
                            }

                            case 2 -> {
                                /** list ra danh sách hàng hoá theo loại hàng
                                 * Tên loại hàng: abc
                                 *  1.....
                                 *  2.....
                                 *
                                 * Tên loại hàng: def
                                 *  1.....
                                 *  2.....
                                 *
                                 */
                                System.out.println("Danh sach hang hoa!!!");
                                System.err.println();
                            }

                            case 3 -> {
                                endSubMenus = 1;
                            }

                            default -> {
                                endSubMenus = 1;
                                System.out.println("Khong co lua chon nay!!!");
                                System.err.println();
                            }
                        }
                    } while (endSubMenus == 0);
                }

                case 6 -> {
                    endMenu = 1;
                }

                default -> {
                    endMenu = 1;
                    System.out.println("Khong co lua chon nay!!!");
                }
            }
        } while (endMenu == 0);


    }
}