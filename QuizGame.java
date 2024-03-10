import java.util.*;

class QuizQuestion {
    String question;
    List<String> options;
    int correctAnswerIndex;

    public QuizQuestion(String question, List<String> options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }
}

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define quiz questions
        List<QuizQuestion> quizQuestions = new ArrayList<>();
        quizQuestions.add(new QuizQuestion("Which country is the largest producer of coffee in the world?", Arrays.asList("A. Brazil", "B. Colombia", "C. Ethiopia", "D. Vietnam"), 0));
        quizQuestions.add(new QuizQuestion("Who was the first woman to win a Nobel Prize?", Arrays.asList("A. Marie Curie", "B. Mother Teresa", "C. Rosa Parks", "D. Margaret Thatcher"), 0));
        quizQuestions.add(new QuizQuestion("In which year did the French Revolution begin?", Arrays.asList("A. 1776", "B. 1789", "C. 1804", "D. 1832"), 1));
        quizQuestions.add(new QuizQuestion("What is the deepest point in the ocean?", Arrays.asList("A. Mariana Trench", "B. Puerto Rico Trench", "C. Tonga Trench", "D. Java Trench"), 0));
       

        // Play the quiz
        int score = 0;
        for (QuizQuestion question : quizQuestions) {
            System.out.println(question.question);
            for (String option : question.options) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            String userAnswer = scanner.next().toUpperCase();
            int userAnswerIndex = userAnswer.charAt(0) - 'A';

            if (userAnswerIndex == question.correctAnswerIndex) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect!");
            }
            System.out.println();
        }

        // Display final score
        System.out.println("Quiz completed!");
        System.out.println("Your final score is: " + score + "/" + quizQuestions.size());

        scanner.close();
    }
}
