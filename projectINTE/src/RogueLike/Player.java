package RogueLike;

import java.awt.Graphics;

public class Player extends Creature{

	public Player(float x, float y) {
		super(x, y);
		
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Asserts.player, (int) x, (int) y,  null,); 
	}
	

}
