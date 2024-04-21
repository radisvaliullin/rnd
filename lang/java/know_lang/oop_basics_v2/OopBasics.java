package lang.java.know_lang.oop_basics_v2;

class OopBasics {
     public static void main(String[] args) {

          // create instance
          ACMEBicycle acmebike = new ACMEBicycle();

          // set
          acmebike.changeCadence(50);
          acmebike.speedUp(10);
          acmebike.changeGear(2);
          acmebike.printStates();

     }
}
