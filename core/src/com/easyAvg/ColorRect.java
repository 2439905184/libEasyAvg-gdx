package com.easyAvg;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ColorRect extends Actor {
    /*Texture：图片的容器

    TextureRegion：用于截取Texture

    SpriteBatch：相当于画笔

    Sprite：其实就是加强版的TextureRegion和SpriteBatch。他可以进一步对图像的位置、颜色、旋转角进行控制
*/
    public ColorRect()
    {
        //创建像素图
        Pixmap pixmap = new Pixmap(20,20, Pixmap.Format.RGBA8888);
        pixmap.setColor(Color.BROWN);
        pixmap.fill();
    }

}
