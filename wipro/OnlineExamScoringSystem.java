import java.util.*;

public class OnlineExamScoringSystem {
    public static void main(String[] args) {
        Map<String, Integer> score = new HashMap<>();
        score.put("English", 80);
        score.put("Math", 75);
        score.put("Computer", 80);
        score.put("Urdu", 90);
        int total =0;
        for(Integer scores:score.values()){
            total+=scores;
        }
        double average =total/score.size();
        System.out.println("Students Scores: ");
        for (String score_result : score.keySet()) {
        System.out.println(score_result + ": "+ score.get(score_result));
    }
    System.out.println("Average Score "+average);

    }
}
