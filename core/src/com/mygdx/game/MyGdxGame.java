package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Audio;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.easyAvg.Editor;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Music bgm;
	Stage stage;
	@Override
	public void create () {
		batch = new SpriteBatch();
		//Skin skin = new Skin(Gdx.files.internal("metalui/metal-ui.json"));
		img = new Texture("010.jpg");
		stage =  new Stage(new ScreenViewport());
		BitmapFont font = new BitmapFont(Gdx.files.internal("c64.fnt"));
		Label.LabelStyle style = new Label.LabelStyle(font,Color.BLACK);
		Label label = new Label("hello world", style);
		label.setColor(Color.GREEN);
		stage.addActor(label);
		//textButton.setWidth(20f);
		//stage.addActor(textButton);
		//Editor editor = new Editor();
		//Actor actor =
		//actor.setName("aaaa");
		//stage.addActor(actor);
		//editor.create_project_view();
		//bgm = Gdx.audio.newMusic(Gdx.files.internal("bgm.mp3"));
		//bgm.play();

	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		//batch.begin();
		stage.act();
		stage.draw();
		//batch.draw(img, 0, 0);
		//batch.end();
	}
	
	@Override
	public void dispose () {
		//batch.dispose();
		//img.dispose();
	/*	if (stage != null) {
			stage.dispose();
		}
	}*/
	}
}
