public class HeartRates {

    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    public HeartRates(String firstName,String lastName, int birthDay, int birthMonth, int birthYear){

        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;


    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public void setBirthDay(int birthDay){
        this.birthDay = birthDay;

    }
    public void  setBirthMonth( int birthMonth){
        this.birthMonth =birthMonth;
    }
    public  void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public int getBirthDay(){
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }
    public int getBirthYear(){
        return birthYear;
    }

    public int calculateAge(){

        return  2024 - birthYear ;

    }

    public int calculateHeartRateMax(){
        return  220 - calculateAge();
    }
public int calculateTargetHr(int RestheartRate, int intensity){

        int TargetHr = (calculateHeartRateMax() - RestheartRate) * intensity/100 + RestheartRate;
        return TargetHr;

}


}
