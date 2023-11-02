package gr.athtech.repository;

import gr.athtech.model.Patient;

public interface PatientRepositoryInterface {
    //CRUD
    // create read update delete

    int createPatient(Patient patient);
    Patient readPatient(int id);
    boolean updatePatient(int id, String email);

    boolean deletePatient(int id);

}
