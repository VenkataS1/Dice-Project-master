public class DiceRunner{
	public static void main(String[]args){

//Test 1
		Die die1 = new Die();
		Die die2 = new Die();
		int rollNum = 0;
		boolean check = false;

		do{
			die1.roll();
			die2.roll();
			rollNum++;

			System.out.println("Roll Number: "+rollNum);
			System.out.println(die1.toString());
			System.out.println(die2.toString());

			if(die1.getValue() == die2.getValue() && die1.getValue() == 1)
				check = true;

			if(check)
				System.out.println("Snake eyes has taken place after "+rollNum+" rolls");
			else
				System.out.println("Snake eyes has not taken place, reroll!");

			System.out.println();
	}
		while(check == false);
		System.out.println("\n\n");

		DiceHolder cup = new DiceHolder();

		for(int x=0; x<5; x++){
		while(checkDice == 1){
			int rand = (int)(Math.random()*12)+3;
			cup.addDie(new Die());
	}
}
}

}
