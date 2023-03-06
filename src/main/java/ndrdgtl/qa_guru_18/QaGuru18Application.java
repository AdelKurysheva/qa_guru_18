package ndrdgtl.qa_guru_18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QaGuru18Application {

    public static void main(String[] args) {
        System.out.println(getMessage());
    }
    private static String getMessage(){
        return "Hello qa.guru!";
    }

}
