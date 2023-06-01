package System.object;

import java.util.StringJoiner;

//Cloneable
//如果一个接口中没有抽象方法
//表示当前接口是一个标记性接口
//现在Cloneable表示一旦实现，那么当前类的对象就可以被克隆
//如果没有实现，就不能被克隆

public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;  //游戏图片
    private int[] data;  //游戏进度

    public User(){
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPath() {
        return path;
    }

    public int[] getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString(){
        return "角色编号为："+id+",用户名："+username+",密码"+password+",游戏图片："+path+",进度"+arrToString();
    }

    public String arrToString(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for(int i=0;i<data.length;i++){
            sj.add(data[i]+" ");
        }
        return sj.toString();
    }

    @Override
    //protected Object clone() throws CloneNotSupportedException{
        //调用父类中的clone方法
        //相当于让Java帮我们克隆一个对象，并返回
        // return super.clone();


        //深克隆
        protected Object clone() throws CloneNotSupportedException{
            //先把克隆对象数组获取出来
            int [] data=this.data;
            //创建新数组
            int [] newdata=new int[data.length];
            //拷贝数组中的数据
            for(int i=0;i<data.length;i++){
                newdata[i]=data[i];
        }

            //调用父类中的方法克隆对象
            User u=(User)super.clone();
            u.data=newdata;
            return u;
    }
}



