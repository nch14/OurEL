package musicplayer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;
/*需要javazoom.*包的支持，调用MusicPlayer.playMusic(传入地址) PS：默认目录是与src同目录
 * 例如调用src目录下的boom.mp3，就传入src/boom.mp3
 * */

public class MusicPlayer implements Runnable {
	private String filename;
	private Player player;
	public MusicPlayer(String filename) {
		this.filename = filename;
	}

	public void play() {
		try {
			BufferedInputStream buffer = new BufferedInputStream(
					new FileInputStream(filename));
			player = new Player(buffer);
			player.play();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void playMusic(String path) {
		MusicPlayer mp3 = new MusicPlayer(path);
		mp3.play();
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		playMusic(filename);
	}
}
