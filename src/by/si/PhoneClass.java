package by.si;

public class PhoneClass {

     int countList = 15;
     String messanger = "";
     private String name="";
     private int time=0;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name + ":  ";
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    protected String bell(){
        return "Бла-бла-бла";
    }
    protected int phoneBook(){
        return countList;
    }

}
