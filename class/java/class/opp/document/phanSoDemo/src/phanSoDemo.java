public class phanSoDemo {
    public static void main(String[] args) {
        phanSo p1 = new phanSo(2,4);
        phanSo p2 = new phanSo(1,3);
         
        System.out.println("add:   " + p1.add(p2).toString());
        System.out.println("sub:   " + p2.sub(p1).toString());
        System.out.println("mul:   " + p1.mul(p2).toString());
        System.out.println("div:   " + p1.div(p2).toString());
        System.out.println("inv p1:" + p1.inv().toString());     
        
    }
}
