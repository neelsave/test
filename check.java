class check
{
 public static void main(String args[])
 {
  Animal a = new Animal();
  Animal b = new Cat();
  Animal c = new Dog();

  a.makeSound();
  b.makeSound();
  c.makeSound();
 }
}


class Animal
{
  void makeSound()
  {
   System.out.println("hello world!");
  }
}

class Cat extends Animal
{
  void makeSound()
  {
   System.out.println("meow");
  }
}

class Dog extends Animal
{
  void makeSound()
 {
  System.out.println("boo-boo");
 }
}
