package com.hjs;

import java.io.File;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Calendar;

/**
 * Created by jianshuang_huang on 2018/4/2.
 */
public class BigDecimalTest {

    public static void main(String[] args) throws ParseException {

/*        BigDecimal a = new BigDecimal(10.000);
        BigDecimal b = new BigDecimal(0);

        if(1==1){

        }*/


        //System.out.println(b.add(null));

        //System.out.println(a.divide(b));

        //BigDecimal.ROUND_HALF_UP四舍五入,取四位小数
        //System.out.println(a.divide(b,BigDecimal.ROUND_HALF_UP,4));


        //System.out.println(a.multiply(b));


        //加法
        //System.out.println(a.add(b));

        //System.out.println(a.compareTo(b));



        //日期
        //Date date = new Date();
/*        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy",Locale.ENGLISH);
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy 'YTD' dd/MM");

        String dateStr = "2017-7-31";

        try {
            System.out.println(sdf2.format(sdf.parse(dateStr)));
            System.out.println(sdf3.format(sdf.parse(dateStr)));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Date date = null;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar cl = Calendar.getInstance();
        cl.setTime(date);

        cl.set(Calendar.DAY_OF_MONTH,0);

        System.out.println(sdf.format(cl.getTime()));

        cl.add(Calendar.MONTH,-5);
        cl.set(Calendar.DAY_OF_MONTH,0);

        System.out.println(sdf.format(cl.getTime()));*/


        /**
         * 测试  /1000保留整数
         */
        /*BigDecimal a = new BigDecimal(6327092.99);

        BigDecimal b = a.divide(new BigDecimal(1000),0,BigDecimal.ROUND_HALF_UP);

        System.out.println(b);*/



/*        BigDecimal b = new BigDecimal(-1);
        System.out.println(b.abs());*/

        //测试，除法报错
        /*BigDecimal a = new BigDecimal(10);
        BigDecimal b = new BigDecimal(3);

        System.out.println(a.divide(b,BigDecimal.ROUND_HALF_UP,4));*/

        //日期计算，获取去年的当天

/*        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");


        Calendar cl = Calendar.getInstance();
        cl.setTime(new Date());

        cl.add(Calendar.YEAR,-1);

        System.out.println(cl.getTime());*/



        //计算几个数字
     /*   BigDecimal a = new BigDecimal(9258104.00);
        BigDecimal b = new BigDecimal(4153886);
        BigDecimal c = new BigDecimal(3477672);

        System.out.println(a.divide(b, BigDecimal.ROUND_HALF_UP,5).multiply(c));*/



    /*    //计算几个数字
        BigDecimal a = new BigDecimal(5163384);
        BigDecimal b = new BigDecimal(3477672);
        BigDecimal c = new BigDecimal(9258104);

        System.out.println(c.divide(b, BigDecimal.ROUND_HALF_UP,5).divide(a,BigDecimal.ROUND_HALF_UP,5));

*/

        /*Double d = new Double("0.1");
        System.out.println(d*100);

        System.out.println(d*100+"%");



*/

/*        BigDecimal a = new BigDecimal(10);
        BigDecimal b = new BigDecimal(3);

        System.out.println(a.divide(b,7,4));*/


/*        String oldUsername = "j_huang";

        String oldFirstname = oldUsername.substring(0,oldUsername.indexOf("_"));
        String oldLastName = oldUsername.substring(oldUsername.indexOf("_")+1,oldUsername.length());

        System.out.println(oldFirstname.substring(0,1).toUpperCase()+oldFirstname.substring(1,oldFirstname.length()));

        System.out.println(oldLastName.substring(0,1).toUpperCase()+oldLastName.substring(1,oldLastName.length()));*/


/*        //判断是否含有中文
        //判断名字中是否含有中文
        String oldName = "H J s";
        String regEx = "[\\u4E00-\\u9FA5]+";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(oldName);

        System.out.println(m.find());*/



/*    String a = "3";

    int b = Integer.parseInt(a);

        System.out.println(b);*/



/*    String a = "hjs,cc,";

        System.out.println(a.substring(0,a.length()-1));*/


        /*Object a = "2018-04-21T16:00:00.000Z";

        System.out.println((Date)a);*/



        //时间

        //当前时间判断当前季度和当前季度的起始日期

        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar startCalendar = Calendar.getInstance();
        Date date = sdf.parse("2016-01-12");
        startCalendar.setTime(date);

        System.out.println(startCalendar.get(Calendar.MONTH)+1);;

        startCalendar.set(Calendar.MONTH, ((int) startCalendar.get(Calendar.MONTH) / 3) * 3);
        startCalendar.set(Calendar.DAY_OF_MONTH, 1);
        //setMinTime(startCalendar);

        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(date);
        endCalendar.set(Calendar.MONTH, ((int) startCalendar.get(Calendar.MONTH) / 3) * 3 + 2);
        endCalendar.set(Calendar.DAY_OF_MONTH, endCalendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        //setMaxTime(endCalendar);


        System.out.println(startCalendar.getTime());
        System.out.println(endCalendar.getTime());*/



        /*String path = "D:\\BaiduNetdiskDownload";
        String newPath = path+ File.separator+"2018-01-12"+ File.separator+"Hello";*/
        /*File Dic = new File(newPath);
        if (!Dic.exists()){
            System.out.println("创建目录");
            Dic.mkdirs();
        }*/


      /*  String origFileName = newPath *//*+ File.separator + "发送客户文件.rar"*//*;
        System.out.println(origFileName);


        //获取文件目录及后缀名
        String origFilePath = origFileName.substring(0,origFileName.lastIndexOf(File.separator));
        String fileSuffix = origFileName.substring(origFileName.lastIndexOf(".")+1,origFileName.length());


        System.out.println(origFilePath);
        System.out.println(fileSuffix);


        File file = new File(origFileName);


        if(file.isDirectory()){
            String[] children = file.list();
            for (String str : children){
                System.out.println(str);
            }
        }*/


        //System.out.println(FileUtilsIDG.deleteFileOrDirectory(newPath));

        /*System.out.println(file.getPath());
        System.out.println(file.getName());*/


        //List<File> fileList = FileUtils.extractFile(origFileName,null);





        /*//test();

        int[] a = new int[2];

        a[0] = 1;
        a[1] = 2;

        System.out.println();*/


        //BigDecimal
        /*BigDecimal a = new BigDecimal(56936363.0);

        System.out.println("$"+a);

        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println(df.format(a));*/

        /*String a = "2088";

        int b = Integer.valueOf(a) -1;

        System.out.println(b);*/


        /*File a = new File("D:\\MyWork\\美元基金账户项目\\发送Qu邮件\\MediaII 17Q4.xlsx");

        System.out.println(a.getPath());
        System.out.println(a.getName());*/

        BigDecimal a = new BigDecimal("0.00");
        BigDecimal b = new BigDecimal("0.0000");

        //System.out.println(a.compareTo(b) ==0);
        System.out.println(a.equals(b));









    }


    private static void test(boolean ...isDelete){


        System.out.println(isDelete.length);
        System.out.println(isDelete[0]);

    }


    private static void setMinTime(Calendar calendar){
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }

    private static void setMaxTime(Calendar calendar){
        calendar.set(Calendar.HOUR_OF_DAY, calendar.getActualMaximum(Calendar.HOUR_OF_DAY));
        calendar.set(Calendar.MINUTE, calendar.getActualMaximum(Calendar.MINUTE));
        calendar.set(Calendar.SECOND, calendar.getActualMaximum(Calendar.SECOND));
        calendar.set(Calendar.MILLISECOND, calendar.getActualMaximum(Calendar.MILLISECOND));
    }
}
