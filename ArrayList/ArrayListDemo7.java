package ArrayList;

import java.util.ArrayList;

/*
需求：
定义一个集合，存入三个用户对象
用户属性为：id，username,password
要求：
定义一个方法，根据id查找对应的用户细节
如果存在，返回true
如果不存在，返回false
 */
public class ArrayListDemo7 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<User> list=new ArrayList<>();

        //创建三个用户对象
        User u1=new User("pirate001","zhangsan","123456");
        User u2=new User("pirate002","lisi","123");
        User u3=new User("pirate003","wangwu","456");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        //调用方法查看id是否存在
        boolean flag=contain(list,"pirate001");

        System.out.println(flag);

    }

    //创建一个方法
    public static boolean contain(ArrayList<User> list,String id){
        //直接调用getIndex方法
        /*int Index=getIndex(list,id);
        if(Index>=0){
            return true;
        }else{
            return false;
        }
         */

        return getIndex(list,id)>=0;
    }

    public static int getIndex(ArrayList<User> list,String id){
        for(int i=0;i<list.size();i++){
            User u=list.get(i);
            String uid=u.getId();
            if(uid.equals(id)){
                //找到了返回ture
                return i;
            }
        }
        //循环结束，表示集合中所有元素都已比较完毕，还没有一样的，返回false
        return -1;
    }
}
