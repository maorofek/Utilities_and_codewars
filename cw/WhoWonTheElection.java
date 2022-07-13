import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhoWonTheElection {

    public static void main(String[] args) {
        //System.out.println(getWinner(Arrays.asList("A", "A", "A", "B", "B", "B", "A")));
        System.out.println(getWinner(Arrays.asList("A", "A", "A", "B", "C", "B")));
    }

    public static String getWinner(final List<String> listOfBallots) {
        Map<String, Integer> candidates = new HashMap<String, Integer>();
        for (String ballot : listOfBallots) {
            if (candidates.containsKey(ballot)) {
                candidates.put(ballot, candidates.get(ballot) + 1);
            } else {
                candidates.put(ballot, 1);
            }
        }
        int maxVotes = 0;
        int tieVote = 0;
        String winner = null;
        for (String candidate : candidates.keySet()) {
            if (candidates.get(candidate) >= maxVotes) {
                if (candidates.get(candidate) == maxVotes) {
                    tieVote = candidates.get(candidate);
                }
                maxVotes = candidates.get(candidate);
                winner = candidate;
            }
        }
        if (maxVotes > tieVote && maxVotes > 2 / listOfBallots.size()) {
            return winner;
        } else {
            return null;
        }
    }
}