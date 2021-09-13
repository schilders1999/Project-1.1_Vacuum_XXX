/**
 * public class ScanningVacuum extends the Movement class. This vacuum type cleans until its surrounding tiles have been cleaned.
 * This class holds all of the methods for the scanning abilities. 
 * 
 * @author Spencer Childers
 *
 */
public class ScanningVacuum extends Movement{
	
	/** boolean object which turns true once the surrounding tiles of the robot becomes "CU".
	* Once floorClean == true, the vacuum stops cleaning.
	*/
	boolean floorClean = false;

	// Preferred constructor of the Vacuum.
	public ScanningVacuum() 
	{
		scan();
	}
	
	//Method for the robot to scan its surrounding area.
	public void scan()
	{
		while (floorClean == false)
		{
			// If the upper tile exists and is dirty, move up.
			if (xPosition > 0 && floorTiles[xPosition - 1][yPosition].equalsIgnoreCase("DU")) 
			{ 
				moveUp();
			}
			
			// If the lower tile exists and is dirty, move down.
			else if (xPosition < 3 && floorTiles[xPosition + 1][yPosition].equalsIgnoreCase("DU"))
			{
				moveDown();
			}
			
			// If the left tile exists and is dirty, move left.
			else if (yPosition > 0 && floorTiles[xPosition][yPosition - 1].equalsIgnoreCase("DU"))
			{
				moveLeft();
			}
			
			// If the right tile exists and is dirty, move right.
			else if (yPosition < 3 && floorTiles[xPosition][yPosition + 1].equalsIgnoreCase("DU"))
			{
				moveRight();
			}
			
			// If the upper left tile is dirty, move up and to the left.
			else if (xPosition > 0 && yPosition > 0 && floorTiles[xPosition - 1][yPosition - 1].equalsIgnoreCase("DU"))
			{
				moveUp();
				moveLeft();
			}
			
			// If the upper right tile is dirty, move up and to the right.
			else if (xPosition > 0 && yPosition  < 3 && floorTiles[xPosition - 1][yPosition + 1].equalsIgnoreCase("DU"))
			{
				moveUp();
				moveRight();
			}
			
			// If the lower left tile is dirty, move down and to the left.
			else if (xPosition < 3 && yPosition > 0 && floorTiles[xPosition + 1][yPosition - 1].equalsIgnoreCase("DU"))
			{
				moveDown();
				moveLeft();
			}
			
			// If the lower right tile is dirty, move down and to the right.
			else if (xPosition < 3 && yPosition  < 3 && floorTiles[xPosition + 1][yPosition + 1].equalsIgnoreCase("DU"))
			{
				moveDown();
				moveRight();
			}
			
			// Else the surrounding tiles are cleaned, terminating the process.
			else
			{
				System.out.println("Powering off vacuum.");
				floorClean = true;
			}
		}
	}
}


