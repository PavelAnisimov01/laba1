package contracts;

import common.Common;
import common.Man;
/**
 * Класс интернет со свойствами <b>speedOfConnection</b>, наследующий класс общий со свойствами <b>ID</b> , <b>dateOfStartofContract</b> , <b>dateOfEndofContract</b> , <b>numberOfContract</b>, <b>man</b> .
 * @autor Анисимов Павел
 */
public class Internet extends Common {
    /** Поле speedOfConnection */
    private int speedOfConnection;
    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param man - сущность человек
     */
    public Internet(Man man) {
        this.man = man;
    }
    /**
     * Функция определения значения поля {@link Internet#speedOfConnection}
     *  @param speedOfConnection - скорость интернета проводного
     */
    public void setSpeedOfConnection(int speedOfConnection) {
        this.speedOfConnection = speedOfConnection;
    }
    /**
     * Функция переопределения метода toString для вывода информации об объекте
     *  @return возвращает строку с полями объекта Internet
     */
    @Override
    public String toString() {

        return " Контракт на проводной интернет: " +
                " Id=" + String.valueOf(ID)
                + ", DateOfStartofContract=" + String.valueOf(dateOfStartofContract)

                + ", DateOfEndofContract=" + String.valueOf(dateOfEndofContract)

                + ",NumberOfContract=" + String.valueOf(numberOfContract)


                + ", SpeedOfConnection=" + String.valueOf(speedOfConnection)
                + ",   Man :" +
                "ID=" + String.valueOf(man.getID())
                + ", FIO=" + String.valueOf(man.getFio())
                + ", DateOfBirthday=" + String.valueOf(man.getDateOfBirthday())
                + ", SeriyAndNumberOfPassport=" + String.valueOf(man.getDateOfPassport())
                + ", Gender=" + String.valueOf(man.getGender())
                + ", Age=" + String.valueOf(man.getAge());

    }
}


