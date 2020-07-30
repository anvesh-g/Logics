package src.com.set_1.go.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Why do we need to ovverride equals and hashcode method



*/
public class EqualsAndHashCode {
    public static void main(String[] args) {
        Doctor d1=new Doctor(1,"Abhishek","Cardio");
        Doctor d2=new Doctor(1,"Abhishek","Cardio");
        Doctor d3=new Doctor(2,"Sri Vishnu Varthini","Psychologist");

        Patient p1=new Patient(1,"Anvesh");
        Patient p2=new Patient(2,"Tom");


        Map<Doctor, List<Patient>> map=new HashMap<>();

        List<Patient> l1=new ArrayList<>();
        l1.add(p1);
        l1.add(p2);

        map.put(d1,l1);

        List<Patient> l2=new ArrayList<>();
        l2.add(p1);
        map.put(d2,l2);

        List<Patient> l3=new ArrayList<>();
        l3.add(p1);
        map.put(d3,l3);



        System.out.println(map.size());



    }


    public static class Doctor{
        private int id;
        private String name;
        private String specialisation;

        @Override
        public int hashCode() {
            return this.id;
        }

        @Override
        public boolean equals(Object obj) {
            Doctor d=(Doctor) obj;
            if(d.id==this.id){
                return true;
            }else{
                return false;
            }
        }



        public Doctor(int id, String name, String specialisation) {
            this.id = id;
            this.name = name;
            this.specialisation = specialisation;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSpecialisation() {
            return specialisation;
        }

        public void setSpecialisation(String specialisation) {
            this.specialisation = specialisation;
        }
    }


    private static class Patient{
        private int patientId;
        private String patientName;

        public Patient(int patientId, String patientName) {
            this.patientId = patientId;
            this.patientName = patientName;
        }

        public int getPatientId() {
            return patientId;
        }

        public void setPatientId(int patientId) {
            this.patientId = patientId;
        }

        public String getPatientName() {
            return patientName;
        }

        public void setPatientName(String patientName) {
            this.patientName = patientName;
        }
    }

}



