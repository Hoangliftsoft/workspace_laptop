public class test {
    public static void main(String[] agrs) {
        Ngay ngay1 = new Ngay(15, 5, 2021);
        Ngay ngay2 = new Ngay(15, 4, 2025);
        Ngay ngay3 = new Ngay(15, 2, 2024);

        TacGia tacGia1 = new TacGia("tentacGia1", ngay1);
        TacGia tacGia2 = new TacGia("tentacGia2", ngay2);
        TacGia tacGia3 = new TacGia("tentacGia3", ngay3);

        Sach sach1 = new Sach("tenSach1", 5000, 2023, tacGia1);
        Sach sach2 = new Sach("tenSach2", 10000, 2014, tacGia2);
        Sach sach3 = new Sach("tenSach3", 15000, 2023, tacGia3);

        sach1.inTenSach();
        sach2.inTenSach();
        sach3.inTenSach();

        System.out.println("So sanh nam xuat ban sach1 va sach3 : " + sach1.kiemTraCungNamXuatBan(sach3));

        System.err.println("Sach 1 giam 10% : " + sach1.giaSauKhiGiam(10));
        System.err.println("Sach 2 giam 20% : " + sach2.giaSauKhiGiam(20));
        System.err.println("Sach 3 giam 50% : " + sach3.giaSauKhiGiam(50));
    }
}
