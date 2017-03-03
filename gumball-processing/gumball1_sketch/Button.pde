public class Button{
    
int rectX, rectY;      // Position of square button
int rectSize = 120;     // Diameter of rect
color rectColor, baseColor;
color rectHighlight;
color currentColor;
boolean rectOver = false;
String label = "Button";

  public Button(){
  rectColor = color(255);
  rectHighlight = color(167);
  baseColor = color(102);
  currentColor = baseColor;
  rectX = width/2-3*rectSize-10;
  rectY = height/2-3*rectSize/2;
  }
  
   public Button(String l){
  rectColor = color(255);
  rectHighlight = color(167);
  baseColor = color(102);
  currentColor = baseColor;
  if(l.equals("Insert Quarter")){
    label = "Insert Quarter";
    rectX = width/2-3*rectSize-10;
    rectY = height/2-3*rectSize/2;
  }
  else if(l.equals("Turn Crank")){
    label = "Turn Crank";
    rectX = width/2+2*rectSize-10;
    rectY = height/2-3*rectSize/2;
  }
  }
  
  boolean display() {
     update(mouseX, mouseY);
  if (rectOver) {
    fill(rectHighlight);
  } else {
    fill(rectColor);
  }
  rect(rectX, rectY, rectSize, rectSize);
  fill(50);
  text(label, rectX, rectY + rectSize/4, rectSize, rectSize );
return rectOver;
  }
  
void update(int x, int y) {
   if ( overRect(rectX, rectY, rectSize, rectSize) ) {
    rectOver = true;
  } 
  //System.out.println("X: " + x + ":" + "Y: " + y);
}
/*
void mousePressed() {
  System.out.println("pressed");
  noLoop();
  if (rectOver) {
    currentColor = rectColor;
  }
}

void mouseReleased() {
  System.out.println("Clicked");
}
*/
boolean overRect(int x, int y, int width, int height)  {
  if (mouseX >= x && mouseX <= x+width && 
      mouseY >= y && mouseY <= y+height) {
    return true;
  } else {
    return false;
  }
}
  
}