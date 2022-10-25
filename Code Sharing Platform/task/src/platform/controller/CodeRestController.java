package platform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import platform.entity.Code;
import platform.service.CodeService;

@RestController
@RequiredArgsConstructor
public class CodeRestController {

    private final CodeService codeService;

    @GetMapping(value = "/api/code", produces="application/json")
    public Code getJsonCode() {
        return codeService.getCodeById(1L);
    }

}
