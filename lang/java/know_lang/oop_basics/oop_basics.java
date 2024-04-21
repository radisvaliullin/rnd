package lang.java.know_lang.oop_basics;

class oop_basics {
     public static void main(String[] args) {

          // Create two different
          // Bicycle objects
          bicycle bike1 = new bicycle();
          bicycle bike2 = new bicycle();

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
          mountain_bike mbike1 = new mountain_bike();
          mbike1.changeCadence(50);
          mbike1.speedUp(10);
          mbike1.changeGear(2);
          mbike1.printStates();
     }
}
