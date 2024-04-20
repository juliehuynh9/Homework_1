package org.example;

public class JulieHuynh{
    private final String fullName;
    private final String firstName;
    private final String lastName;
    private final String UCInetID;
    private final int studentNumber;

    public JulieHuynh(){
        this.fullName = "Julie Huynh";
        this.firstName = "Julie";
        this.lastName = "Huynh";
        this.UCInetID = "julieh16";
        this.studentNumber = 94204014;
    }

    public String getFullName(){
        return fullName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUCInetID(){
        return UCInetID;
    }

    public int getStudentNumber(){
        return studentNumber;
    }

    public String getRotatedFullName(int shift){
        shift = shift % fullName.length();
        if (shift < 0)
            shift += fullName.length();
        return fullName.substring(shift) + fullName.substring(0, shift);
    }
}