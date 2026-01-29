import java.util.*;
class patient{
    int id;
    String name;

    public patient(int Id, String name) {
        this.id = Id;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Patient Id: "+id+"Name: "+name;
    }
}


public class HospitalRecord {
    TreeMap<Integer, patient> patient = new TreeMap<>();
    public void addPatient(int id , String name){
        patient.put(id,new patient(id,name)); //to add 
        System.out.println("Patient added Successfullly");


    }
    // for update 
    public void Updatepatient(int id , String name){
        if(patient.containsKey(id)){
            patient.put(id, new patient(id,name));
            System.out.println("Patient updated"+ patient);
        }else{
            System.out.println("Patient not found");
        }
    }//get details
    public void getpatient(int id){
        patient Patient =patient.get(id);
        if(patient !=null){
            System.out.println(patient);
        }else{
            System.out.println("Patient record not");
        }
    }//remove details
    public void removepatient(int id){
        if(patient.remove(id) !=null){
            System.out.println("patient remove successfully");     
        }else{
            System.out.println("patient not found");
        }
    }
    //lsitall
    public void listAll(){
        if(patient.isEmpty()){
            System.out.println("No Record");
        }for(patient p : patient.values()){
            System.out.println(p);
            
        }
    }
    //clear details
    public void cleardetails(){
        patient.clear();
        System.out.println("Details cleared ");
    }
    public static void main(String[]args){
        HospitalRecord HR = new HospitalRecord();
        HR.addPatient(101,"Aman");
        HR.addPatient(102,"Sohan");
        HR.addPatient(103,"Rohan");
        HR.listAll();
        HR.getpatient(102);
        HR.Updatepatient(103,"Rohan singh");
        HR.removepatient(101);
        HR.cleardetails();

    }
}
