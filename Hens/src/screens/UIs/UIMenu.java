package screens.UIs;

import screens.SCreateChar;
import screens.SMenu;
import inits.Anar;
import inits.Personnage;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent;

public class UIMenu extends Stage {
	
	private String verifs;
	Skin skin;
	private Personnage me1,me;
	Table table;
	 TextButton createButton,LoadButton,ExitButton;
	private SMenu smenu; 
	 
	 
public UIMenu(SMenu menu){
		this.smenu=menu;
	
}
	
public void loadUI(){
	skin = new Skin();
	Pixmap pixmap = new Pixmap(1, 1, Format.RGBA8888);
	pixmap.setColor(Color.WHITE);
	pixmap.fill();
	skin.add("white", new Texture(pixmap));
	skin.add("default", new BitmapFont());
	TextButtonStyle textButtonStyle = new TextButtonStyle();
	textButtonStyle.up = skin.newDrawable("white", Color.DARK_GRAY);
	textButtonStyle.down = skin.newDrawable("white", Color.GRAY);
	textButtonStyle.over = skin.newDrawable("white", Color.LIGHT_GRAY);
	textButtonStyle.font = skin.getFont("default");
	skin.add("default", textButtonStyle);
	table = new Table();
	table.setFillParent(true);
	this.addActor(table);
	createBt();
}




public void createBt(){ //bouton sulimo creation perso
	 createButton = new TextButton("Cr�ez votre personnage", skin);

	table.add(createButton);

	
	createButton.addListener(new ChangeListener() {
		public void changed (ChangeEvent event, Actor actor) {
			smenu.getHens().setScreen(new SCreateChar(smenu.getHens()));
			
		}	
	});
}

	
}
