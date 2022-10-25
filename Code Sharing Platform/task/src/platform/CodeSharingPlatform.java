package platform;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import platform.entity.Code;
import platform.service.CodeService;

@SpringBootApplication
@RestController
public class CodeSharingPlatform {

    public static void main(String[] args) {
        SpringApplication.run(CodeSharingPlatform.class, args);
    }

    @Bean
    CommandLineRunner init(CodeService codeService) {
        Code code = new Code(1L,
                "public static void main(String[] args) {\n    SpringApplication.run(CodeSharingPlatform.class, args);\n}");
        return args -> {
            codeService.addCode(code);
        };
    }
}
