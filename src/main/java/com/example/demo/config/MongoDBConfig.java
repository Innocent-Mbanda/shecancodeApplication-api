package com.example.demo.config;



import com.example.demo.document.ERole;
import com.example.demo.document.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = RoleRepository.class)
@Configuration
class MongoDBConfig {
    @Bean
    CommandLineRunner commandLineRunner(RoleRepository roleRepository){
        return new CommandLineRunner() {
            ERole eRole;
            @Override
            public void run(String... args) throws Exception {
                roleRepository.save( new Role(eRole.ROLE_USER));
                roleRepository.save( new Role(eRole.ROLE_MODERATOR));
                roleRepository.save( new Role(eRole.ROLE_ADMIN));
            }
        };
    }

}