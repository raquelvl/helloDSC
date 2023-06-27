package br.ufpb.dcx.dsc.hellodsc.repositories;

import br.ufpb.dcx.dsc.hellodsc.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentsRepository extends JpaRepository<Student, String> {
}
