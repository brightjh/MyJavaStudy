package top.brightzm.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {

    // 创建按钮对象
    JButton jbt1 = new JButton("点我");
    JButton jbt2 = new JButton("再点我");


    public MyJFrame() {
        // 创建界面对象
        JFrame jFrame = new JFrame();
        // 设置大小
        jFrame.setSize(300, 400);
        // 设置界面标题
        jFrame.setTitle("事件展示");
        // 设置界面置顶
        jFrame.setAlwaysOnTop(true);
        // 设置界面居中
        jFrame.setLocationRelativeTo(null);
        // 设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消格式默认居中
        jFrame.setLayout(null);



        // 设置位置和宽高
        jbt1.setBounds(100, 100, 100, 50);
        // 添加动作监听(鼠标点击,空格)
        // 参数表示要执行的代码
        jbt1.addActionListener(this);
        // 添加按钮到界面中
        jFrame.getContentPane().add(jbt1);


        // 设置位置和宽高
        jbt2.setBounds(100, 100, 200, 50);
        // 添加动作监听(鼠标点击,空格)
        // 参数表示要执行的代码
        jbt2.addActionListener(this);
        // 添加按钮到界面中
        jFrame.getContentPane().add(jbt2);




        // 允许显示
        jFrame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前按钮进行判断

        //获取按钮对象
        Object source = e.getSource();

        if(source==jbt1){
            jbt1.setSize(200,200);
        }else if (source==jbt2){
            Random r = new Random();
            jbt2.setLocation(r.nextInt(200), r.nextInt(200));
        }


    }
}
