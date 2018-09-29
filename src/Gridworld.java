import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
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
	bug2.turn();
	bug2.turn();
	world.add(location,bug2);
	world.add(loc, bug);
	Flower flower = new Flower();
	flower.getColor();
	flower.setColor(Color.GREEN);
	
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			Location everywhere = new Location(i,j);	
			world.add(everywhere, flower);	
		}
	}
	

}
}
