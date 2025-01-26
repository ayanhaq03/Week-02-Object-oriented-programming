package hospital_patient_management;


// Subclasses: InPatient
class InPatient extends Patient {
    private double dailyRate;
    private int daysAdmitted;

    public InPatient(int patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }
}