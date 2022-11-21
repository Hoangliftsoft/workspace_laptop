public class mains {
    public static void main(String[] agrs) {
        Ngay ngay1 = new Ngay(11, 222, 3333);
        Ngay ngay2 = new Ngay(22, 333, 4444);
        Ngay ngay3 = new Ngay(33, 444, 5555);

        HangSanXuat hangSanXuat1 = new HangSanXuat("HonDa1", "VietNam1");
        HangSanXuat hangSanXuat2 = new HangSanXuat("HonDa2", "VietNam2");
        HangSanXuat hangSanXuat3 = new HangSanXuat("HonDa3", "VietNam3");

        BoPhim boPhim1 = new BoPhim("tenPhim1", 1111, hangSanXuat1, 11, ngay1);
        BoPhim boPhim2 = new BoPhim("tenPhim2", 2222, hangSanXuat2, 22, ngay2);
        BoPhim boPhim3 = new BoPhim("tenPhim3", 3333, hangSanXuat3, 33, ngay3);

        System.out.println("SS gia 1 re hon 2: " + boPhim1.kiemTraGiaVeReHon(boPhim2));
        System.out.println("SS gia 1 re hon 2: " + boPhim3.kiemTraGiaVeReHon(boPhim2));

        System.out.println("Ten hang san xuat phim1: " + boPhim1.layTenHangSanXuatPhim());
        System.out.println("Ten hang san xuat phim2: " + boPhim2.layTenHangSanXuatPhim());
        System.out.println("Ten hang san xuat phim3: " + boPhim3.layTenHangSanXuatPhim());

        System.out.println("Gia sau khuyen mai 5% : " + boPhim1.giaSauKhuyenMai(5));
        System.out.println("Gia sau khuyen mai 20% : " + boPhim1.giaSauKhuyenMai(20));
        System.out.println("Gia sau khuyen mai 50% : " + boPhim1.giaSauKhuyenMai(50));

    }
}
