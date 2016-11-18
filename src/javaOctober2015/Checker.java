package CodeWhiz.javaOctober2015;

import java.util.Comparator;

public class Checker {

	public Comparator<Player> desc = new Comparator<Player>() {
		
		@Override
		public int compare(Player p1, Player p2) {
			// TODO Auto-generated method stub
			if(p1.score == p2.score)
				return p2.name.compareTo(p1.name);
			else
				 return p1.score > p2.score ? -1 : 1;
		}
	};
	
}
class Player
{
	String name;
	int score;

}