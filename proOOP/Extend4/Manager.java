package proOOP.Extend4;

public class Manager extends Employee{
    private double bonus;

    public Manager(){

    }

    public Manager(String id,String name,int salary,double bonus){
        super(id,name,salary);
        this.bonus=bonus;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void Work(){
        System.out.println("经理管理其他人");
    }
}
