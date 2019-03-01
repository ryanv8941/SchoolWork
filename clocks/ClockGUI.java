package clocks;

import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.TextField; 
import javafx.scene.layout.GridPane; 
import javafx.stage.Stage; 
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.event.ActionEvent; 


public class ClockGUI extends Application { 
	
    //Declare GUI Components
	private GridPane pane;
	
	private Label hours;
	private Label minutes;
	private Label seconds;
	
	private TextField hoursTF;
	private TextField minutesTF;
	private TextField secondsTF;
	
	private Button showButton;
	
    public static void main(String[] args) { 

        launch(args); 

    } 

     

    public void createGUIComponents() { 

       //Instantiate GUI Components and build GUI 
    	pane = new GridPane();
    	
    	hours = new Label ("Hours");
    	minutes = new Label ("Minutes");
    	seconds = new Label ("Seconds");
    	
    	hoursTF = new TextField();
    	minutesTF = new TextField();
    	secondsTF = new TextField();
    	
    	showButton = new Button ("Show Time");
    	
    	pane.add(hours, 0, 0);
    	pane.add(minutes, 0, 1);
    	pane.add(seconds, 0, 2);
    	
    	pane.add(hoursTF, 1, 0);
    	pane.add(minutesTF, 1, 1);
    	pane.add(secondsTF, 1, 2);
    	
    	pane.add(showButton, 1, 4);
    	pane.setAlignment(Pos.CENTER);
    	
    	hoursTF.setEditable(false);
    	minutesTF.setEditable(false);
    	secondsTF.setEditable(false);
         

    } 

    public void attachHandlers() { 

        showButton.setOnAction(new EventHandler<ActionEvent>() 

        { 

            public void handle(ActionEvent e) { 

               Clock ck = new Clock(); 
               hoursTF.setText(""+ck.getHour()); 
               minutesTF.setText(""+ck.getMinute()); 
               secondsTF.setText(""+ck.getSecond()); 

            } 

             

        }); 

    } 

    public void start(Stage stage) { 

        createGUIComponents(); 
        attachHandlers(); 

        Scene scene = new Scene(pane); 
        stage.setScene(scene); 
        stage.setTitle("Clocks View"); 
        stage.setWidth(200); 
        stage.setHeight(150); 
        stage.show(); 

    } 

} 

     