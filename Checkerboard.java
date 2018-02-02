/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




//Shiqi Wang
package assignment1chessboard;

import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

/**
 *
 * @author Administrator
 */
public class Checkerboard  {
  private int numRows;
  private int numCol; 
  
  private double boardWidth;
  private double boardHeight;   
  
  private Color LightColor;
  private Color DarkColor;
  
  private double rectWidth;
  private double rectHeight;
  
  private AnchorPane anchorPane;
  
  
     
    
    
  public Checkerboard (int numRows, int numCol, double boardWidth, double boardHeight){
    this(numRows, numCol, boardWidth, boardHeight, Color.RED, Color.BLACK);
  }  
    
  public Checkerboard (int numRows, int numCol, double boardWidth, double boardHeight, Color LightColor, Color DarkColor){
    this.numRows = numRows;
    this.numCol = numCol;
    this.boardHeight = boardHeight;
    this.boardWidth = boardWidth;
    this.DarkColor = DarkColor;
    this.LightColor = LightColor;
    
  }
   
  
  
  
  public void buildRect(AnchorPane anchorPane, double x, double y, double width, double height, Color color){
      Rectangle r1 = new Rectangle(width, height);
      anchorPane.getChildren().add(r1);
      r1.setFill(color);
      AnchorPane.setTopAnchor(r1,y);
      AnchorPane.setLeftAnchor(r1,x);
     
  }
  
  
  
  
  public AnchorPane build(){
   anchorPane = new AnchorPane();
   anchorPane.setMinWidth(boardWidth);
   anchorPane.setMinHeight(boardHeight);
           
   rectWidth = Math.ceil(boardWidth/numCol);
   rectHeight = Math.ceil(boardHeight/numRows);
   
   Color temp;
   
   if (rectWidth > rectHeight){
       rectWidth = rectHeight;
   }
   
   if (rectHeight > rectWidth) {
       rectHeight = rectWidth;
   }
   
   double checkboardWidth = rectWidth*numCol;
   double xOffset = (boardWidth-checkboardWidth)/2;
   
   
   
   double checkboardHeight = rectHeight*numRows;
   double yOffset = (boardHeight-checkboardHeight)/2;
   
   
   
   
   
   for(int i = 0; i < numRows; i++){
        for(int j = 0; j < numCol; j++){
             
        if (i%2 == 0 ){
            if(j%2 == 0){
                   temp = LightColor;
               }
               else{
                   temp = DarkColor;
               }
           }
        
        else{
           if(j%2 == 0){
                     
                   temp = DarkColor;
                  
               }
               else{
                   temp = LightColor;
                 
               }    
           }
         buildRect(anchorPane, j*rectWidth + xOffset, i*rectHeight + yOffset, rectWidth, rectHeight, temp);
       }
      }
      return anchorPane;
   }
  
  public int getnumRows(){
      return this.numRows;
  }
  
  public int getnumCols(){
      return this.numCol;
  }
  
  public double getWidth(){
      return this.boardWidth;
  }
  
  public double getHeight(){
      return this.boardHeight;
  }
  
  public Color getLightColor(){
      return this.LightColor;
  }
  
  public Color getDarkColor(){
      return this.DarkColor;
  }
  
  public double getrectWidth(){
      return this.rectWidth;
  }
  
  public double getrectHeight(){
      return this.rectHeight;
  }
  
   public AnchorPane getBoard(){
        return this.anchorPane;
    }
  
}


