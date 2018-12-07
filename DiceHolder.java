import java.util.ArrayList;
public class DiceHolder{
	private ArrayList<Die> container;

	String dice;

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
			for(int x=0; x<container.size(); x++){
				(container.get(x)).roll();
	}//for
}//shake

		public String toString(String dice){
			for(int x=0; x<container.size(); x++){
				dice+= "Dice # "+ (x+1) +"value is"+ (container.get(x)).getValue();
}//for

			return dice;
	}//public toString
}//class