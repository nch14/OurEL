package musicplayer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;
/*��Ҫjavazoom.*����֧�֣�����MusicPlayer.playMusic(�����ַ) PS��Ĭ��Ŀ¼����srcͬĿ¼
 * �������srcĿ¼�µ�boom.mp3���ʹ���src/boom.mp3
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
		// TODO �Զ����ɵķ������
		playMusic(filename);
	}
}
