package System.RunTime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJframe extends JFrame implements ActionListener {

    //创建三个按钮对象
    JButton yesBut=new JButton("帅爆了");
    JButton midBut=new JButton("一般般吧");
    JButton noBut=new JButton("不帅，有点磕碜");
    JButton dadBut = new JButton("饶了我吧");

    //决定了上方的按钮是否展示
    boolean flag =false;



    public MyJframe(){
        initJFrame();


        initView();


        //显示
        this.setVisible(true);
    }

    private void initView(){

        this.getContentPane().removeAll();

        if(flag) {
            //展示按钮
            dadBut.setBounds(50, 20, 100, 30);
            dadBut.addActionListener(this);
            this.getContentPane().add(dadBut);
        }

        JLabel text=new JLabel("你觉得自己帅吗？");   //用JLabel设置文本
        text.setFont(new Font("微软雅黑",0,30));  //设置文本字体
        text.setBounds(120,150,300,50);  //设置文本位置

        yesBut.setBounds(200,250,100,30);
        midBut.setBounds(200,325,100,30);
        noBut.setBounds(160,400,180,30);

        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        noBut.addActionListener(this);

        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(noBut);

        this.getContentPane().repaint();

    }

    private void initJFrame() {
        //设置宽高
        this.setSize(500, 600);
        //设置标题
        this.setTitle("恶搞好基友");
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //置顶
        this.setAlwaysOnTop(true);
        //居中
        this.setLocationRelativeTo(null);
        //取消内部默认布局
        this.setLayout(null);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj == yesBut){
            System.out.println("你的好基友点击了帅爆了");
            //给好基友一个弹窗
            showJDialog("你太自信了，给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 300");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            flag =true;   //当点击按钮后修改flag的值使其显示dadBut按钮
            initView();  //重新初始化界面

        }else if(obj==midBut){
            System.out.println("你的好基友点击了一般般吧");
            showJDialog("你还是太自信了，再给你一点小惩罚");
            try{
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            }catch(IOException ex){
                throw new RuntimeException(ex);
            }

            flag =true;
            initView();

        }else if(obj==noBut){
            System.out.println("你的好基友点击了不帅");
            showJDialog("你还是有自知之明的，但是也是要给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 7200");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            flag =true;
            initView();

        }else if(obj==dadBut){
            System.out.println("求饶");
            showJDialog("这次饶了你");
            try {
                Runtime.getRuntime().exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

    }

    public void showJDialog(String content){
        //创建一个弹窗对象
        JDialog jDialog=new JDialog();
        //给弹窗设置大小
        jDialog.setSize(200,150);
        //让弹窗置顶
        jDialog.setAlwaysOnTop(true);
        //让弹窗居中
        jDialog.setLocationRelativeTo(null);
        //弹窗不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框中
        JLabel warning=new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        //让弹窗展示出来
        jDialog.setVisible(true);
    }

}
