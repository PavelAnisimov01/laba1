package contracts;

import common.Common;
import common.Man;
/**
 Класс телевидение со свойствами <b>packet</b>, наследующий класс общий со свойствами <b>ID</b> , <b>dateOfStartofContract</b> , <b>dateOfEndofContract</b> , <b>numberOfContract</b>, <b>man</b> .
 * @autor Анисимов Павел
 */


public class Tele extends Common {
    /** Поле packet */
    private String packet;

    /**
     * Конструктор - создание нового объекта с определёнными значениями
     * @param man - сущность человек
     */
    public Tele(Man man){
    this.man=man;
    }
    /**
     * Функция определения значения поля {@link Tele#packet}
     *  @param packet - количетсво минут
     */

    public void setPacket(String packet) {
        this.packet = packet;
    }
    /**
     * Функция переопределения метода toString для вывода информации об объекте
     *  @return возвращает строку с полями объекта Tele
     */
    @Override
    public String toString() {

        return  " Контракт на цифровое телевидение: "+
                " Id=" + String.valueOf(ID)
                + ", DateOfStartofContract=" + String.valueOf(dateOfStartofContract)

                + ", DateOfEndofContract=" + String.valueOf(dateOfEndofContract)

                + ",NumberOfContract=" + String.valueOf(numberOfContract)


                + ", Packet=" + String.valueOf(packet)
                + ",   Man :" +
                "ID=" + String.valueOf(man.getID())
                + ", FIO="+ String.valueOf(man.getFio())
                + ", DateOfBirthday="+ String.valueOf(man.getDateOfBirthday())
                + ", SeriyAndNumberOfPassport="+ String.valueOf(man.getDateOfPassport())
                + ", Gender="+ String.valueOf(man.getGender())
                + ", Age="+ String.valueOf(man.getAge());

    }}
