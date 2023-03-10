package repository;


import common.Common;
import common.Man;
import contracts.Internet;
import contracts.Mobile;
import contracts.Tele;


import java.util.*;

/**
 * Класс репозиторий, который выполняет функцию базы данных и выполняет метод main.
 * @autor Анисимов Павел
 */
public class Repo {
    /**
     * Функция main, которая реализует примитивную работу базы данных.
     */
    public static void main(String[] args) {
        /** Создание списка объектов типа общий */
        Common[] spisok = null;
        /** Создание объекта сканнер для ввода пользователем значений с клавиатуры*/
        Scanner scStr = new Scanner(System.in);
        Scanner scChislo = new Scanner(System.in);
        Scanner chislo = new Scanner(System.in);
        /** Создание счётчика для присваивания автоматически ID по контрактам*/
        Long count=1l;
        /** Создание переменной для дальнейшего выхода из цикла по работе с базой данных*/
        int x = 1;
        /** Создание цикла, который позволяет повторять работу примитивной базы данных*/
        while (x != 0) {
            System.out.println("                    Введите нужную цифру:            ");
            System.out.println("1.Добавить контракт на мобильную связь в базу данных.");
            System.out.println("2.Добавить контракт на интернет в базу данных.");
            System.out.println("3.Добавить контракт на телевидение в базу данных.");
            System.out.println("4.Получить контракт из базы данных.");
            System.out.println("5.Удалить контракт из базу данных.");
            System.out.println("6.Закончить работу с репозиторием.");
            /** Вызов одного из методов для работы с базой данных*/
            switch (chislo.nextInt()) {
                /** Вызов метода, который добавляет контракт на мобильную связь в базу данных*/
                case (1):
                    spisok = addCommon(spisok, getMobile(count,scStr,scChislo));
                    count++;
                    break;
                /** Вызов метода, который добавляет контракт на проводной интернет в базу данных*/
                case (2):
                    spisok = addCommon(spisok, getInternet(count,scStr,scChislo));
                    count++;
                    break;
                /** Вызов метода, который добавляет контракт на телевидение в базу данных*/
                case (3):
                    spisok = addCommon(spisok, getTele(count,scStr,scChislo));
                    count++;
                    break;
                /** Вызов метода, который получает контракт по ID из базы данных*/
                case (4):
                    viewContract(spisok);
                    break;
                /** Вызов метода, который удаляет контракт по ID из базы данных*/
                case (5):
                    spisok = deleteCommon(spisok, scChislo);
                    break;
                /** Вызов метода, который завершает работу базы данных*/
                case (6):
                    x = 0;
                    System.out.println("Выход из базы данных произведен успешно");
                    break;
                default:
                    System.out.println("Вы ввели значение, на которое у базы данных нет функционала, введите другое значение пожалуйста");
                    break;

            }

        }
    }
    /**
     * Функция добавления одного из контрактов в базу данных
     *  @param spisok - массив с контрактами
     *  @param common - контракт
     *  @return возвращает новый расширенный массив контрактов
     */
    public static Common[] addCommon(Common[] spisok, Common common) {
        Common[] newList;
        if (spisok == null) {
            newList = new Common[1];
            newList[0] = common;
        } else {
            newList = new Common[spisok.length + 1];
            System.arraycopy(spisok, 0, newList, 0, spisok.length);
            newList[spisok.length] = common;
        }
        return newList;
    }
    /**
     * Функция удаления одного из контрактов из базы данных
     *  @param spisok - массив с контрактами
     *  @param scChislo - введённое пользователем ID
     *  @return возвращает новый суженный массив контрактов
     */
    public static Common[] deleteCommon(Common[] spisok, Scanner scChislo){
        System.out.println("Введите ID контракта, который хотите удалить из базы данных");
        Long id = scChislo.nextLong();
        int i = Integer.parseInt(String.valueOf(id));
        int k;
        if (spisok != null) {
            for (int j = 0; j < spisok.length; j++) {
                if (Integer.parseInt(String.valueOf(spisok[j].getID())) == i) {
                    k = j;
                    if (k == 0) {
                        for (int t1 = 1; t1 < spisok.length; t1++) {
                            spisok[t1 - 1] = spisok[t1];
                        }
                    } else if (k == spisok.length - 1) {
                        spisok[k] = null;
                    } else {
                        for (int t1 = k; t1 < spisok.length - 1; t1++) {
                            spisok[t1] = spisok[t1 + 1];
                        }
                    }
                    break;
                }
            }
        }
        Common[] newList;
        newList = new Common[spisok.length - 1];
        System.arraycopy(spisok, 0, newList, 0, newList.length);
        return newList;

    }
    /**
     * Функция получения одного из контрактов из базы данных
     *  @param spisok - массив с контрактами
     */
    public static void viewContract(Common[] spisok){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите ID контракта, который хотите получить из базы данных");
        Long id = sc1.nextLong();
        int i = Integer.parseInt(String.valueOf(id));
        if (spisok != null) {
            for (int j = 0; j < spisok.length; j++) {
                if (Integer.parseInt(String.valueOf(spisok[j].getID())) == i)
                { System.out.println(spisok[j]);
                    break;}

            }
        }
        else {
            System.out.println("Список пуст");}

    }
    /**
     * Функция добавления контракта на мобильную связь в базу данных.
     *  @param count - массив с контрактами
     *  @param scStr - введённая пользователем строка
     *  @param scStr - введённое пользователем число
     *  @return возвращает новый контракт на мобильную связь
     */

    public static Mobile getMobile(Long count, Scanner scStr, Scanner scChislo){
        Man chelMobile = new Man();
        chelMobile.setID(count);
        System.out.println("Введите FIO человека");
        chelMobile.setFio(scStr.nextLine());
        System.out.println("Введите дату рождения человека(формат dd:mm:yyyy)");
        chelMobile.setDateOfBirthday(scStr.nextLine());
        System.out.println("Введите серию и номер паспорта человека через пробел(формат ssss nnnnnn)");
        chelMobile.setDateOfPassport(scStr.nextLine());
        System.out.println("Введите пол человека");
        chelMobile.setGender(scStr.nextLine());

        Mobile mobile = new Mobile(chelMobile);
        mobile.setID(count);
        System.out.println("Введите дату начала контракта(формат dd:mm:yyyy)");
        mobile.setDateOfStartofContract(scStr.nextLine());
        System.out.println("Введите дату окончания контракта(формат dd:mm:yyyy)");
        mobile.setDateOfEndofContract(scStr.nextLine());
        System.out.println("Введите номер контракта");
        mobile.setNumberOfContract(scChislo.nextLong());
        System.out.println("Введите количество минут по контракту");
        mobile.setMinut(scChislo.nextInt());
        System.out.println("Введите количество смс по контракта");
        mobile.setSms(scChislo.nextInt());
        System.out.println("Введите количество гигабайтов по контракту");
        mobile.setGb(scChislo.nextInt());
        return mobile;

    }
    /**
     * Функция добавления контракта на интернет в базу данных.
     *  @param count - массив с контрактами
     *  @param scStr - введённая пользователем строка
     *  @param scStr - введённое пользователем число
     *  @return возвращает новый контракт на проводной интернет
     */
    public static Internet getInternet(Long count, Scanner scStr, Scanner scChislo){
        Man chelInternet = new Man();
        chelInternet.setID(count);
        System.out.println("Введите FIO человека");
        chelInternet.setFio(scStr.nextLine());
        System.out.println("Введите дату рождения человека(формат dd:mm:yyyy)");
        chelInternet.setDateOfBirthday(scStr.nextLine());
        System.out.println("Введите серию и номер паспорта человека через пробел(формат ssss nnnnnn)");
        chelInternet.setDateOfPassport(scStr.nextLine());
        System.out.println("Введите пол человека");
        chelInternet.setGender(scStr.nextLine());

        Internet internet = new Internet(chelInternet);
        internet.setID(count);
        System.out.println("Введите дату начала контракта(формат dd:mm:yyyy)");
        internet.setDateOfStartofContract(scStr.nextLine());
        System.out.println("Введите дату окончания контракта(формат dd:mm:yyyy)");
        internet.setDateOfEndofContract(scStr.nextLine());
        System.out.println("Введите номер контракта");
        internet.setNumberOfContract(scChislo.nextLong());
        System.out.println("Введите скорость интернета по контракту");
        internet.setSpeedOfConnection(scChislo.nextInt());
        return internet;

    }
    /**
     * Функция добавления контракта на телевидение в базу данных.
     *  @param count - массив с контрактами
     *  @param scStr - введённая пользователем строка
     *  @param scStr - введённое пользователем число
     *  @return возвращает новый контракт на телевидение
     */
    public static Tele getTele(Long count, Scanner scStr, Scanner scChislo){
        Man chelTele = new Man();
        chelTele.setID(count);
        System.out.println("Введите FIO человека");
        chelTele.setFio(scStr.nextLine());
        System.out.println("Введите дату рождения человека(формат dd:mm:yyyy)");
        chelTele.setDateOfBirthday(scStr.nextLine());
        System.out.println("Введите серию и номер паспорта человека через пробел(формат ssss nnnnnn)");
        chelTele.setDateOfPassport(scStr.nextLine());
        System.out.println("Введите пол человека");
        chelTele.setGender(scStr.nextLine());

        Tele tele = new Tele(chelTele);
        tele.setID(count);
        System.out.println("Введите дату начала контракта(формат dd:mm:yyyy)");
        tele.setDateOfStartofContract(scStr.nextLine());
        System.out.println("Введите дату окончания контракта(формат dd:mm:yyyy)");
        tele.setDateOfEndofContract(scStr.nextLine());
        System.out.println("Введите номер контракта");
        tele.setNumberOfContract(scChislo.nextLong());
        System.out.println("Введите пакет каналов по контракту(перечисление через запятую)");
        tele.setPacket(scStr.nextLine());
        return tele;
    }
}


