public class Main {

    public static void main(String[] args){

        String patientName = "Stacy Mason";
        boolean hasInsurance = false;
        double temp = 102.2;
        int numVisits = 5;
        double coPay = 35.26;
        String nextAppointment = "Tuesday 3/10";
        String contact = "(304)039-9384";/*
            Not a real phone number*/

        System.out.println("Patient Details:");
        System.out.println("Name: " + patientName);
        System.out.println("Patient has insurance: " + hasInsurance);
        System.out.println("Body temperature: " + temp);
        System.out.println("Number of visits: " + numVisits);
        System.out.println("Copay amount: $" + coPay);
        System.out.println("Next appointment: " + nextAppointment);
        System.out.println("Contact number on file: " + contact);
    }
}
