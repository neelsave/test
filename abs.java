class abs
{
 public static void main(String args[])
 {
   Chitti c = new Chitti();
   c.makeSound();
   c.walk();
 }
}


interface robot
{
 public void makeSound();
 public void walk();
}

class Chitti implements robot
{
 public void  makeSound()
 {
  System.out.println("hello my name is chiiti the robot");
 }
 public void walk()
 {
  System.out.println("walking");
 }
}




