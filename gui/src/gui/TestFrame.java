package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * 学习Java图形化用户界面编程
 * @author willard
 * @version 1.0
 *
 */
import javax.swing.*;
import java.awt.event.*;

public class TestFrame extends JFrame {

    private int counter = 0;

    public TestFrame() {
        /* 使用匿名类添加一个窗口监听器 */
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println(
                    "Exit when Closed event");
                //退出应用程序
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //System.exit(0);
            }

            public void windowActivated(WindowEvent e) {
                // 改变窗口标题
                setTitle("Test Frame " + counter++);
                System.out.println("counter = " + counter);
            }
        });

        // 设置窗口为固定大小
        setResizable(false);
        setSize(500, 150);//宽度，高度
    }

    public static void main(String[] args) {
        TestFrame tf = new TestFrame();
        tf.show();
    }

}