package contracts;

import common.Common;
import common.Man;
/**
 * Класс мобильная связь со свойствами <b>minut</b>,<b>sms</b>,<b>gb</b>, наследующий класс общий со свойствами <b>ID</b> , <b>dateOfStartofContract</b> , <b>dateOfEndofContract</b> , <b>numberOfContract</b>, <b>man</b> .
 * @autor Анисимов Павел
 */
public class Mobile extends Common {
    /** Поле minut */
    private int minut;
    /** sms */
    private int sms;
    /** gb */
    private int gb;

    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param man - сущность человек
     */
    public Mobile(Man man) {
        this.man = man;
    }

    /**
     * Функция определения значения поля {@link Mobile#minut}
     *  @param minut - количетсво минут
     */

    public void setMinut(int minut) {
        this.minut = minut;
    }
    /**
     * Функция определения значения поля {@link Mobile#gb}
     *  @param sms - количетсво смс
     */

    public void setSms(int sms) {
        this.sms = sms;
    }
    /**
     * Функция определения значения поля {@link Mobile#sms}
     *  @param gb - количетсво гигабайт
     */

    public void setGb(int gb) {
        this.gb = gb;
    }
    /**
     * Функция переопределения метода toString для вывода информации об объекте
     *  @return возвращает строку с полями объекта Mobile
     */
    @Override
    public String toString() {

        return " Контракт на мобильную связь: " +
                "  Id= " + String.valueOf(ID)
                + ", DateOfStartofContract= " + String.valueOf(dateOfStartofContract)

                + ", DateOfEndofContract= " + String.valueOf(dateOfEndofContract)

                + ",NumberOfContract= " + String.valueOf(numberOfContract)

                + ", Minuts= " + String.valueOf(minut)
                + ", SMS= " + String.valueOf(sms)
                + ", GB= " + String.valueOf(gb)
                + ",        Man :" +
                "ID= " + String.valueOf(man.getID())
                + ", FIO= " + String.valueOf(man.getFio())
                + ", DateOfBirthday= " + String.valueOf(man.getDateOfBirthday())
                + ", SeriyAndNumberOfPassport= " + String.valueOf(man.getDateOfPassport())
                + ", Gender= " + String.valueOf(man.getGender())
                + ", Age= " + String.valueOf(man.getAge());

    }
}
