
public class CalculateScore {
	public int calculateHighScorePosition(int playerScore)
	{
		int position= 0 ;
		if(playerScore >=1000)
			position = 1;
		else if(playerScore>=500 && playerScore <=1000)
			position = 2;
		else if(playerScore>=100 && playerScore <500)
			position = 3;
		else
			position = 4;
		return position;
	}
}
