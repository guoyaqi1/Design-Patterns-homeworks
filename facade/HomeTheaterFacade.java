package facade;

public class HomeTheaterFacade {
	//���������ϵͳ����
	private TheaterLight theaterLight;
	private Popcorn popcorn;
	private Projector projector;
	private DVDPlayer dVDPlayer;
	private Screen screen;
	private Stereo stereo;
	
	
	
	/**
	 ������
	 */
	public HomeTheaterFacade() {
		super();
		this.theaterLight = theaterLight.getInstance();
		this.popcorn = popcorn.getInstance();
		this.projector = projector.getInstance();
		this.dVDPlayer = dVDPlayer.getInstance();
		this.screen = screen.getInstance();
		this.stereo = stereo.getInstance();
	}

	//�����ֳ��Ĳ�
	public void ready() {
		popcorn.on();
		popcorn.pop();
		screen.down();
		projector.on();
		stereo.on();
		dVDPlayer.on();
		theaterLight.dim();
	}

	public void play() {
		dVDPlayer.play();
		
	}
	public void pause() {
		dVDPlayer.pause();
	}
	public void end() {
		popcorn.off();
	
		screen.up();
		projector.off();
		stereo.off();
		dVDPlayer.off();
		theaterLight.dim();
	}

	public static void main() {
		//ͳһ����
		
	}

}
