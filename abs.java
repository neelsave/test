class abs
{
 public static void main(String args[])
 {
   Chitti c = new Chitti();
   c.makeSound();
 }
}


abstract class robot
{
 int legs = 0;
 abstract void makeSound();
}

class Chitti extends robot
{
 public void  makeSound()
 {
  System.out.println("hello my name is chiiti the robot");
 }
}




