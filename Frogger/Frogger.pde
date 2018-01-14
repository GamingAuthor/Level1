int dist;
int x;
int y;
car bmw = new car();
car chevy = new car();
car acura = new car();
car lexus = new car();
void setup(){
  size(500,500);
  x = 250;
  y = 480;
}

void draw(){
  background(255,0,255);
  fill(0,255,0);
  ellipse(x,y,20,20);
  stop();
  bmw.display();
  chevy.display();
  acura.display();
  lexus.display();

}

void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      y-=10;//Frog Y position goes up
      }
      else if(keyCode == DOWN)
      {
      y+=10;  //Frog Y position goes down 
      }
      else if(keyCode == RIGHT)
      {
       x+=10;//Frog X position goes right
      }
      else if(keyCode == LEFT)
      {
       x-=10; //Frog X position goes left
      }
   }
}
void stop(){
 if(x<=0){
   x+=10;
 }
 if(x>=490){
   x-=10;
 }
 if(y<=0){
   y+=10;
 }
 if(y>=490){
   y-=10;
 }
}


class car{
  int carx=400;
  int carx2=-100;
  int cary=50;
  int siz=100;
  int sped=10;
  void display() 
  {
    fill(0,255,0);
    rect(carx, cary, siz, 50);
    fill(255,0,0);
    rect(carx, cary+100, siz, 50);
    fill(0,0,255);
    rect(carx, cary+200, siz, 50);
    fill(0,255, 255);
    rect(carx, cary+300, siz, 50);
  }
  void moveright(){
     carx+=25;
    if(carx<=-100){
      carx=600;
  }
  if(carx>=600){
    carx=-100;
  }}
  
  void getX(){
  }
  void getY(){
  }
  void getSize(){
  }
}