package hk.com.google.shudu;

import java.util.Scanner;
import hk.com.google.shudu.html.javassist.*;


public class ShuDu {
	 public static void main(String[] args) throws Exception {

         //����ǵõ�������ĳ�

        ClassPool pool = ClassPool.getDefault();

        //ȡ����Ҫ�������jar�ļ����趨·��

        pool.insertClassPath("E:""crack""chart.ext.jar");

        //ȡ����Ҫ�������޸ĵ��ļ���ע��������·��

        CtClass cc1 = pool.get("com.objectplanet.chart.a");

        try {

            //ȡ����Ҫ�޸ĵķ���

            CtMethod method = cc1.getDeclaredMethod("a");

           //�����޸����������ֱ�ӷ���(ע�⣺���ݷ����ľ��巵��ֵ���أ���Ϊ�����������ֵ��void������ֱ��return��)

            method.insertBefore("{if(true) return ;}");

            //д�뱣��

            cc1.writeFile();

        } catch (NotFoundException e) {

            e.printStackTrace();

       }

}
}

