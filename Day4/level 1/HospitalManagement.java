import java.util.ArrayList;
import java.util.List;


class Hospital {
    private String name; 
    private List<Doctor> doctors; 
    private List<Patient> patients; // List of patients admitted to the hospital
    //constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Adds a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // Adds a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}


class Doctor {
    private String name; 
    private String specialty; 
    private List<Patient> patients; // List of patients the doctor consults
    //constructor
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }


    public void consult(Patient patient) {
        patients.add(patient); // Add patient to the doctor's list
        patient.addDoctor(this); // Add doctor to the patient's list
        System.out.println("Dr. " + name + " (" + specialty + ") is consulting with " + patient.getName() + ".");
    }
}


class Patient {
    private String name; 
    private List<Doctor> doctors; // List of doctors the patient is consulting with

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Returns the patient's name
    public String getName() {
        return name;
    }

    // Adds a doctor to the patient's list of doctors
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
}


public class HospitalManagement {
    public static void main(String[] args) {
        // Create a hospital instance
        Hospital hospital = new Hospital("City Hospital");

        // Create a doctor instance
        Doctor doctor1 = new Doctor("John Smith", "Cardiologist");

        // Create a patient instance
        Patient patient1 = new Patient("Alice Johnson");

        // Add the doctor and patient to the hospital
        hospital.addDoctor(doctor1);
        hospital.addPatient(patient1);

        // Establish a consultation between the doctor and the patient
        doctor1.consult(patient1);
    }
}
