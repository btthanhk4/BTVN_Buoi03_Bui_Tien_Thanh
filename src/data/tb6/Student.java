package data.tb6;

public class Student {
    public void showFullName1(String pFullName) {
        System.out.println("Full Name: " + pFullName);
    }


    public void showInfo(int age, String pAddress, String country) {
        System.out.println("Age: " + age);
        System.out.println("Adress: " + pAddress);
        System.out.println("Country: " + country);
    }

    public void showDetail(String firstName, String secondName) {
        System.out.println("First Name: " + firstName);
        System.out.println("Second Name: " + secondName);
    }

    public void showFullName2(String firstName, String secondName) {
        System.out.println("Full Name: " + firstName + " " + secondName);
    }


}
