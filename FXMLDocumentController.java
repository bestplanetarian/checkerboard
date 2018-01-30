/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1chessboard;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Administrator
 */
public class FXMLDocumentController implements Initializable{
    private Stage stage;
    Checkerboard chess;
    private int numRows= 8;
    private int numCols= 8;
    
    private Color lightColor = Color.RED;
    private Color darkcolor = Color.BLACK;
    
    
    @FXML
    private VBox vbox;
    
    @FXML
    private AnchorPane anchorPane;
    
    
     public void start(Stage stage) {
        this.stage = stage; 
        ChangeListener<Number> listener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
       if(lightColor == Color.RED && darkcolor == Color.BLACK){
            vbox.getChildren().remove(anchorPane);
            chess = new Checkerboard(numRows, numCols, vbox.getWidth(), vbox.getHeight()-33);
            anchorPane = chess.build();
            vbox.getChildren().add(anchorPane);
       }
        else{
            vbox.getChildren().remove(anchorPane);
            chess = new Checkerboard(numRows, numCols, vbox.getWidth(), vbox.getHeight()-33, lightColor, darkcolor);
        
            anchorPane = chess.build();
            vbox.getChildren().add(anchorPane);
         }
        };

       this.vbox.widthProperty().addListener(listener);
       this.vbox.heightProperty().addListener(listener);   
       chess = new Checkerboard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
       anchorPane = chess.build();
       vbox.getChildren().add(anchorPane);
 }
    
    @FXML
    private void handlesixteensixteen(ActionEvent event){
       vbox.getChildren().remove(anchorPane);
       numRows = 16;
       numCols = 16;
       chess = new Checkerboard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
       anchorPane = chess.build();
       vbox.getChildren().add(anchorPane);
       
    }
    
    
    @FXML
    private void handletenten(ActionEvent event){
       vbox.getChildren().remove(anchorPane);
       numRows = 10;
       numCols = 10;
       chess = new Checkerboard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
       anchorPane = chess.build();
       vbox.getChildren().add(anchorPane);
        
        
        
    }
    
    @FXML
    private void handleeighteight(ActionEvent event){
       vbox.getChildren().remove(anchorPane);
       numRows = 8;
       numCols = 8;
       chess = new Checkerboard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
       anchorPane = chess.build();
       vbox.getChildren().add(anchorPane);
    }
    
    @FXML
    private void handlethreethree(ActionEvent event){
       vbox.getChildren().remove(anchorPane);
       numRows = 3;
       numCols = 3;
       chess = new Checkerboard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
       anchorPane = chess.build();
       vbox.getChildren().add(anchorPane); 
    }
    
    @FXML
    private void handledefaultcolor(ActionEvent event){
       vbox.getChildren().remove(anchorPane);
       lightColor = Color.RED;
       darkcolor = Color.BLACK;
       chess = new Checkerboard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight(), lightColor, darkcolor);
       anchorPane = chess.build();
       vbox.getChildren().add(anchorPane); 
    }
    
    @FXML
    private void handleBluecolor(ActionEvent event){
       vbox.getChildren().remove(anchorPane);
       lightColor = Color.SKYBLUE;
       darkcolor = Color.DEEPSKYBLUE;
       chess = new Checkerboard(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight(), lightColor, darkcolor);
       anchorPane = chess.build();
       vbox.getChildren().add(anchorPane); 
    }
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
