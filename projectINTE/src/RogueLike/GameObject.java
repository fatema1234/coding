package RogueLike;
import java.util.*;


public abstract class GameObject {
	int xPosition;
	int yPosition;
	int health;
} Player;

int mapSetUp();

Player*playerSetUp();

int handleInPut(int input, Player*user);

	
	public int main(String[] args){
		Player * user;
		
		user = PlayerSetUp();
			
		new Terrian();
		
	new	mapSetUp();
	
	new handleInPut();
		
		}
}	
	
