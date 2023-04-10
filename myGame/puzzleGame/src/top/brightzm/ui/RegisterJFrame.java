package top.brightzm.ui;

import javax.swing.*;
import java.awt.*;

public class RegisterJFrame extends JFrame {

    public RegisterJFrame(){
        // 设置大小
        this.setSize(488,500);

        // 设置标题
        this.setTitle("拼图游戏--注册");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 关闭窗口,关闭程序
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setVisible(true);

    }
}
