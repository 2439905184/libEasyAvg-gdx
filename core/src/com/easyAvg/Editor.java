package com.easyAvg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Tree;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

public class Editor
{
    //启动的工程管理界面
    public void create_project_view(Stage stage, BitmapFont font)
    {
        Label.LabelStyle style = new Label.LabelStyle(font,font.getColor());
        Label title = new Label("Projet Manager",style);
        title.setX(Gdx.graphics.getWidth()/2);
        title.setY(500);
        stage.addActor(title);
        TextButton.TextButtonStyle btn_style = new TextButton.TextButtonStyle(null,null,null,font);
        TextButton btn_edit = new TextButton("edit",btn_style);
        btn_edit.setX(700);
        btn_edit.setY(300);
        stage.addActor(btn_edit);
    }
    public void create_main_view(Stage stage,BitmapFont font)
    {
        System.out.println("created main view!");
        stage.clear();
        Tree tree;
        //创建事件表UI
        Label.LabelStyle style = new Label.LabelStyle(font,font.getColor());
        Label title = new Label("EventTable",style);
        title.setY(50);
        stage.addActor(title);
        TextButton.TextButtonStyle btn_style = new TextButton.TextButtonStyle(null,null,null,font);
        TextButton btn_add_event = new TextButton("add Event",btn_style);
        TextButton btn_group = new TextButton("按钮组",btn_style);
        Texture t = new Texture("badlogic.jpg");
        btn_group.setBackground("badlogic.jpg");
        btn_group.setX(200);
        stage.addActor(btn_add_event);
        stage.addActor(btn_group);
    }
}
