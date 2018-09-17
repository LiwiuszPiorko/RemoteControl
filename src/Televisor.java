public class Televisor {

    String status="OFF";//Jeśli tu nie dodam tego "OFF" to oddaje mi null przy pierwszym "showStatus"


    void turnOn() {

        status="ON";

        System.out.println(status);
    }

    void turnOff() {

        status="OFF";

        System.out.println(status);


    }

    void showStatus() {


        System.out.println("Tv is" +" "+ status);
    }


}








