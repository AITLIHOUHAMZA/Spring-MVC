package ma.parite3une.partie3une;

import ma.parite3une.partie3une.repository.Patient;
import ma.parite3une.partie3une.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Partie3UneApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(Partie3UneApplication.class, args);

    }


    @Override
    public void run(String... args) throws Exception {
       patientRepository.save(new Patient(null, "wissal", new Date(), false, 14));
       patientRepository.save(new Patient(null, "said", new Date(), false, 30));
       patientRepository.save(new Patient(null, "ismail", new Date(), true, 100));

    }
}
