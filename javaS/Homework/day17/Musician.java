// 3）定义乐手类Musician，可以弹奏各种乐器play(Instrument i)
public class Musician{
    public static void main(String[] args){
        //给音乐家创建对象
        Musician p1 = new Musician();

        //给乐器创建对象
        MusicalLnstruments m1 = new MusicalLnstruments();
        //给二胡创建对象
        Erhu e1 = new Erhu();

        // MusicalLnstruments m2 = new Erhu();
        // e1.makeSound();
        // p1.setErhu(e1) ;

        // p1.erhu.makeSound();
        // p1.setErhu(m2.makeSound());

        p1.play(e1);

        
    }
    //私有属性
    // MusicalLnstruments erhu;

    // //无参构造方法
    // public Musician(){
        
    // }

    // //有参构造方法
    // public Musician(MusicalLnstruments erhu){
    //     this.erhu = erhu;
    // }
    // //setter and getter
    // public MusicalLnstruments getErhu(){
    //     return erhu;
    // }

    // public void setErhu(MusicalLnstruments erhu){
    //     this.erhu = erhu;
    // }
    //定义演奏乐器的方法
    public void play(MusicalLnstruments i){
    // String sout = erhu.makeSound() ;
    // Erhu e2 = new Erhu();
        i.makeSound();
        
    }
}
