public class ConstrucktionTest03 {
    public static void main(String[] args){
        Vip v1 = new Vip();
        Vip v2 = new Vip(1111, "xiaoming");
        Vip v3 = new Vip(2222, "媳妇" , "2020-12-23");
        Vip v4 = new Vip(3333, "小绵羊", "1998-12-12", true);

        System.out.println(v1.no);
        System.out.println(v1.name);
        System.out.println(v1.brith);
        System.out.println(v1.sex);
        System.out.println("-------------------------------------");

        System.out.println(v2.no);
        System.out.println(v2.name);
        System.out.println(v2.brith);
        System.out.println(v2.sex);
        System.out.println("-------------------------------------");

        System.out.println(v3.no);
        System.out.println(v3.name);
        System.out.println(v3.brith);
        System.out.println(v3.sex);
        System.out.println("-------------------------------------");

        System.out.println(v4.no);
        System.out.println(v4.name);
        System.out.println(v4.brith);
        System.out.println(v4.sex);

    }
}