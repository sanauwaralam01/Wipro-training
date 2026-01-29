import java.util.HashSet;
import java.util.Set;
class Patient{
    int patientId ;
    String name ;

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
    }
    @Override
    public int hashCode(){
        return patientId;
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj)
            return true;
        if(obj==null || getClass()!=obj.getClass())
            return false;
        Patient other = (Patient)obj;
        return this.patientId==other.patientId;
    }
    @Override
    public String toString(){
        return "Patient ID: " + patientId+ ",Name: " +name ;
    }
}

public class Hospital_Patient_Registration {
    public static void main(String[] args) {
        Set<Patient>patients=new HashSet<>();
        addPatient(patients,new Patient(101,"Sanauwar"));
        addPatient(patients,new Patient(102,"Shahid"));
        addPatient(patients,new Patient(101,"Sanauwar"));
        addPatient(patients,new Patient(103,"Aman"));
        System.out.println("List of Unique patients:");
        for(Patient p:patients){
            System.out.println(p);
        }
    }
    static void addPatient(Set<Patient>patients,Patient patient){
        if(patients.add(patient)){
            System.out.println("Patint added to the System: "+patient.patientId);
        }else{
            System.out.println("Already registered Patient ID: "+patient.patientId);
        }
    }
    
}
