 class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;

    
    String name;
    int age;
    String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Hospital: " + hospitalName);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 30, "Flu", 101);
        Patient p2 = new Patient("Bob", 45, "Injury", 102);

        p1.displayDetails();
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}
