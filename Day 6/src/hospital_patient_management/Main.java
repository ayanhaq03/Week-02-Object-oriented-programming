package hospital_patient_management;

public class Main {

    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "ayan", 22, 1000, 5);
        Patient p2 = new OutPatient(2, "vivek", 22, 500);

        Patient[] patients = {p1, p2};

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Bill: " + patient.calculateBill());
        }
    }
}
