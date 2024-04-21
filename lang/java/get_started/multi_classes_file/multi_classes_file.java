package multi_classes_file;

public class multi_classes_file {
    public static void main(String[] args) {
 
        System.out.println(GenerateMessage.generateMessage());
        System.out.println(AnotherMessage.generateAnotherMessage());
    }
}
 
class GenerateMessage {
    static String generateMessage() {
        return "message one";
    }
}
 
class AnotherMessage {
    static String generateAnotherMessage() {
        return "message two";
    }
}
