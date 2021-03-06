package ee.team3.englishtraining.repo;

import ee.team3.englishtraining.model.Complexity;
import ee.team3.englishtraining.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepo extends JpaRepository<Word, Long> {

	List<Word> findByComplexity(@Param("complexity") Complexity complexity);

}
