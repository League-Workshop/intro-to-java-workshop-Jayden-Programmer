int circlePosition=100; 
int circlePosition2=300;
void setup() {

  size(1000, 1000);
  background(#4B4D4D); 
  fill(#15F007);
  rect(200, 200, 500, 500);

  fill(#FF0000);
  rect(300, 300, 100, 100);
  fill(#340AF7);
  rect(500, 300, 100, 100);


  fill(#010A01);
  rect(250, 500, 400, 100);
}


void draw(){
    background(#4B4D4D); 

    ellipse(circlePosition, 50, 100, 100);
    circlePosition=circlePosition +1; 
    
     
  fill(#15F007);
  rect(200, 200, 500, 500);

  fill(#FF0000);
  rect(300, 300, 100, 100);
  fill(#340AF7);
  rect(500, 300, 100, 100);


  fill(#010A01);
  rect(250, 500, 400, 100);
   ellipse(100, circlePosition2, 100, 100); 
    circlePosition2=circlePosition2 +3; 
  
   
  

}
