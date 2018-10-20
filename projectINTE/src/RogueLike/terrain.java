package RogueLike;

public class terrain {
	
	private int xPosition;
	private int yPosition;
	private int health;
	public terrain(int xPosition, int yPosition, int health) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.health = health;
		playerSetUp();
		
	
	public int playerSetUp() {
		 
		 Player* newPlayer;
		 newPlayer= malloc(sizeof(Player));
		 newPlayer xPosition = 14;
		 newPlayer yPosition = 14;
		 
		  newPlayer health = 20;
		  playerMove(14,14, newPlayer);
		 
		 
	 
    
	public int handleInput(input) {
		
		switch (input) {
		//move up
		case"w":
		case"w":
		playerMove(user->yPosition - 1,user->xPosition,user);	
		break;
		//move down
		case "d":
		case"d":
			
		
			playerMove(user->yPosition + 1,user->xPosition,user);
			break;
			//move left
		case"l":
		case"L":
			playerMove(user->yPosition ,user->xPosition -1,user);
		break;
		//move right
		case"R":
		case"r":
			playerMove(user->yPosition,user->xPosition +1,user);
		break;
		default:
			break;
				}
	}
	int playerMove(int y, int x, Player*  user) {
		moveprintw(user->yPosition, user->xPosition, ".");
		user->yPosition = y;
		user->xPosition = x;
		moveprintw(user->yPosition, user->xPosition, ".")
		
	}
	public int movementCost() {	

}