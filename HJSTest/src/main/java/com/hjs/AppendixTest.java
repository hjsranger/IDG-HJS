package com.hjs;

import java.math.BigDecimal;

/**
 * Created by jianshuang_huang on 2018/5/8.
 */
public class AppendixTest {


    public static void main(String[] args) {


        BigDecimal totalCost = add("3401049.78","25917915.90");
        System.out.println("totalCost:"+totalCost);

        BigDecimal addShareNo = add("17213985","2258849");
        System.out.println("addShareNo:"+addShareNo);

        BigDecimal allShareNo = add("41746046","142294438","5477988","21954200");


        System.out.println(allShareNo.multiply(div(totalCost,addShareNo)));

    }


    /**
     * 多个数相加
     * @param nums
     * @return
     */
    public static BigDecimal add(BigDecimal... nums){

        BigDecimal result = BigDecimal.ZERO;

        for(BigDecimal num : nums){

            result = result.add(num);

        }

        return result;

    }

    public static BigDecimal add(String... nums){

        BigDecimal result = BigDecimal.ZERO;

        for(String num : nums){

            result = result.add(new BigDecimal(num));

        }
        return result;

    }

    public static BigDecimal mul(BigDecimal... nums){

        BigDecimal result = BigDecimal.ZERO;

        for(BigDecimal num : nums){

            result = result.multiply(num);

        }
        return result;

    }

    public static BigDecimal div(BigDecimal a ,BigDecimal b){

        return a.divide(b,14,BigDecimal.ROUND_HALF_UP);

    }




}
