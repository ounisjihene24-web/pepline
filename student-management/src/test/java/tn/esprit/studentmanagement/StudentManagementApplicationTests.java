package tn.esprit.studentmanagement;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // utilise application-test.properties
class StudentManagementApplicationTests {

    @Test
    void contextLoads() {
        // Vérifie que le contexte Spring se charge correctement
    }
}
