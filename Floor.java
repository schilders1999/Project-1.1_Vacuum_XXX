/**
 *  public Floor class. This class is used to generate a random 4x4 grid of clean and dirty tiles.
 * 
 * @author Spencer Childers
 *
 */
public class Floor {
	// Initializing two dimensional array to hold strings. Used for the tiles.
	String [][] floorTiles = new String[4][4];
	
	// Choosing a random x and y location for the robot to be.
	int xPosition = (int)(Math.random()*4);
	int yPosition = (int)(Math.random()*4);

	// Preferred constructor for the floor. Calls on generateFloor() and displayFloor() methods.
	public Floor()
	{
		generateFloor();
		displayFloor();
	}
	
	
	/**
	 * Method for generating a 4x4 grid floor with some tiles being dirty and others clean. 
	 * Also places the vacuum robot at a random location.
	 */
	public void generateFloor() 
	{
		//Integer value for determining floor's state. If floorType == 1, floor is clean. If floorType == 0, floor is dirty.
		int floorType; 
		
		//Outer for loop for filling in the double array.
		for (int i = 0 ; i < 4 ; i++)
		{
			//Inner for loop for filling in the double array.
			for (int j = 0 ; j < 4 ; j++)
			{
				//Creating a random integer, either 0 or 1 for each position in the double array.
				floorType = (int)(Math.random()*2);
				
				//Converting integers into different cleanliness states.
				if (floorType == 0)
				{
					floorTiles[i][j] = "DU"; //Dirty Unoccupied
				}
				else if (floorType == 1)
				{
					floorTiles[i][j] = "CU"; //Clean Unoccupied
				}
				
			}
		}
		//Assigning the random x and y position from earlier to the floorTiles array, and declaring this position to be "Clean Occupied."
		floorTiles[xPosition][yPosition] = "CO"; 
	}
	
	
	/** 
	 * Method for displaying the 4x4 floor.
	 */
	public void displayFloor()
	{
		//For loop used to display the 4x4 grid.
		for (int i = 0 ; i < 4 ; i++)
		{
			for (int j = 0 ; j < 4 ; j++)
			{
				System.out.print(floorTiles[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
