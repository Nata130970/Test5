package by.si;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mode;
        Scanner scanner = new Scanner(System.in);
        Scanner scanLine = new Scanner(System.in);
        FixPhone fixPhone=  new FixPhone("Alcatel",30,50);
        MobilPhone mobilPhone= new MobilPhone("Siemens",100,150);
        SmartPhone smartPhone= new SmartPhone("Samsung",200,500);


        do {
            System.out.println("Чтобы узнать как звонит телефон наберите 1 \n" +
                               "Чтобы узнать о Messangerах наберите 2 \n " +
                               "Чтобы узнать о записных книгах наберите 3 \n" +
                               "Чтобы узнать о времени зарядки телефона наберите 4 \n" +
                               "Cвободных записей в телефонной книге мобильного телефона 5 \n" +
                               "Для выхода наберите 9 ");
            mode = scanner.nextInt();
            switch (mode) {
                case 1:
                    System.out.println(" **** Звонки телефона **** \n" +
                                  "Звонит домашний телефон - " + fixPhone.getName()  + fixPhone.bell() + "\n" +
                                  "Звонит мобильный телефон - " + mobilPhone.getName()  + mobilPhone.bell() + "\n" +
                                  "Звонит смартфон - " + smartPhone.getName ()  + smartPhone.bell());
                    break;
                case 2:
                    System.out.println(" **** Messenger **** \n" +
                                  "Домашний телефон - " + fixPhone.getName() + fixPhone.getMessenger()+ "\n" +
                                  "Мобильный телефон - " + mobilPhone.getName() + mobilPhone.getMessenger()+ "\n" +
                                  "Смартфон - " + smartPhone.getName () + smartPhone.getMessenger());
                    break;
                case 3:
                    System.out.println( " **** Записей в телефонной книге **** \n" +
                                  "Домашний телефон - " + fixPhone.getName() + fixPhone.phoneBook() + " записей \n" +
                                  "Мобильный телефон - " + mobilPhone.getName() + mobilPhone.phoneBook() + " записей \n" +
                                  "Смартфон - " + smartPhone.getName () + smartPhone.phoneBook() + " записей ");
                    break;
                case 4:
                    System.out.println(" ****  Время зарядки **** \n" +
                                  "Домашний телефон - " + fixPhone.getName() + fixPhone.getTime() + " минут \n" +
                                  "Мобильный телефон - " + mobilPhone.getName() + mobilPhone.timeCharge() + " минут \n" +
                                  "Смартфон - " + smartPhone.getName () + smartPhone.timeCharge() + " минут ");
                    break;
                case 5:
                    String message = " !!!! Ошибка приведения типов данных  !!!!!";
                    byte recordBook = mobilPhone.freeRecordInBook(30);
                    message = (recordBook !=- 1) ? Byte.toString(recordBook) : message;
                    System.out.println( " **** Обработка исключений **** \n"+
                                  "Cвободных записей в телефонной книге " + mobilPhone.getName() + message );
                    break;
                    case 9:
                    System.out.println("До cвидания !!! ");
                    return;
                default:
                    System.out.println("Ошибка выбора");
                    break;
            }
            System.out.println("Для продолжения нажмите Enter ");
            scanLine.nextLine();
        }while(mode != 9);
    }
}
