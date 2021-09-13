/**
 * public class Movement includes all of the methods for the robot's movement. Robot can move in any direction.
 * 
 *  @author Spencer Childers
 *  
 */
public class Movement extends Floor{

	
	// Various methods for movement.

	
		// Method for moving the robot up a tile.
		public void moveUp()
		{
			// Making the position the robot moves from clean and unoccupied.
			floorTiles[xPosition][yPosition] = "CU";
			
			/** if there is a tile for the robot to move to, it will move in the proposed direction.
			 * else the robot stays in its current position.
			 */
			if (xPosition > 0)
			{
				System.out.println("The robot moves up.");
				System.out.println();
				
				// Changing the position of the robot in the tile grid.
				xPosition = xPosition - 1;
				yPosition = yPosition;
				
				// Setting the current new position of the robot to clean and occupied
				floorTiles[xPosition][yPosition] = "CO";
			}
			else
			{
				System.out.println("The robot tries to move up, but bumps into the wall.");
				System.out.println();
				
				// Setting the current new position of the robot to clean and occupied
				floorTiles[xPosition][yPosition] = "CO";
			}
			
			// Prints out the state of the tiles.
			displayFloor();
		}
		
		// Method for moving the robot down a tile.
		public void moveDown()
		{
			floorTiles[xPosition][yPosition] = "CU";
			
			if (xPosition < 3)
			{
				System.out.println("The robot moves down.");
				System.out.println();
				
				xPosition = xPosition + 1;
				yPosition = yPosition;
				
				floorTiles[xPosition][yPosition] = "CO";
			}
			else
			{
				System.out.println("The robot tries to move down, but bumps into the wall.");
				System.out.println();
				
				floorTiles[xPosition][yPosition] = "CO";
			}
			
			displayFloor();
		}
		
		// Method for moving the robot a tile to the Left
		public void moveLeft()
		{
			floorTiles[xPosition][yPosition] = "CU";
			
			if (yPosition > 0)
			{
				System.out.println("The robot moves to the left.");
				System.out.println();
				
				xPosition = xPosition;
				yPosition = yPosition - 1;
				
				floorTiles[xPosition][yPosition] = "CO";
			}
			else
			{
				System.out.println("The robot tries to move to the left, but bumps into the wall.");
				System.out.println();
				
				floorTiles[xPosition][yPosition] = "CO";
			}
			
			displayFloor();
		}
		
		// Method for moving the robot a tile to the right.
		public void moveRight()
		{
			floorTiles[xPosition][yPosition] = "CU";
			
			if (yPosition < 3)
			{
				System.out.println("The robot moves to the right.");
				System.out.println();
				
				xPosition = xPosition;
				yPosition = yPosition + 1;
				
				floorTiles[xPosition][yPosition] = "CO";
			}
			else
			{
				System.out.println("The robot tries to move to the right, but bumps into the wall.");
				System.out.println();
				
				floorTiles[xPosition][yPosition] = "CO";
			}
			
			displayFloor();
		}
	
	
	
}
