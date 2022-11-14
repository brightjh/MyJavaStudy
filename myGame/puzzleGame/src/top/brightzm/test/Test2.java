package top.brightzm.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        // 创建界面对象
        JFrame jFrame = new JFrame();
        // 设置大小
        jFrame.setSize(300,400);
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


        // 创建按钮对象
        JButton jbt = new JButton("点我");
        // 设置位置和宽高
        jbt.setBounds(100,100,100,50);
        // 添加动作监听(鼠标点击,空格)
        // 参数表示要执行的代码
        jbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("又点击了");
            }
        });
        // 添加按钮到界面中
        jFrame.getContentPane().add(jbt);



        // 允许显示
        jFrame.setVisible(true);



    }


}
