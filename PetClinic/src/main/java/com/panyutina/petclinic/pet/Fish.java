package com.panyutina.petclinic.pet;

/**
 * Класс Рыба
 */
public class Fish extends Pet {
    private final static String STRING_TYPE_OF_PET = "Fish";

    /**
     * Конструктор
     * @param name Имя рыбы
     */
    public Fish(String name) {
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
