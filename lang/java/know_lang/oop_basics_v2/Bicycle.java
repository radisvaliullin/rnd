package lang.java.know_lang.oop_basics_v2;

interface Bicycle {

     // wheel revolutions per minute
     void changeCadence(int newValue);

     void changeGear(int newValue);

     void speedUp(int increment);

     void applyBrakes(int decrement);
}
