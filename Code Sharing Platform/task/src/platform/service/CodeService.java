package platform.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import platform.entity.Code;
import platform.exceptions.CodeNotFoundException;
import platform.repository.CodeRepository;

@Service
@RequiredArgsConstructor
public class CodeService {

    private final CodeRepository codeRepository;

    public Code getCodeById(Long id) {
        return codeRepository.findById(id).orElseThrow(CodeNotFoundException::new);
    }

    public Code addCode(Code newCode) {
        return codeRepository.save(newCode);
    }





}
