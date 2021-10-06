package com.easyAvg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

//所有编辑器的资源
public class Resource
{
    //编辑框鼠标样式
    public static TextureRegionDrawable cursor;
    public static TextureRegionDrawable run;
    public static Texture build;
    public Resource()
    {
        cursor = new TextureRegionDrawable(new Texture("cursor/cursor.png"));
       // run = new TextureRegionDrawable(new Texture("run.png"));
        //build = new Texture("build.png");
    }
}
