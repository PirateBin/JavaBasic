package proOOP.Extend2;

public class ChineseDog extends Dog{
    //父类中的方法不能满足我们的需求，需要重写
    //中华田园犬完全用不到父类中的代码，所以不需要super

    public void eat(){
        System.out.println("狗吃剩饭");
    }

}
