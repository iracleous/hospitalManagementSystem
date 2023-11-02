package gr.athtech.service;

import gr.athtech.model.Patient;
import gr.athtech.repository.MemoryPatientRepositoryImplementation;
import gr.athtech.repository.PatientRepositoryInterface;

public class RegistryServiceImplementation implements RegistryService{

    private PatientRepositoryInterface repository = new MemoryPatientRepositoryImplementation();

    @Override
    public int patientRegister(String firstName, String lastName, String email) {
        if (email.startsWith("administrator"))
                return -1;

        Patient patient = new Patient();
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setEmail(email);

        return repository.createPatient(patient);
    }

    @Override
    public boolean changeEmail(int patientId, String email) {
        if (email.startsWith("administrator"))
            return false;
        return repository.updatePatient(patientId, email);
    }

    @Override
    public String getPatientEmail(int patientId) {
        Patient patient = repository.readPatient(patientId);
        if (patient ==null) return null;
        return patient.getEmail();
    }
}
