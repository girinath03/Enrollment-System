// package ProjectCollegeEnroll;

import java.util.*;

public class EnrollCourse {


    public String Student_Name;
    public String Student_Email;
    public String Student_address;
    public String Student_Mobile_No;
    public String Student_Gender;

    LinkedHashMap<String,Integer> seats = new LinkedHashMap<String,Integer>();


    public EnrollCourse(String Student_Name,String Student_Email,String Student_address,String Student_Mobile_No,String Gender){

        this.Student_address = Student_address;
        this.Student_Email = Student_Email;
        this.Student_Mobile_No = Student_Mobile_No;
        this.Student_Name = Student_Name;
        this.Student_Gender = Gender;
    }

    public void SeatsChecker(){
        System.out.println("The Available ");
        for(Map.Entry<String,Integer> map : seats.entrySet()){
            System.out.println(map);
        }
    }
    public void courseSeats(){
        seats.put("CSE",120);
        seats.put("ECE",120);
        seats.put("IT",60);
        seats.put("MECH",60);
        seats.put("EEE",60);
    }
    public boolean seatsAvailable(String dept) {
        int value = seats.get(dept);
        if (value == 0) {
            System.out.println("Sorry..! Seats were filled");
            return false;
        }
        return true;
    }
}
