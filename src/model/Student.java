package model;

import java.util.Date;
import java.util.Objects;

public class Student {
    private String first_name;
    private String last_name;
    private Date dob;
    private String nationalCode;
    private float gpu;

    public Student(Date dob, String first_name, float gpu, String last_name, String nationalCode) {
        this.dob = dob;
        this.first_name = first_name;
        this.gpu = gpu;
        this.last_name = last_name;
        this.nationalCode = nationalCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dob=" + dob +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", nationalCode='" + nationalCode + '\'' +
                ", gpu=" + gpu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(gpu, student.gpu) == 0 && Objects.equals(first_name, student.first_name) && Objects.equals(last_name, student.last_name) && Objects.equals(dob, student.dob) && Objects.equals(nationalCode, student.nationalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, dob, nationalCode, gpu);
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public float getGpu() {
        return gpu;
    }

    public void setGpu(float gpu) {
        this.gpu = gpu;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
