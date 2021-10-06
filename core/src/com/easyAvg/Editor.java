package com.easyAvg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextArea;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Tree;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

public class Editor
{
    Texture up;
    //启动的工程管理界面
    public void create_project_view(Stage stage, BitmapFont font, SpriteBatch spriteBatch)
    {
        Label.LabelStyle style = new Label.LabelStyle(font,font.getColor());
        Label title = new Label("Projet Manager",style);
        title.setX(Gdx.graphics.getWidth()/2);
        title.setY(500);
        stage.addActor(title);
        Texture texture_up = new Texture("white.png");
        TextureRegion reg = new TextureRegion(texture_up);
        reg.setRegion(0,0,100,50);
        TextureRegionDrawable drawable = new TextureRegionDrawable(reg);
        Drawable up = drawable.tint(Color.BROWN);
        Drawable down = drawable.tint(Color.GRAY);
        TextButton.TextButtonStyle btn_style = new TextButton.TextButtonStyle(up,down,null,font);
        TextButton btn_edit = new TextButton("edit",btn_style);
        btn_edit.setX(700);
        btn_edit.setY(300);
        stage.addActor(btn_edit);

        spriteBatch.begin();

        spriteBatch.end();
       // stage.addActor(new ColorRect());
    }
    public void create_main_view(Stage stage,BitmapFont font)
    {
        System.out.println("created main view!");
        stage.clear();
        Tree tree;
        //创建事件表UI
        Skin skin = new Skin();
        Label.LabelStyle style = new Label.LabelStyle(font,font.getColor());
        Label title = new Label("EventTable",style);
        title.setY(50);
        stage.addActor(title);
        up = new Texture("white.png");
        TextureRegion reg = new TextureRegion(up);
        reg.setRegion(0,0,100,50);
        TextureRegionDrawable up_drawable = new TextureRegionDrawable(reg);
        up_drawable.tint(Color.BLUE);

        TextButton.TextButtonStyle btn_style = new TextButton.TextButtonStyle(up_drawable,null,null,font);
        TextButton btn_add_event = new TextButton("add Event",btn_style);
        TextButton btn_group = new TextButton("按钮组",btn_style);
        btn_style.downFontColor = Color.BLUE;
        btn_style.overFontColor = Color.BROWN;

        btn_group.setX(200);
       // btn_add_event.setColor(Color.BLUE);
        stage.addActor(btn_add_event);
        stage.addActor(btn_group);
    }


}
