import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class QuizApp extends Application
{
    @Override
    public void start(final Stage primaryStage)
    {
        primaryStage.setTitle("Quiz App");
        
        final Label currentQuestion;
        final Label answer;
        final Label timer;
        final Label currentScore;
        
        final TextField answerField;
        
        final Button startButton;
        final Button submitButton;
        
        
        
        primaryStage.show();
    }
    
    public static void main(final String[] args)
    {
        Application.launch(args);
    }
}
