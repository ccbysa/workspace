package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

/**
 * ѧϰJavaͼ�λ��û�������
 * @author willard
 * @version 1.0
 *
 */
import javax.swing.*;
import java.awt.event.*;

public class TestFrame extends JFrame {

    private int counter = 0;

    public TestFrame() {
        /* ʹ�����������һ�����ڼ����� */
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println(
                    "Exit when Closed event");
                //�˳�Ӧ�ó���
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //System.exit(0);
            }

            public void windowActivated(WindowEvent e) {
                // �ı䴰�ڱ���
                setTitle("Test Frame " + counter++);
                System.out.println("counter = " + counter);
            }
        });

        // ���ô���Ϊ�̶���С
        setResizable(false);
        setSize(500, 150);//��ȣ��߶�
    }

    public static void main(String[] args) {
        TestFrame tf = new TestFrame();
        tf.show();
    }

}