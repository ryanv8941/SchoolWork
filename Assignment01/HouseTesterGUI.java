package Assignment01;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HouseTesterGUI extends Application
{	
    // Declare all the GUI components as instance variables. 
    // Don't create the objects at this point.
    // Declare a pane and scene objects like: 
    private GridPane pane; // Change this to other kind of panes
    private Scene scene;
	
    //----------------------------------------------------------
    // create GUI components
    private void createGUIComponents()
    {
	  //First create the pane
        pane = new GridPane();
	  // Create GUI components and add them to pane
    	
    }
    //----------------------------------------------------------
    //Attach handlers
    public void attachHandlers()
    {
	    // Attach handlers to buttons
    }
    //----------------------------------------------------------
    public void start(Stage primaryStage)
    {
	    createGUIComponents();
	    attachHandlers();
		
	    //Create a scene and place it on stage
	    scene = new Scene(pane);
	    primaryStage.setTitle("HandleEvent");
	    primaryStage.setScene(scene);
	    primaryStage.show();
    }
    //----------------------------------------------------------
    public static void main(String[] args)
    {
		Application.launch(args);
    }
}

// other supporting classes if necessary


