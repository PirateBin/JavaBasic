package proOOP.Interface.project;

public class PingPangSporter extends Sporter implements English{

    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public void studey() {
        System.out.println("乒乓球运动员学习打乒乓球");
    }
}
