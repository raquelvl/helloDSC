package br.ufpb.dcx.dsc.hellodsc.exceptions;

public class StudentNotFoundException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Student not found.";
    }
}
