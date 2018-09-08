import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
public static void main(String[] args) {
	World world = new World();
	world.show();
	
	Bug bug = new Bug();
	bug.getColor();
	bug.turn();
	bug.setColor(Color.BLUE);
	Bug bug2 = new Bug();
	bug2.getColor();
	bug2.setColor(Color.BLUE);
	Random rand = new Random();
	int colum = rand.nextInt(10); 
	Random randy = new Random();
	int row = randy.nextInt(10);
	Location location = new Location(colum,row);
	Location loc = new Location(3,3);
	world.add(location,bug2);
	world.add(loc, bug);
}
}
