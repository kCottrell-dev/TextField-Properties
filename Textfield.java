import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;


   public class Textfield extends Application {
    @Override
    
   
    public void start (Stage primaryStage) {
        
    
        
        //Create Textfield
       TextField Demo = new TextField("TextField");
       TextField Column = new TextField();
       
  
       Demo.setAlignment(Pos.CENTER_LEFT);
       Column.setAlignment(Pos.CENTER_RIGHT);
        
       
       Demo.setPrefColumnCount(12);
       Column.setPrefColumnCount(3);
       
       HBox hBox1 = new HBox(5);
       hBox1.setAlignment(Pos.CENTER);
       hBox1.getChildren().addAll(new Label("Text Field"), Demo);
       
       
       
       //Create buttons and add them to the Textfield
       RadioButton ButtonL = new RadioButton("Left");
       RadioButton ButtonC = new RadioButton("Center");
       RadioButton ButtonR = new RadioButton("Right");
       ButtonL.setStyle("-fx-color: cyan; -fx-border-color: cyan; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-family: 'Arial' ");
       ButtonC.setStyle("-fx-color: cyan; -fx-border-color: cyan; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-family: 'Arial' ");
       ButtonR.setStyle("-fx-color: cyan; -fx-border-color: cyan; -fx-text-fill: white; -fx-font-weight: bold; -fx-font-family: 'Arial' ");
       HBox hBox2 = new HBox(5);
       hBox2.setAlignment(Pos.CENTER);
       hBox2.getChildren().addAll(ButtonL, ButtonC, ButtonR);
       
       ToggleGroup group = new ToggleGroup();
       ButtonL.setToggleGroup(group);
       ButtonC.setToggleGroup(group);
       ButtonR.setToggleGroup(group);
       
       HBox hBox3 = new HBox(5);
       hBox3.getChildren().addAll(new Label("Column Size"), Column);
       
       HBox hBox4 = new HBox(5);
       hBox4.setAlignment(Pos.CENTER);
       hBox4.getChildren().addAll(hBox2, hBox3);
       
       
       VBox vBox = new VBox(45);
       vBox.getChildren().addAll(hBox1, hBox4);
       
     
       // Create a scene and place it in the stage
       Scene scene = new Scene(vBox);
       vBox.setStyle("-fx-background-color: gray; -fx-text-fill: white;");
       primaryStage.setTitle("Textfield");
       primaryStage.setScene(scene);
       primaryStage.show();
       
       
      ButtonL.setOnAction(e -> Demo.setAlignment(Pos.BASELINE_LEFT));
      ButtonC.setOnAction(e -> Demo.setAlignment(Pos.BASELINE_CENTER));
      ButtonR.setOnAction(e -> Demo.setAlignment(Pos.BASELINE_RIGHT));
      
      Column.setOnAction(e->
                Demo.setPrefColumnCount(Integer.parseInt(Column.getText())));
        Label lblColumnSize = new Label("Column Size", Column);
        lblColumnSize.setContentDisplay(ContentDisplay.RIGHT);
        
       
    
       
    }
       
       
         public static void main(String[] args) {
        Application.launch(args);
    }
         
   }
    

  

