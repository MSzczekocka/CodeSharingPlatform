package platform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import platform.entity.Code;
import platform.service.CodeService;

@RestController
@RequiredArgsConstructor
public class CodeController {

    private final CodeService codeService;

    @GetMapping("/code")
    public String getHtmlCode() {
        return "Not implemented yet";
    }


    @GetMapping("/api/code")
    public Code getJsonCode() {
        Code newCode = new Code(1, "public static void main(String[] args) {" + '\n' +
                "    SpringApplication.run(CodeSharingPlatform.class, args);" + '\n' +
                "}");
        codeService.addCode(newCode);
        return codeService.getCodeById(1L);
    }


}
