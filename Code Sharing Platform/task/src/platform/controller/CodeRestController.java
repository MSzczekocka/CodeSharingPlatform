package platform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import platform.entity.Code;
import platform.service.CodeService;

@RestController
@RequiredArgsConstructor
public class CodeRestController {

    private final CodeService codeService;
//    Code[] db = {new Code("public static void main(String[] args) {\n    SpringApplication.run(CodeSharingPlatform.class, args);\n}")};

    @GetMapping(value = "/api/code", produces="application/json")
    public ResponseEntity<Code> getJsonCode() {
//        return new ResponseEntity<>(db[0], HttpStatus.OK);
        return new ResponseEntity<>(codeService.getCodeById(1L), HttpStatus.OK);
    }

}
