package common;
/**
 * Класс общий со свойствами <b>ID</b> , <b>dateOfStartofContract</b> , <b>dateOfEndofContract</b> , <b>numberOfContract</b>, <b>man</b> .
 * @autor Анисимов Павел
 */
public class Common {
    /** Поле ID */
    protected Long ID;
    /** Поле даты начала контракта */
    protected String dateOfStartofContract;
    /** Поле даты окончания контракта */
    protected String dateOfEndofContract;
    /** Поле номера контракта */
    protected Long numberOfContract;
    /** Поле сущности человека */
    protected Man man;


    /**
     * Конструктор - создание нового объекта
     */
    public Common() {

    }
    /**
     * Функция получения значения поля {@link Common#ID}
     * @return возвращает значение возраста
     */

    public Long getID() {
        return ID;
    }
    /**
     * Функция определения значения поля {@link Common#ID}
     *  @param ID - ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Функция определения значения поля {@link Common#dateOfStartofContract}
     *  @param dateOfStartofContract - дата начала контракта
     */
    public void setDateOfStartofContract(String dateOfStartofContract) {
        this.dateOfStartofContract = dateOfStartofContract;
    }
    /**
     * Функция определения значения поля {@link Common#dateOfEndofContract}
     *  @param dateOfEndofContract - дата окончания контракта
     */
    public void setDateOfEndofContract(String dateOfEndofContract) {
        this.dateOfEndofContract = dateOfEndofContract;
    }
    /**
     * Функция определения значения поля {@link Common#numberOfContract}
     *  @param numberOfContract - номер контракта
     */
    public void setNumberOfContract(Long numberOfContract) {
        this.numberOfContract = numberOfContract;
    }


}
