public class phanSo {
    private int tu;
    private int mau;

    public phanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public phanSo add(phanSo p) {
        int t = tu * p.mau + p.tu * mau;
        int m = mau * p.mau;
        return new phanSo(t, m).toiGian();
    }

    public phanSo sub(phanSo p) {
        int t = tu * p.mau - p.tu * mau;
        int m = mau * p.mau;
        return new phanSo(t, m).toiGian();
    }

    public phanSo mul(phanSo p) {
        int t = tu * p.tu;
        int m = mau * p.mau;
        return new phanSo(t, m).toiGian();
    }

    public phanSo div(phanSo p) {
        return mul(p.inv());
    }

    public phanSo inv() {
        int t = tu;
        tu = mau;
        mau = t;
        return this;
    }

    static int USCLN(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private phanSo toiGian() {
        int t = USCLN(tu, mau);
        tu /= t;
        mau /= t;
        return this;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}
