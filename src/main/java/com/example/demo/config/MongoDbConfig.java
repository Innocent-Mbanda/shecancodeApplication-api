package com.example.demo.config;


import com.example.demo.document.Student;
import com.example.demo.repository.StudentRepository;
import org.apache.catalina.realm.CombinedRealm;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = StudentRepository.class)
@Configuration
public class MongoDbConfig {
    @Bean
  CommandLineRunner commandLineRunner(StudentRepository studentRepository){
      return new CommandLineRunner() {
          @Override
          public void run(String... args) throws Exception {
              studentRepository.save( new Student("1", "John Doe", "johndoe@gmail.com","Male",
                      "Gasabo","123443",
                      "Kimironko","Facebook",
                      "In-Person","Yes","Yes",
                      "Yes","yes","Add paragraph here","Add paragraph here"));
          }
      };
  }

}
