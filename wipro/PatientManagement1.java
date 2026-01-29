import java.util.LinkedList;

class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name.trim();
    }

    public String toString() {
        return "ID:" + id + " Name:" + name;
    }
}

public class PatientManagement1 {
    public static void main(String[] args) {
    LinkedList<Patient> patients = new LinkedList<>();
    int idCounter = 1;
    patients.add(new Patient(idCounter++,"Krishna"));
    patients.add(new Patient(idCounter++,"Krishna"));
    patients.add(new Patient(idCounter++,"Deva"));
    patients.addFirst(new Patient(idCounter++,"Emergency-suresh"));
    patients.addLast(new Patient(idCounter++, "Pooja "));
    System.out.println("Patient List: " + patients);
    System.out.println("First Patient: "+patients.getFirst());
    System.out.println("Last Patient: "+patients.getLast());
    System.out.println("Is Pooja present? " +patients.contains("Pooja"));
    System.out.println("Postion of Deva: " +patients.indexOf("Deva"));
    System.out.println("Treated Patient: " + patients.removeFirst()); patients.remove("Pooja");
    System.out.println("Total Remaining Patients: " + patients.size());
    System.out.println("Updated Patient List:");
    for (Patient patient : patients) {
        System.out.println(patient);
    }
    }
   
}