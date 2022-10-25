package platform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import platform.entity.Code;

@Repository
public interface CodeRepository extends JpaRepository<Code, Long> {
}
