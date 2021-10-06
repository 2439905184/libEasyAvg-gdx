package com.easyAvg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

//所有编辑器的资源
public class Resource
{
    //编辑框鼠标样式
    public static TextureRegionDrawable cursor;
    public static TextureRegionDrawable cursor_selection;
    public static TextureRegionDrawable run;
    public static Texture build;
    public static TextureRegionDrawable textfield_bg;
    public Resource()
    {
        //这样创建有bug？
        cursor = createCursor();
        cursor_selection = create_selection();
        textfield_bg = create_textfield_bg();
       // run = new TextureRegionDrawable(new Texture("run.png"));
        //build = new Texture("build.png");
    }

    private TextureRegionDrawable create_textfield_bg()
    {
        Pixmap pixmap = new Pixmap(100, 100, Pixmap.Format.RGBA8888);
        pixmap.setColor(Color.ORANGE);
        pixmap.fill();
        Texture texture = new Texture(pixmap);
        //pixmap.dispose();
        return new TextureRegionDrawable(texture);
    }

    private TextureRegionDrawable create_selection()
    {
        Pixmap pixmap = new Pixmap(10, 10, Pixmap.Format.RGBA8888);
        pixmap.setColor(0, 1, 0, 1);
        pixmap.fill();
        Texture texture = new Texture(pixmap);
        //pixmap.dispose();
        return new TextureRegionDrawable(texture);
    }

    private TextureRegionDrawable createCursor()
    {
        Pixmap pixmap = new Pixmap(1, 100, Pixmap.Format.RGBA8888);
        pixmap.setColor(1, 0, 0, 1);
        pixmap.fill();
        Texture texture = new Texture(pixmap);
        //pixmap.dispose();
        return new TextureRegionDrawable(texture);
    }
}
