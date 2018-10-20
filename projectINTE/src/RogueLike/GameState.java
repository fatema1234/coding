package RogueLike;

public class GameState extends State {
	
	private Player player;
	
	
	public GameState() {
		
		player = new Player(100, 100);
	}
	@Override
	public void tick() {
		player.tick();
		
		
	}

	@Override
	public void render(Graphic g) {
		
		player.render(g);
		g.drawImage(Assets.dirt, 0, 0, null);
		
		
		
	}

}
