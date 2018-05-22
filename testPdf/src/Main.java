import org.zefer.pd4ml.PD4Constants;
import org.zefer.pd4ml.PD4ML;

import java.awt.*;
import java.io.*;
import java.security.InvalidParameterException;

public class Main {

    public static void main(String[] args) {

        generatePDF();



    }


    public static void generatePDF() {
        try {

            FileOutputStream fos = new FileOutputStream(new File("D:\\MyWork\\美元基金账户项目\\发送Qu邮件\\a4_hori.pdf"));
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            PD4ML pd4ml = new PD4ML();
            pd4ml.setPageInsets(new Insets(5, 5, 5, 5));
            pd4ml.setHtmlWidth(900);
            pd4ml.setPageSize(PD4Constants.A4);  // A4竖向显示  pd4ml.changePageOrientation(PD4Constants.A4)横向显示
            /*pd4ml.useTTF("java:fonts", true);
            pd4ml.setDefaultTTFs("SongTi_GB2312", "SongTi_GB2312", "SongTi_GB2312");*/
            pd4ml.enableDebugInfo();
            pd4ml.render("file:D:\\MyWork\\美元基金账户项目\\发送Qu邮件\\a4_hori.html", os);  //如果用上面的fos，就是写出到指定的文件



        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }
}
