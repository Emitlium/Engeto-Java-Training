package Lekce08;

public class Student extends Clovek{
    private int rokNarozeni;
    private String studentskyKod;

    public Student (String jmeno, String prijmeni, int rokNarozeni, String studentskyKod){
        super(jmeno,prijmeni);
        this.rokNarozeni = rokNarozeni;
        this.studentskyKod = studentskyKod;
    }

    public int getRokNarozeni() {
        return rokNarozeni;
    }
    public String getstudentskyKod() {
        return studentskyKod;
    }

    @Override
    public String getCeleJmeno(){
        return this.getJmeno()+" "+getPrijmeni();
    }


}
