package top.brightzm.ui;

import javax.swing.*;
import java.awt.*;

public class LoginJFrame extends JFrame {

    public LoginJFrame() {
        //创建对象的同时设置大小
        this.setSize(480, 438);
        //设置标题
        this.setTitle("拼图游戏--登录");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 关闭窗口,关闭程序
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        // 让界面显示
        this.setVisible(true);
    }
}
