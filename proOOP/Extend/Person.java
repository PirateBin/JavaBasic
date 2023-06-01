package proOOP.Extend;
public class Person {

    public static void main(String[] args) {
        OverseaStudent s = new OverseaStudent();
        s.lunch();
    }

    static class Student {
        public void eat() {

            System.out.println("吃饭");
        }

        public void drink() {
            System.out.println("喝水");
        }
    }


    //应用场景：当父类中的方法不满足子类现在的需求时，我们需要把方法重写
    //注意：子类中重写的方法上面要加上@Override
    static class OverseaStudent extends Student {
        @Override
        public void eat() {
            System.out.println("吃汉堡");
        }
        @Override
        public void drink() {
            System.out.println("喝咖啡");

        }

        public void lunch(){
            this.eat();
            this.drink();

            super.eat();
            super.drink();
        }
    }

}