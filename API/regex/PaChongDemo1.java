package API.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChongDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        把连接：http://list.chineseidcard.com/
        中的身份证号码都爬取出来
         */

        //创建一个url对象
        URL url=new URL("http://list.chineseidcard.com/");
        //连接上这个网络
        URLConnection conn=url.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br=new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        String regex="[1-9]\\d{17}";
        Pattern pattern= Pattern.compile(regex);
        //在读取的时候每次读一整行
        while((line=br.readLine())!=null) {

            //System.out.println(line);   //输出每一行的信息

            //拿着文本匹配器的对象matcher按照pattern的规则去读取这一行的信息
            Matcher matcher=pattern.matcher(line);
            while(matcher.find()){
            System.out.println(matcher.group());
            }
        }
        br.close();
    }
}
