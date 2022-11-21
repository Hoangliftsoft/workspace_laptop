package QuanLyCaPhe.src;

public class Main {
    public static void main(String[] agrs){
        HoaDonCaPhe hd = new HoaDonCaPhe("cafe trung nguyen",100000,1.5);
        HoaDonCaPhe hd2 = new HoaDonCaPhe("cafe trung nguyen",100000,5.5);
        System.out.println("Tong Tien = "+hd.tinhTongTien());
        System.out.println("Tong Tien2 = "+hd2.tinhTongTien());
        System.out.println("Kiem Tra Khoi Luong > 2kg : "+hd.kiemTraKhoiLuongLonHon(2));
        System.out.println("Kiem Tra Tong Tien > 500k : "+hd.kiemTraTongTienLonHon500k());
        System.out.println("Giam gia cua Hd: "+hd.giamGia(10));
        System.out.println("Giam gia cua Hd2: "+hd2.giamGia(10));
        System.out.println("Sau giam gia cua hd : "+hd.giaSauKhiGiam(10));
        System.out.println("Sau giam gia cua hd2 : "+hd2.giaSauKhiGiam(10));

    }
}
