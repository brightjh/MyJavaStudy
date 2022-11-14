package top.brightzm.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame2 extends JFrame implements KeyListener {

    public MyJFrame2() {

        // 设置大小
        this.setSize(300, 400);
        // 设置界面标题
        this.setTitle("事件展示");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消格式默认居中
        this.setLayout(null);

        // 添加键盘监听
        this.addKeyListener(this);





        // 允许显示
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65){
            System.out.println("按键A");
        }else if (code==66){
            System.out.println("按键B");
        }else {
            System.out.println(code);
        }
    }
}