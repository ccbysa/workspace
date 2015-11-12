package hk.com.google.testhttp;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class TestHttp {
    public static void main(String[] args) throws Exception{
        String httpstr = "http://www.baidu.comyouname=bagfg";
        String test = URLEncoder.encode(httpstr, "ISO_8859_1");

        System.out.println(test);
        
        String test2 = URLDecoder.decode(test, "ISO_8859_1");
        System.out.println(test2);

    }
}