package proOOP.Extend4;

public class Chef extends Employee{
    public Chef(){

    }

    public Chef(String id,String name,int salary){
        super(id,name,salary);
    }



    @Override
    public void Work(){
        System.out.println("厨师炒菜");
    }


}
