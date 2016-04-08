import java.util.Calendar;
import java.util.Random;

public class RandomPlayer extends Player {

	@Override
	Roshambo generateRoshambo() {
		Calendar calender = Calendar.getInstance();
		long seed = calender.getTimeInMillis();
		Random random = new Random(seed);
		int number = random.nextInt(11);
		
		if(number < 3){
			return Roshambo.ROCK;
		}
		else if ((number > 3) && (number <= 6 )){
			return Roshambo.PAPER;
		}
		else{
			return Roshambo.SCISSORS;
		}
		
		// TODO Auto-generated method stub
	}

}
