package proOOP.Interface.project;

public class Test {
    public static void main(String[] args) {
        BasketballSporter bs=new BasketballSporter(NameAndAgeUtil.name(),NameAndAgeUtil.age());
        bs.studey();
        System.out.println(bs.getName()+","+ bs.getAge());

        BasketballCoach bc=new BasketballCoach("李四",35);
        bc.teach();
        System.out.println(bc.getName()+","+ bc.getAge());

        PingPangSporter ps=new PingPangSporter("瑞承悦" ,20);
        ps.speakEnglish();
        ps.studey();

        PingPangCoach pc=new PingPangCoach(NameAndAgeUtil.name(),NameAndAgeUtil.age());
        pc.speakEnglish();
        pc.teach();
        System.out.println(pc.getName()+","+pc.getAge());
    }
}
