package com.mygdx.game;

public class SDK
{
    //传入接口参数
    public static void init(testListener a)
    {
        System.out.println(a);
        a.onSuccess();
        a.onFailed();
    }
}
