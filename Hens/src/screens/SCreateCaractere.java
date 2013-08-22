package screens;

import screens.UIs.UICreateCaractere;
import inits.Personnage;
import game.Hens;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

public class SCreateCaractere implements Screen {
	private Hens hens;
	UICreateCaractere stage;
	SpriteBatch batch;
	Personnage me;
	int classe;
 	public SCreateCaractere(Hens hens,int classe){
 		this.classe=classe;
 		this.hens =hens;
		batch = new SpriteBatch();
		stage = new UICreateCaractere(this,classe);	
	Gdx.input.setInputProcessor(stage);
	stage.loadUI();
 	
 	}
	
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.3f, 0.35f, 0.3f, 1);
		batch.begin();
		stage.act(Math.min(Gdx.graphics.getDeltaTime(), 1 / 30f));
		stage.draw();
		BitmapFont test= new BitmapFont();
		test.setColor(Color.BLACK);
		test.draw(batch,"HEY YOU",300,400);
		batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
