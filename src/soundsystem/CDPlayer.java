
package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sun.media.jfxmedia.MediaPlayer;


@Component
public class CDPlayer implements MediaPlayer
{
	private CompactDisc cd;

	@Autowired
	public CDPlayer(CompactDisc cd)
	{
		this.cd = cd;
	}

	public void play()
	{
		cd.play();
	}
}