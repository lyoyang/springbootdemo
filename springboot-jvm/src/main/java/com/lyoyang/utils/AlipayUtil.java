package com.lyoyang.utils;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Comparator;

public class AlipayUtil {

    private static String gateWay = "https://openapi.alipaydev.com/gateway.do";
    private static String appId = "2016110100783369";
    private static String privateKey = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCs4LzitPZEbylT3pwgtLxCJ4H3mZlvh/mGq+k5Qyp4UXRd1B4wg4tnAUO4zfSpyMC647qXay952JF49NEgwoTmpGBDQ8Z1iKJd9/sgyQ0pXEluhaaRtBZaFuo9xzBZi3TDJp1+tRRyn+3EP0xNBhTyl8PCTGf+S4OOydYalu4FI0MdulMUX13t9V1RmQfRuzz+DxiJRaiwtE76sByKZWc+VKmBOmjlRoramMtpG/2UqCfEBCtOaqjhhfDU+SFZAOnxEJjyS1OjZjbCjPV/YINn4ih8qsSjRyD7dfYBY+3n5eJLwK3CKjOjVdSPhOqe7IZtewLoqYDEBXAeWMa8O3KLAgMBAAECggEAau225yK3EC0Riuat+yzPJLv7D4LZ/LpGBJ5gayK4KiN3rnF9GtTCbLvDf5MkOcAKNY6V4wJRIzRpBj+m+nRWb7JMOE67egdBJo4zrlus4GBMqyfPl1+kU6TIzd1ecoRnfC1uTOkD9MIm9rOQJjQU0Ng+JPfNeuSKQs9ktp2UK2hXG6+3pxSYIR571dzifUho6/LkiK1orC/dCVqlX9PxfjFG3XkI4VEa0cuc3Q9nz6pRY/sOarP5s1/f7OX67yp94szhLAumx+mCQ/tseXo5EeTr6/2Tl5jYxF3txs5tHU3kKTqnY5mS+HD0V/SKKduyuN/XqAbdNpvUlYZEFNNGwQKBgQDjW9QLxChameZ2Z5NlzSifWqoQuMwj2gHcplGiIMGWBrULi9zdsBA7s6rfg+WmAVuRR2AkxfcEo2xCsAD+C1Qdh4xYZBoBtJ3cBtbTNhXYHQk7IwmLcyu8D98QzZOLmeNyTZODloFgDxbYXt0knyxNvp6MukTi47+IjYAF4VS09wKBgQDCp/Ao9OSdcBtzcRC+50BGTpfNlt2/fFvKvLN3Q71FwqUxcWZlTP713BBv6F5GZ0e7IHVtnTOZ47RpTUzD1T6TcHioRfb/qKem/QBzS1IhY53HTPBlQwZsxNi2lx2b4Ju3CKRlJFPbGCMEA+/bOpK4x82nsdALx4+MAnR0fs1ODQKBgEBN8KODT4aQkMZcdSwN4rdvhTpFijd5qZ0mzV/1s8sjCoHBhS6OZYj9QA8H1yQkrilg7qh39W2yayRRc3Zm7duMQv2dEl35H8zjgk8qtPLzA3Feb4ypfm0qcATooBqT4+ioWFiXcPAiVGvOKO36tyUmDOHwrRsfH0UYAGWpXbPxAoGAStkoj5cbES66X3lqZv2kyWQPGw6X1bmL0jkdCQ8TCG//9TMVnH4uy3sDFwTSu1+bRWkFvlBkNxhHlvYSPnsQxMDKpGnCwCupy5wdQDgGLLCRSsFa7pUHM2u9qPgSeo2zUn4QOJPvap+tVy3sXO/42vR5L7I/vUfO+pc3EFRxvUECgYB4bGtUMXAj/N5MUNgP6yUr1MI5MSYOFBflIWVRJaTLxAjRoCw9olcRpjhA38/ldj8obp5rGRbmONafpd41XlqxCbAp2eRNDUry+KLHATzKIirvqcYXbh0xo/F4dgEMnnNoYhAYkvY4XB3u3fCOYT7GelxV9OcdFhf3X25Imgj72A==";
    private static String publicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlvtpqCHApEcOmney1gmaLsFLoxFMpe9syzqYBfqHfAsb2mG5qN5CakiSWVf3yXmIop5bof+2JFZ/CrEP8vZKKqVU7NQqO1JtsFJRhvVYkiuDcKOkLwM0vlQ70pV99C8VKpJANlheaf6DDLaE8SIX8dvh/kSu2Q7+SLPBvgfyw9/wEK+spSMIsyP2jJIvsp+vBmyYmSHw4JIqnHB1Yc5zYM/FqOXn0v5inK6ySRmY0IShyVYTcK9AxXhESke4wfS+XxRY07ggCJQfOeXwFkFbsIZHRWeW/9Ul19b85UdQGWIucX4GxkjbsVmaodOA3BAHRXr2jUoJncm7J3wEdqeojwIDAQAB";

    //1、获得初始化的AlipayClient
    private static AlipayClient alipayClient = new DefaultAlipayClient(
            gateWay,//支付宝网关
            appId,//appid
            privateKey,//商户私钥
            "json",//json
            "utf-8",//字符编码格式
            publicKey,//支付宝公钥
            "RSA2"//签名方式
    );


    public static AlipayClient getAlipayClient(){
        return alipayClient;
    }

    /**
     * 验签
     * @param c
     * @return
     */
    public static Boolean cheackSign(Object c){
        //格式化字符串
        ArrayList<String> list= (ArrayList<String>) AlipayUtil.getNameParams(c);
        String sign="";
        String context="";
        for (String str:list) {
            //取出sign
            if(str.startsWith("sign=")){
                sign=str;
                continue;
            }
            context=str+"&";
        }
        if(context.endsWith("&"))context.substring(0,context.length()-1);
        Boolean b=false;
        try {
            b= AlipaySignature.rsaCheckContent(context,sign, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlvtpqCHApEcOmney1gmaLsFLoxFMpe9syzqYBfqHfAsb2mG5qN5CakiSWVf3yXmIop5bof+2JFZ/CrEP8vZKKqVU7NQqO1JtsFJRhvVYkiuDcKOkLwM0vlQ70pV99C8VKpJANlheaf6DDLaE8SIX8dvh/kSu2Q7+SLPBvgfyw9/wEK+spSMIsyP2jJIvsp+vBmyYmSHw4JIqnHB1Yc5zYM/FqOXn0v5inK6ySRmY0IShyVYTcK9AxXhESke4wfS+XxRY07ggCJQfOeXwFkFbsIZHRWeW/9Ul19b85UdQGWIucX4GxkjbsVmaodOA3BAHRXr2jUoJncm7J3wEdqeojwIDAQAB","utf-8");
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        return b;
    }
    /**
     * 将一个javabean的非空数据按键值对name=value的形式装进List<String>
     * 并且是对字符串进行排序
     * @param
     * @return
     */
    private static ArrayList<String> getNameParams(Object obj){
        Class c=obj.getClass();
        ArrayList<String> list=new ArrayList<String>();
        Field[]fields=c.getDeclaredFields();
        for (Field field:fields) {
            String name=field.getName();
            field.setAccessible(true);
            try {
                String value=(String)field.get(obj);
                if(value==""||value==null)continue;
                if(name.contains(" "))name.replace(" ","");
                if(value.contains(" "))value.replace(" ","");
                list.add(name+"="+value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((String)o1).compareTo((String)o2);
            }
        });
        return list;
    }



}
