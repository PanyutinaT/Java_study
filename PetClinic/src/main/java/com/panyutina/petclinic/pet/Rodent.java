package com.panyutina.petclinic.pet;

/**
 * Класс Грызун
 */
public class Rodent extends Pet {
    private final static String STRING_TYPE_OF_PET = "Rodent";

    /**
     * Конструктор
     * @param name Имя грызуна
     */
    public Rodent(String name) {
        super(name);
    }

    /**
     * Возвращает строковый тип
     * @return Строковый тип
     */
    @Override
    public String getStringPetType() {
        return STRING_TYPE_OF_PET;
    }
}
