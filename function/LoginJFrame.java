package function;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginJFrame extends MyJFrame implements ActionListener {

    JButton go=new JButton("Go");

    public LoginJFrame(){
        //设置图标
        setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\java\\StudyTest\\image\\logo.jpg"));

        //设置界面
        initJframe();

        //添加组件
        initView();

        //界面显示
        this.setVisible(true);

    }

    public void initView() {
        JLabel image=new JLabel(new ImageIcon("D:\\java\\StudyTest\\image\\kit.jpg"));
        image.setBounds(100,50,174,174);
        //往内容面板添加图片
        this.getContentPane().add(image);


        go.setFont(new Font(null,1,20));
        go.setBounds(120,274,150,50);
        go.setBackground(Color.white);

        go.addActionListener(super::method1);

        this.getContentPane().add(go);


    }

    public void initJframe(){
        //设置标题
        this.setTitle("随机点名器");
        //设置大小
        this.setSize(400,500);
        //设置关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置窗口无法调节
        this.setResizable(false);
        //界面居中
        this.setLocationRelativeTo(null);
        //取消内部默认居中放置
        this.setLayout(null);
        //设置背景颜色
        //getContentPane()内容面板
        this.getContentPane().setBackground(Color.white);
        //置顶
        this.setAlwaysOnTop(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj==go){
            System.out.println("go按钮被点击了");
        }
    }

    public void method(ActionEvent e) {
        Object obj=e.getSource();
        if(obj==go){
            System.out.println("go按钮被点击了");
        }
    }
}
