  Button button1, button2;
  boolean click1, click2;
  int ball_count = 5;
  GumballMachine gumballMachine;
  
void setup() 
{
  size(800, 800) ;
  background(255) ;
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  
  // load font
  PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  textFont(font, 32);

  // Only draw once
  //noLoop();
 
 gumballMachine = new GumballMachine(ball_count);
 //initialize buttons
 
}

void draw() {
  fill(0);  
  text("The Gumball Machine", 250, 60);
  PImage image = loadImage("gumball.jpg");
  image(image, (width-image.width)/2, (height-image.height)/2);  
    //button.update(mouseX, mouseY);
  //runTest();
  //button = new Button();
  //clicked = button.display();
  
  System.out.println(gumballMachine);
  button1 = new Button("Insert Quarter");
  button2 = new Button("Turn Crank");
  click1 = button1.display();
  click2 = button2.display();
}

public void runTest() {
  GumballMachine gumballMachine = new GumballMachine(5);
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
}

void mousePressed() {
  if(click1){
    System.out.println("Insert Quarter");
    //GumballMachine gumballMachine = new GumballMachine(ball_count);
    System.out.println(gumballMachine);
    gumballMachine.insertQuarter();
    noLoop();
  }
  else if(click2){
    System.out.println("Turned Crank");
    //GumballMachine gumballMachine = new GumballMachine(ball_count);
    System.out.println(gumballMachine);
    gumballMachine.turnCrank();
    ball_count = gumballMachine.getCount();
    noLoop();
  }
}

void mouseReleased(){
  loop();
}