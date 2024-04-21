package lang.java.know_lang.oop_basics_v2;

class oop_basics {
     public static void main(String[] args) {

          // create instance
          acme_bicycle acmebike = new acme_bicycle();

          // set
          acmebike.changeCadence(50);
          acmebike.speedUp(10);
          acmebike.changeGear(2);
          acmebike.printStates();

     }
}
