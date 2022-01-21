package de.nordakademie.guessmynumber.payoff;



import de.nordakademie.guessmynumber.GuessMyNumber;
import de.nordakademie.guessmynumber.IPayOffRule;

import java.util.List;

public class PayPerGuess implements IPayOffRule {

	private final static int CRITICAL_NUMBER_OF_GUESSES = (int) Math.ceil((Math.log(GuessMyNumber.UPPER_LIMIT - GuessMyNumber.LOWER_LIMIT + 1) / Math.log(2))); // floor(ld(UPPER-LOWER+1));


	/*
	Jeder Rateversuch reduziert den Gewinn um eine Einheit
	 */

	@Override
	public int computePayOff(List<Integer> resultList) {
		return CRITICAL_NUMBER_OF_GUESSES - resultList.size();
	}

}
