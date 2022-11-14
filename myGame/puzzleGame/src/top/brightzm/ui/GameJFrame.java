package top.brightzm.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    int[][] data = new int[4][4];

    // 记录空白方块在二维数组中的位置
    int x = 0;
    int y = 0;

    // 定义记步器
    int step = 0;


    //定义变量,存储路径
    StringBuilder imageFileName = new StringBuilder("animal/animal3/");

    String path = "puzzleGame/image/" + imageFileName;


    // 定义正确的数组
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
    };


    // 创建选项下的条目对象
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem wechat = new JMenuItem("微信二维码");

    public GameJFrame() {

        // 创建二维数组
        // 管理图片

        // 初始化界面
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化数据
        initDate();

        //初始化图片
        initImage();

        System.out.println(path);

        // 设置界面显示
        this.setVisible(true);

    }

    //初始化数据
    private void initDate() {
        // 1.定义一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};


        // 打乱数组
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(16);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 输出数组
//        for (int i = 0; i < tempArr.length; i++) {
//            System.out.print(tempArr[i] + " ");
//
//        }
//        System.out.println();


        // 给二维数组赋值
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    // 初始化图片
    // 按二维数组添加图片
    private void initImage() {

        // 清空之前的图片
        this.getContentPane().removeAll();

        // 判断是否胜利
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("puzzleGame/image/win.png"));
            winJLabel.setBounds(203, 280, 197, 73);
            this.getContentPane().add(winJLabel);
        }

        // 显示步数
        JLabel stepCount = new JLabel("步数: " + step);
        stepCount.setBounds(40, 15, 197, 20);
        this.getContentPane().add(stepCount);

        //显示提示
        JLabel point = new JLabel("方向键移动拼图,按A提示,按W一键通关");
        point.setBounds(40, 30, 300, 20);
        this.getContentPane().add(point);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                // 获取图片序号
                // 创建JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon(path + data[i][j] + ".jpg"));
                //设置图片位置
                jLabel.setBounds(j * 102 + 83, i * 105 + 134, 105, 105);
                // 给图片添加边框
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED)); // 0凸出 1凹下

                //将JLabel添加到页面
                this.getContentPane().add(jLabel);
            }
        }
        // 添加背景图片
        JLabel background = new JLabel(new ImageIcon("puzzleGame/image/background.png"));
        background.setBounds(40, 40, 508, 560);
        this.getContentPane().add(background);

        // 刷新界面
        this.getContentPane().repaint();

    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于");
        JMenu changeImage = new JMenu("更换图片");

        // 将更换图片添加到选项中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        //将条目添加到选项中
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(wechat);


        // 给条目绑定事件
        replayItem.addActionListener(this);
        closeItem.addActionListener(this);
        wechat.addActionListener(this);
        girl.addActionListener(this);
        animal.addActionListener(this);
        sport.addActionListener(this);


        // 将选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        // 给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        // 设置窗口大小
        this.setSize(600, 680);
        // 设置标题
        this.setTitle("拼图游戏 v1.0");
        // 设置置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 关闭窗口,关闭程序
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置
        this.setLayout(null);
        //添加键盘监听事件
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //把页面中所有图片删除
            this.getContentPane().removeAll();
            //加载完整图片
            JLabel all = new JLabel(new ImageIcon(path + "all.jpg"));
            all.setBounds(83, 134, 420, 420);
            this.getContentPane().add(all);
            //加载背景
            JLabel background = new JLabel(new ImageIcon("puzzleGame/image/background.png"));
            background.setBounds(40, 40, 508, 560);
            this.getContentPane().add(background);
            // 刷新界面
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 判断是否胜利
        if (victory()) {
            return; // 结束方法
        }

        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            // 增加步数
            step++;
            initImage();
        } else if (code == 38) {
            System.out.println("向上移动");
            if (x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            // 增加步数
            step++;
            initImage();

        } else if (code == 39) {
            System.out.println("向右移动");
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            // 增加步数
            step++;
            initImage();
        } else if (code == 40) {
            System.out.println("向下移动");
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            // 增加步数
            step++;
            initImage();
        } else if (code == 65) {
            // 显示原本的页面
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16},
            };
            initImage();
        }

    }

    //    判断是否成功
    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取被点击的条目对象
        Object source = e.getSource();

        if (source == girl) {

            imageFileName.delete(0, imageFileName.length());
            Random r = new Random();
            // 将图片文件夹更换成girl并随机抽取文件夹
            imageFileName = imageFileName.append("girl/").append("girl").append((r.nextInt(11) + 1)).append('/');
            path = "puzzleGame/image/" + imageFileName.toString();

            initDate();
            initImage();

        } else if (source == animal) {

            imageFileName.delete(0, imageFileName.length());
            Random r = new Random();
            // 将图片文件夹更换成girl并随机抽取文件夹
            imageFileName = imageFileName.append("animal/").append("animal").append((r.nextInt(8) + 1)).append('/');
            path = "puzzleGame/image/" + imageFileName.toString();

            initDate();
            initImage();

        } else if (source == sport) {

            imageFileName.delete(0, imageFileName.length());
            Random r = new Random();
            // 将图片文件夹更换成girl并随机抽取文件夹
            imageFileName = imageFileName.append("sport/").append("sport").append((r.nextInt(10) + 1)).append('/');
            path = "puzzleGame/image/" + imageFileName;

            initDate();
            initImage();

        } else if (source == replayItem) {
            //重新开始游戏
            step = 0;
            initDate();
            initImage();

        } else if (source == closeItem) {
            // 关闭页面
            System.exit(0);

        } else if (source == wechat) {
            // 创建弹窗对象
            JDialog jDialog = new JDialog();
            // 添加图片和设置大小
            JLabel wechatImage = new JLabel(new ImageIcon("puzzleGame/image/wechat.png"));
            wechatImage.setBounds(0, 0, 215, 215);
            jDialog.getContentPane().add(wechatImage);
            //弹框设置大小并置顶居中
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            // 弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //显示弹框
            jDialog.setVisible(true);
        }

    }


}
