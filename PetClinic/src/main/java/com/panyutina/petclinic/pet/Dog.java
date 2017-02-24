package com.panyutina.petclinic.pet;

/**
 * Класс Собака
 */
public class Dog extends Pet{
    private final static String STRING_TYPE_OF_PET = "Dog";

    /**
     * Конструктор
     * @param name Имя собаки
     */
    public Dog(String name) {
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
