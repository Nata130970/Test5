package by.si;

public class FixPhone extends PhoneClass {

    public FixPhone(String name, int time, int count ) {
        setName(name);
        setTime(time);
        countList = count;
    }
    protected String getMessenger(){
        messanger = "No";
        return messanger;
  }
}
