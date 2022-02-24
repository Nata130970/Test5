package by.si;

public class MobilPhone extends PhoneClass{

    public MobilPhone(String name, int time, int count ) {
        setName(name);
        setTime(time);
        countList = count;

    }

    protected String bell(){
        return "many Ringtons";
    }
    protected int phoneBook(){
            return countList;
    }
    protected String getMessenger(){
        messanger = "Viber,Telegram";
        return messanger;
    }
    protected int timeCharge(){
          return getTime();
    }
    protected  byte freeRecordInBook(int buzyRecord){
        byte freeRecord;

        try {
            freeRecord = (byte)(countList - buzyRecord);
            if ((freeRecord > 127) || (freeRecord < 0)) throw new Exception("The bad type");

        }catch(Exception e) {
            freeRecord = -1;
            return freeRecord;
        }
        return freeRecord;
    }
}
