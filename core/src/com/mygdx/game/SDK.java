package com.mygdx.game;

public class SDK
{
    //传入接口参数
    public static void init(testListener a)
    {
        boolean state = true;
        if(state==true) {
            a.onSuccess("成功消息");
        }
        else {
            a.onFailed();
        }
    }
}
