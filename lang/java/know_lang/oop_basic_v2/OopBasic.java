package lang.java.know_lang.oop_basic_v2;

class OopBasic {
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
