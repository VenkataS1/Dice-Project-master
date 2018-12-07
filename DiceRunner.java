public class DiceRunner{
	public static void main(String[]args){

//Test 1
		Die die1 = new Die();
		Die die2 = new Die();
		int numRolls = 0;
		boolean check = false;

		do{
			rollBoth(die1, die2);
			numRolls++;

			System.out.println("Amount of rolls: "+numRolls);
			System.out.println(die1.toString());
			System.out.println(die2.toString());

			if(snakeEyes(die1, die2))
				check = true;

			if(check)
				System.out.println("Snake eyes has taken place after "+numRolls+ "rolls");
			else
				System.out.println("Snake eyes has not taken place, reroll!");

			System.out.println();
	}
		while(check == false);
}
//method to roll both die from Test 1

		public static void rollBoth(Die die1, Die die2){
			die1.roll();
			die2.roll();
}
//method to check if snake eyes has taken place to Test 1

		public static boolean snakeEyes(Die die1, Die die2){
			return die1.getValue() == die2.getValue() && die1.getValue() == 1;
	}
}
