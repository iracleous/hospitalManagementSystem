package gr.athtech;


import gr.athtech.usecase.RegistryUseCaseImplementation;
import gr.athtech.usecase.RegistryUsecase;

public class Main {
    public static void main(String[] args) {

        RegistryUsecase registryUsecase = new RegistryUseCaseImplementation();
        registryUsecase.RegistryDemo();

    }
}