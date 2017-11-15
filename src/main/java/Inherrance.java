public class Inherrance {
    /**
     * Java中创建子类对象时会默认调用父类中无参的构造函数，然后调用子类的构造函数。
     * @param args
     */
    public static void main(String[] args){
        ChildClass clazz = new ChildClass();
        ChildClass .staticMethod();
        clazz.mothed();
    }
}
