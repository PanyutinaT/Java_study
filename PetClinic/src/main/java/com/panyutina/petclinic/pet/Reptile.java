package com.panyutina.petclinic.pet;

/**
 * Класс Рептилия
 */
public class Reptile extends Pet {
    private final static String STRING_TYPE_OF_PET = "Reptile";

    /**
     * Конструктор
     * @param name Имя рептилии
     */
    public Reptile(String name) {
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
