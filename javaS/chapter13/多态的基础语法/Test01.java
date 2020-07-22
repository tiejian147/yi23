/**
 * 多态的基础语法：
 *      1、学习多态基础语法之前，我们需要普及两个概念：
 *          第一个：向上转型
 *              子----->父（自动类型转换）
 *          第二个：向下转型
 *              父----->子（强制类型转换，需要加强制类型转换符）
 * 
 *          注意：java中允许向上转型，也允许向下转型
 * 
 *          *****（五颗星）无论是向上转型，还是向下转型，
 *          两种类型之间必须要有继承关系，没有继承关系编译器会报错。
 * 
 *          在工作中，沟通时候，要专业：说向上转型和向下转型，不要说自动类型转换，
 *          也不要说强制类型转换，因为自动类型转换和强制类型转换是使用在基本数据类型
 *          方面的，在引用类型转换这里只有向上和向下转型。
 * 
 *      2、多态指的是：
 *          父类型引用指向子类型对象。
 *          包括编译阶段和运行阶段
 *          编译阶段：绑定父类的方法
 *          运行阶段：动态绑定子类型对象的方法
 *          多种形态。
 * 
 *      3、什么时候必须使用“向下转型”？
 *          不要随便做强制类型转换
 *          当你需要访问的是子类对象中“特有”的方法，此时必须进行向下转型。
 */

public class Test01 {
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.move();

        Cat c1 = new Cat();
        c1.move();

        Brid b1 = new Brid();
        b1.move();

        //代码是否可以这样写：
        /**
         * 1、Animal和Cat之间有继承关系吗？有的
         * 2、Animal是父类，Cat是子类。
         * 3、Cat is a Animal   这句话能不能说通？  能
         * 4、经过测试得知java中支持这样的写法：
         *      父类型的引用允许指向子类型的对象。
         *      Animal a2 = new Cat();
         *      a2就是父类型的引用
         *      new Cat();是一个子类型的对象
         *      允许a2这个父类型引用子类型的对象
         * 
         */

         Animal a2 = new Cat();
         Animal a3 = new Brid();

        //没有继承关系的两个类型质检存在转型吗？
        //错误：不兼容的类型：Dog 无法转换为Animal
        //Animal a4 = new Dog();

        //调用a2的move（） 方法
        /**
         * 什么是多态？
         *      多重形态，多重状态
         *  分析：a2.move();
         *      java程序分为编译阶段和运行阶段
         *      先来分析编译阶段：
         *          对于编译器来说，编译器只知道a2的类型是Animal，
         *          所以编译器在检查语法的时候，会去Animal.class
         *          字节码文件中找move()方法， 找到之后，绑定上move()
         *          方法，编译通过，静态绑定成功（编译阶段属于静态绑定）
         *      再来分析运行阶段：
         *          运行阶段的时候，实际上在堆内存中创建的java对象是Cat对象，所以move
         *          的时候，真正参与move的对象是一只猫，所以运行阶段会动态执行Cat对象的
         *          move()fangfa ,这个过程属于运行阶段绑定。（运行阶段绑定属于动态绑定）
         * 
         *      多态表示多种形态：
         *          编译的时候一种形态
         *          运行的时候是另一种形态
         */
        a2.move();
        //调用a3的move方法
        a3.move();

        Animal a4 = new Cat();//底层对象是一只猫

        /**
         * 分析这个程序能够编译和运行呢？
         *  分析程序一定要分析编译阶段的静态绑定和运行阶段的动态绑定
         *  只有编译通过的代码才能运行，没有编译，根本轮不到运行
         *  下面代码编译报错了：找不到符号
         *  因为编译器只知道a4的类型是Animal，去Animal.class 文件中找catchMouse（）
         *  方法，结果没有找到，所以静态绑定失败，编译报错，无法运行（语法不合法）
         */
        // a4.catchMouse();

        //假设代码谢东了这里，我非要调用catchMouse();方法怎么办？
        //这个时候就必须使用“向下转型”了，（强制类型转换）
        //一下这行代码为啥没报错？
        //因为a5是Animal类型，转成Cat，Animal和Cat质检存在继承关系，所以没报错。
        Cat x = (Cat)a4;

        x.catchMouse();//猫抓老师

        //向下转型有风险吗？
        Animal a6 = new Brid();//表面上a6是一个Animal ，运行的时候实际上是一只鸟
        /**
         * 分析以下程序，编译报错还是运行报错？
         *  编译器检测到a6这个引用是Animal类型，
         *  而Animal和Cat之间存在继承关系，所以可以向下转型。
         *  编译没毛病。
         * 
         *  运行阶段，堆内存实际创建的对象是：Brid对象。
         *  在实际运行过程中，拿着Brid对象转换成Cat对象，就不行了
         *  因为Brid和Cat质检没有继承关系。
         * 
         * 运行时出现异常：这个异常和空指针异常一样非常重要，也非常经典：
         *      Exception in thread "main" java.lang.ClassCastException: 
         * Brid cannot be cast to Cat
         *
         */

        // Cat y = (Cat)a6;
        // y.catchMouse();

        //怎么避免：ClassCastException 异常的发生？
        /**
         * 新的内容，运算符：
         *  instanceof （运行阶段动态判断）
         *  第一：instanceof 可以在运行阶段动态判断引用指向的对象的类型；
         *  第二：instanceof 的语法：
         *      (引用 instanceof 类型)
         *  第三：instanceof 运算符的运算结果只能是：true/false
         *  第四：c是一个引用，c变量保存了内存地址指向了堆中的对象
         *      假设（c instanceof Cat) 为true 表示：
         *          c引用指向的堆内存中的java对象   是   一个Cat
         *      假设(c instanceof Cat) 为false 表示：
         *          c引用指向的堆内存中的java对象     不是    一个Cat
         * 
         *  程序员要养成一个好习惯：
         *      任何时候，任何地点，对类型进行向下转型时，一定要使用instanceof 
         *      运算符进行判断。（java规范中要求的）
         *      这样很好的可以避免：ClassCastException 
         */
        System.out.println(a6 instanceof Cat);//false
        S
        if(a6 instanceof Cat){//如果a6是一只Cat
            Cat y = (Cat)a6;//再进行强制类型转换
            y.catchMouse();
        }

    }
    
}
//动物类
class Animal{

    // String name;

    //编写移动的方法
    public void move(){
        System.out.println("动物在移动");
    }
}