package gr.athtech.repository;

import gr.athtech.model.Patient;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MemoryPatientRepositoryImplementation
        implements PatientRepositoryInterface{

    private final ArrayList<Patient> patients =
            new ArrayList<>();
    private int counter;
    @Override
    public int createPatient(Patient patient) {
        counter ++;
        patient.setId(counter);
        patients.add(patient);
        return counter;
    }

    @Override
    public Patient readPatient(int id) {

        for(Patient patient:patients)
            if (patient.getId()==id) return patient;
        return null;
    }

    @Override
    public boolean updatePatient(int id, String email) {
        Patient patient = readPatient(id);
        if (patient==null)
        return false;
        patient.setEmail(email);
        return true;
    }

    @Override
    public boolean deletePatient(int id) {
        Patient patient = readPatient(id);
        if (patient == null)
            return false;
        patients.remove(patient);
        return true;
    }
}
