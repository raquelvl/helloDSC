package br.ufpb.dcx.dsc.hellodsc.services;


import br.ufpb.dcx.dsc.hellodsc.entities.Student;
import br.ufpb.dcx.dsc.hellodsc.repositories.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import br.ufpb.dcx.dsc.hellodsc.exceptions.StudentNotFoundException;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsDAO;

    public Student createStudent(Student student) {
        studentsDAO.save(student);
        return student;
    }

    public List<Student> getStudents() {
        return studentsDAO.findAll();
    }

    public Student getStudentById(String studentId) {
        return studentsDAO.findById(studentId).orElseThrow(StudentNotFoundException::new);
    }
}
