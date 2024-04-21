package lang.java.know_lang.oop_basics;

class OopBasics {
     public static void main(String[] args) {

          // Create two different
          // Bicycle objects
          Bicycle bike1 = new Bicycle();
          Bicycle bike2 = new Bicycle();

          // Invoke methods on
          // those objects
          bike1.changeCadence(50);
          bike1.speedUp(10);
          bike1.changeGear(2);
          bike1.printStates();

          bike2.changeCadence(50);
          bike2.speedUp(10);
          bike2.changeGear(2);
          bike2.changeCadence(40);
          bike2.speedUp(10);
          bike2.changeGear(3);
          bike2.printStates();

          // Child
          MountainBike mbike1 = new MountainBike();
          mbike1.changeCadence(50);
          mbike1.speedUp(10);
          mbike1.changeGear(2);
          mbike1.printStates();
     }
}
