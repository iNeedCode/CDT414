import java.util.*;
import java.util.regex.Pattern;

import com.sun.tools.javac.code.Attribute.Array;

/**
 * BowlingGame Score calculator
 * 
 * @author 
 * @version 1.0
 * @date 2012-12-11
 */
public class BowlingGame {

	/**
	 * BowlingGame Score calculator constructor which require string as input
	 * 
	 * @param game
	 *            Expected format "[n,n][n,n]..[n,n]"
	 * 
	 */
	List<Integer> scoreList = new ArrayList<Integer>();

	public BowlingGame(String game) {

		// eval
		StringTokenizer st = new StringTokenizer(game, "[,]");
		while (st.hasMoreTokens()) {
			int currentNumber = Integer.parseInt(st.nextToken());
			scoreList.add(currentNumber);
		}
		if (scoreList.size() == 20) {
			scoreList.add(0);
		}

		// print
		// for (int i = 0; i <= scoreList.size() - 1; i++) {
		// System.out.print("Index " + i + ": ");
		// System.out.println(scoreList.get(i));
		// }
	}

	/**
	 * getScore method returns a score of current Bowling game or -1 if error
	 * 
	 * @return Integer value of Bowling score, in case of error return value is
	 *         -1
	 */
	public int getScore() {

		if (scoreList.size() < 10) {
			return (-1);
		}
		int total = 0;
		int next = 2;


		if (scoreList.size() > 21) {
			int j = 0;
			while (scoreList.get(j) == 10) {
				j += 2;
				return 300;
			}
		}

		for (int i = 0; i < scoreList.size(); i++) {
			if (i >= 20) {
				continue;
			}

			if (i % 2 == 0 && scoreList.get(i) == 10) {
				if ((scoreList.get(next) == 10)) {
					while (scoreList.get(next) == 10) {
						total += scoreList.get(i) + scoreList.get(i + 2);
						next += 2;
					}
					// System.out.println(scoreList.get(next));
					total += scoreList.get(next);
				} else {

					total += scoreList.get(i) + scoreList.get(i + 2)
							+ scoreList.get(i + 3);
					// System.out.println(i);
				}
			} else if ((i % 2 == 0 && (scoreList.get(i) + scoreList.get(i + 1)) == 10)) {
				total += 10 + scoreList.get(i + 2);
				i++;
			} else {
				total += scoreList.get(i);
			}
			next = i;
			System.out.print("I" + i + ": " + total + "   ");
		}
		System.out.println("");
		return total;
	}
}
