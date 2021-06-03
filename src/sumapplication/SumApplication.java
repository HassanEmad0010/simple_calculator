/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumapplication;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Hassan Emad
 */
public class SumApplication extends Application implements EventHandler<ActionEvent>{
    Button add,sub, exit;
    TextField number1field,number2field , resField; 
    Label num1label ,num2label , addlabel, mylabel;
    Group adding_group;
    GridPane gp;
    Scene thescene;
    @Override
    public void start(Stage thestage) {
       thestage.setTitle("MINI CALCULATOR");
thestage.show();     
//  thestage.setFullScreen(true);

mylabel= new Label("This calculator is made by HASSAN EMAD 15/5/2021");


     num1label = new Label("enter number 1");
       num2label = new Label("enter number 2");
       addlabel = new Label("result : ");
       
       
       number1field = new TextField();
       number2field=new TextField();
       resField= new TextField();
 resField.setEditable(false);
 
       add= new Button(" ADD ");
       add.setOnAction(this);

       sub= new Button("sub");
       sub.setOnAction(this);
       
       exit= new Button("close");
       exit.setOnAction(this);
gp= new GridPane();
           gp.setHgap(15);
           gp.setVgap(15);
           gp.setPadding(new Insets(15));
       gp.add(num1label, 0, 0);
       gp.add(num2label, 0, 1);
       gp.add(addlabel, 0, 2);
       
       gp.add(number1field, 1, 0);
       gp.add(number2field, 1, 1);
       gp.add(resField, 1, 2);
       
       gp.add(add, 0,3);
       gp.add(sub, 1, 3);
       gp.add(exit, 2, 3);
       gp.add(mylabel, 0, 10);

  

       
    adding_group = new Group();
        adding_group.getChildren().add(gp);
        
        thescene = new Scene(adding_group);
        
thestage.setScene(thescene);

       
    }

    
    
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
   if (event.getSource()==add)
   {
       
       int num1= Integer.parseInt(number1field.getText().toString());
       int num2 = Integer.parseInt(number2field.getText());
       resField.setText(num1+num2 + "");
    
   }
   else if (event.getSource()== sub )
   {
       int num1= Integer.parseInt(number1field.getText().toString());
       int num2 = Integer.parseInt(number2field.getText());
       resField.setText(num1-num2 + "");
   
   }
   
   else if (event.getSource()==exit)
   {
      System.exit(0);
   }

           
        
        
        
        
    
    }
    
}
