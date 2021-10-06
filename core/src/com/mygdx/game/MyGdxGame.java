package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.g2d.freetype.FreeType;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.easyAvg.Editor;
import com.easyAvg.Resource;

public class MyGdxGame extends ApplicationAdapter {
	//像素纹理
	SpriteBatch batch;
	Texture img;
	Sprite sprite;
	OrthographicCamera cam;
	Stage stage;
	private Texture pixel_texture;
	public static BitmapFont pixel_font;
	public static BitmapFont chinese_font;
	public void preload_resource()
	{
		new Resource();
	}
	@Override
	public void create () {
		batch = new SpriteBatch();
		stage = new Stage();
		pixel_font = create_font("pixel");
		chinese_font = create_font("Chinese");
		Editor editor = new Editor(stage);
		Gdx.input.setInputProcessor(stage);
		editor.create_project_view(stage,pixel_font);
		cam = new OrthographicCamera();
		//cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		//cam.update();
		TextField.TextFieldStyle style = new TextField.TextFieldStyle(pixel_font,Color.BLUE,Resource.cursor,Resource.cursor,null);
		TextField textField = new TextField("aaaa",style);
		textField.setWidth(100);
		textField.setHeight(50);
		//先后设置样式
		Pixmap pixmap = new Pixmap(100, 100, Pixmap.Format.RGBA8888);
		pixmap.setColor(Color.ORANGE);
		pixmap.fill();
		Texture texture = new Texture(pixmap);
		style.background = new TextureRegionDrawable(texture);

		pixmap = new Pixmap(1, 100, Pixmap.Format.RGBA8888);
		pixmap.setColor(1, 0, 0, 1);
		pixmap.fill();
		texture = new Texture(pixmap);
		style.cursor =  new TextureRegionDrawable(texture);

		pixmap = new Pixmap(10, 10, Pixmap.Format.RGBA8888);
		pixmap.setColor(Color.BLACK);
		pixmap.fill();
		texture = new Texture(pixmap);

		style.selection = new TextureRegionDrawable(texture);

		stage.addActor(textField);
		pixmap.dispose();
	}
	public BitmapFont create_font(String type)
	{
		BitmapFont font = null;
		if(type == "pixel") {
			FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("m5x7.ttf"));
			FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
			parameter.size = 35;
			parameter.characters = FreeTypeFontGenerator.DEFAULT_CHARS;
			font = generator.generateFont(parameter);
			generator.dispose();
		}
		if(type == "Chinese")
		{
			FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("pht.otf"));
			FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
			parameter.size = 35;
			parameter.characters = FreeTypeFontGenerator.DEFAULT_CHARS + "按钮组打开文件";
			font = generator.generateFont(parameter);
			generator.dispose();
		}
		return font;
	}

	@Override
	public void render () {
		//Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//batch.setProjectionMatrix(cam.combined);
		batch.begin();
		stage.act();
		stage.draw();
		//batch.draw(pixel_texture,0,0);
		batch.end();

	}
	public void update()
	{
		System.out.println("处理输入");
		}
	@Override
	public void dispose () {
		batch.dispose();
	}
	@Override
	public void resize (int width, int height) {
		cam.setToOrtho(false, width, height);
	}

}
