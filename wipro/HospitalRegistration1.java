import java.util.HashSet;



public class HospitalRegistration1 {
    public static void main(String[] args) {
        HashSet<Integer>patientId = new HashSet<>();
        registerPatient(patientId,101);
        registerPatient(patientId, 102);
        registerPatient(patientId, 103);
        registerPatient(patientId, 101); 
        registerPatient(patientId, 104);
        System.out.println("\n Unique Registered Patient IDs: " + patientId);

    }
    public static void registerPatient(HashSet<Integer> set, int id) {
        if (set.contains(id)) {
            System.out.println("Patient ID " + id + " is already registered.");
        } else {
            set.add(id);
            System.out.println("Patient ID " + id + " added to the system.");
        }
    
    }
}
