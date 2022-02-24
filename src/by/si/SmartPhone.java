package by.si;

public class SmartPhone extends PhoneClass {

    public SmartPhone(String name, int time, int count ) {
        setName(name);
        setTime(time);
        countList = count;
    }
    protected String bell(){
        return "Different Music";
    }
    protected String getMessenger(){
        messanger = "Viber,Telegram,WhatsAPP";
        return messanger;
    }
    protected int phoneBook(){
        countList = 500;
        return countList;
    }
    protected int timeCharge(){
        return getTime();
    }

}
