import java.util.ArrayList;
public class DiceHolder{
	private ArrayList<Die> container;

		public DiceHolder(){
			container.add(new Die());
}//public DiceHolder

		public int addDie(Die die){
			if(container.size() < 6){
				container.add(die);
				return 1;
}//if

			else{
				return -1;
	}//else
}//public addDDie

		public void shake(){
	}//shake
}//class