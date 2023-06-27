package br.ufpb.dcx.dsc.hellodsc.entities;


import br.ufpb.dcx.dsc.hellodsc.enums.LevelOfJavaProgrammingSkills;
import br.ufpb.dcx.dsc.hellodsc.enums.LevelOfMotivation;
import br.ufpb.dcx.dsc.hellodsc.enums.LevelOfSpringBootFamiliarity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    private String email;
    private String name;
    private int semestersToGraduate;
    private LevelOfMotivation motivation;
    private LevelOfJavaProgrammingSkills programmingSkills;
    private LevelOfSpringBootFamiliarity springBootFamiliarity;

    public Student() {
    }

    public Student(String email, String name, int semestersToGraduate) {
        this.email = email;
        this.name = name;
        this.semestersToGraduate = semestersToGraduate;
    }

    public Student(String email, String name, int semestersToGraduate,
                   LevelOfMotivation motivation, LevelOfJavaProgrammingSkills programmingSkills,
                   LevelOfSpringBootFamiliarity springBootFamiliarity) {
        this.email = email;
        this.name = name;
        this.semestersToGraduate = semestersToGraduate;
        this.motivation = motivation;
        this.programmingSkills = programmingSkills;
        this.springBootFamiliarity = springBootFamiliarity;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getSemestersToGraduate() {
        return semestersToGraduate;
    }

    public LevelOfMotivation getMotivation() {
        return motivation;
    }

    public LevelOfJavaProgrammingSkills getProgrammingSkills() {
        return programmingSkills;
    }

    public LevelOfSpringBootFamiliarity getSpringBootFamiliarity() {
        return springBootFamiliarity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return getEmail() != null ? getEmail().equals(student.getEmail()) : student.getEmail() == null;
    }

    @Override
    public int hashCode() {
        return getEmail() != null ? getEmail().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", semestersToGraduate=" + semestersToGraduate +
                ", motivation=" + motivation.toString() +
                ", programmingSkills=" + programmingSkills.toString() +
                ", springBootFamiliarity=" + springBootFamiliarity.toString() +
                '}';
    }
}
