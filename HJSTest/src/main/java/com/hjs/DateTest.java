package com.hjs;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by jianshuang_huang on 2018/5/10.
 */
public class DateTest {

    public static void main(String[] args) {


        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        System.out.println(sdf.format(new Date()));


    }

}
