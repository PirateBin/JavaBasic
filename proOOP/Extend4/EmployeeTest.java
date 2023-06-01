package proOOP.Extend4;

public class EmployeeTest {
    public static void main(String[] args) {
        Chef c=new Chef("001","张三",1000);

        Manager m=new Manager("002","李四",2000,5999.0);

        c.Work();
        c.eat();
        System.out.println(c.getId()+","+c.getName()+","+c.getSalary());

        System.out.println(m.getBonus());
        m.Work();
        m.eat();

    }
}
