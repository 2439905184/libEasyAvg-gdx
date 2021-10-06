package com.easyAvg;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextArea;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.Tree;
import com.badlogic.gdx.scenes.scene2d.ui.Window;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Align;
import com.mygdx.game.MyGdxGame;

public class Editor
{
    Texture up;
    BitmapFont font;
    Stage stage;
    //所有按钮的像素样式
    TextButton.TextButtonStyle pixel_buttonStyle;
    public Editor(Stage p_stage)
    {
        stage = p_stage;
        pixel_buttonStyle = new TextButton.TextButtonStyle(null,null,null,MyGdxGame.pixel_font);
        pixel_buttonStyle.overFontColor = Color.WHITE;
        pixel_buttonStyle.downFontColor = Color.BLUE;
    }
    //启动的工程管理界面
    public void create_project_view(Stage stage, BitmapFont p_font)
    {
        font = p_font;
        Label.LabelStyle style = new Label.LabelStyle(font,font.getColor());
        Label title = new Label("Projet Manager",style);
        title.setX(Gdx.graphics.getWidth()/2);
        title.setY(500);
        this.stage.addActor(title);
        Texture texture_up = new Texture("white.png");
        TextureRegion reg = new TextureRegion(texture_up);
        reg.setRegion(0,0,100,50);
        TextureRegionDrawable drawable = new TextureRegionDrawable(reg);
        Drawable up = drawable.tint(Color.BROWN);
        Drawable down = drawable.tint(Color.GRAY);
        TextButton.TextButtonStyle btn_style = new TextButton.TextButtonStyle(up,down,null,font);
        TextButton btn_edit = new TextButton("edit",btn_style);

        btn_edit.addListener(new projectBtnListener(this.stage));
        btn_edit.setX(700);
        btn_edit.setY(300);
        this.stage.addActor(btn_edit);
       // stage.addActor(new ColorRect());
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
        create_menu_bar();
    }
    //顶部菜单栏
    private void create_menu_bar()
    {
        TextButton file = new TextButton("File",pixel_buttonStyle);
        TextButton run = new TextButton("Run",pixel_buttonStyle);
        TextButton build = new TextButton("Build",pixel_buttonStyle);
        TextButton about = new TextButton("About",pixel_buttonStyle);
        file.setY(500);
        run.setPosition(50,500);
        build.setPosition(100,500);
        about.setPosition(200,500);
        file.addListener(new ClickListener()
        {
            @Override
            public void clicked(InputEvent event, float x, float y)
            {
                Pixmap pixel = new Pixmap(200,200, Pixmap.Format.RGBA8888);
                Texture texture = new Texture(pixel);
                TextureRegionDrawable background = new TextureRegionDrawable(texture);
                Window.WindowStyle style = new Window.WindowStyle(MyGdxGame.chinese_font,Color.BROWN,background);
                Window window = new Window("打开文件",style);
                window.setPosition(400,300, Align.center);
                stage.addActor(window);
              //  dialog.setModal(true);
//                new TextureRegionDrawable(new Texture(""));
                TextField.TextFieldStyle tfs = new TextField.TextFieldStyle(MyGdxGame.chinese_font,Color.WHITE,Resource.cursor,null,background);

                TextField tf = new TextField("test",tfs);
                window.add(tf);
                window.setColor(Color.BLUE);
            }
        });
        about.addListener(new ClickListener()
        {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Gdx.net.openURI("https://gitee.com/h128/libEasyAvg-gdx");
            }
        });
        stage.addActor(file);
        stage.addActor(run);
        stage.addActor(build);
        stage.addActor(about);

    }
    class projectBtnListener extends ClickListener
    {
        Stage stage;
        public projectBtnListener(Stage p_stage)
        {
            stage = p_stage;
        }
        public void clicked (InputEvent event, float x, float y)
        {
            System.out.println("切换到主编辑器界面");
            stage.clear();
            create_main_view(stage, MyGdxGame.chinese_font);
        }
    }
}
