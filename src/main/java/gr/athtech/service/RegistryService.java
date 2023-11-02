package gr.athtech.service;

public interface RegistryService {

    int patientRegister(String firstName, String lastName, String email);

    boolean changeEmail(int patientId, String email);

    String getPatientEmail(int patientId);

}
