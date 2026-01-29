class patient{
    private String patientName;
    private int age;
    private String MedicalHistory;
    private String Diagnosis;

public patient(String patientName,int age,String MedicalHistory,String Diagnosis){
    this.patientName=patientName;
    this.age=age;
    this.MedicalHistory=MedicalHistory;
    this.Diagnosis=Diagnosis;

}
public void showdetails(){
    System.out.println("patientName: "+patientName);
    System.out.println("patientage: "+age);
    System.out.println("MEdicalHistory: "+MedicalHistory);
    System.out.println("Diagnosis: "+Diagnosis);

}
}



public class Record{
    public static void main(String[] args) {
        patient patient = new patient("Akram", 25, "sugar", "Take medicine");
        patient.showdetails();
        
    }
}