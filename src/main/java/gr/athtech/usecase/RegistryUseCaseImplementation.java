package gr.athtech.usecase;

import gr.athtech.model.Patient;
import gr.athtech.repository.MemoryPatientRepositoryImplementation;
import gr.athtech.repository.PatientRepositoryInterface;
import gr.athtech.service.RegistryService;
import gr.athtech.service.RegistryServiceImplementation;

public class RegistryUseCaseImplementation implements  RegistryUsecase{


    @Override
    public void RegistryDemo() {
        String firstName = "Efthymis";
        String lastName = "Kan";
        String email = "kan@gma.com";

        String newEmail = "ff@gmail";

        RegistryService service = new RegistryServiceImplementation();

        int index = service.patientRegister(firstName, lastName, email);
        boolean updateResponse = service.changeEmail(index, newEmail);
        String  emailFromRepo = service.getPatientEmail(index);


        System.out.println("Index of the inserted patient "+ index);
        System.out.println("The result of update operation is " + updateResponse);
        System.out.println("The email of the patient is " +emailFromRepo   );
    }
}
