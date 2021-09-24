import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
public class EvParser
{
	public void parse()
	{
	
	}
	public void parse_line()
	{
		String test = "show a at center";
		String[] sliced_code = test.split(" ");
		String cmd = sliced_code[0];
		if(cmd.equls("show"))
		{
			SpriteBatch batch = new SpriteBatch();
			Texture img = new Texture("badlogic.jpg");
			//对应到gdx的显示图片api
			SpriteBatch batch;
			batch.begin();
			batch.draw(img, 0, 0);
			batch.end();
		}
		
	}
	
	
}