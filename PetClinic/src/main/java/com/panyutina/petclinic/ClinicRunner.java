package com.panyutina.petclinic;

import com.panyutina.petclinic.client.Client;
import com.panyutina.petclinic.input_output.console.ConsoleInput;
import com.panyutina.petclinic.input_output.console.ConsoleOutput;
import com.panyutina.petclinic.input_output.Input;
import com.panyutina.petclinic.input_output.Output;
import com.panyutina.petclinic.pet.*;

/**
 * Класс для демонстрации работы клиники домашних животных из консоли
 */
public class ClinicRunner {
    private final Clinic clinic;
    /** Экземпляр класса интерактивной работы с клиникой домашних животных */
    private final InteractClinic interactClinic;

    /**
     * Конструктор
     * @param clinic Клиника
     * @param input Реализация интерфейса Input
     * @param output Реализация интерфейса Output
     */
    public ClinicRunner(Clinic clinic, Input input, Output output) {
        this.clinic = clinic;
        interactClinic = new InteractClinic(clinic, input, output);
    }


    /**
     * Main
     * @param args Параметры запуска
     */
    public static void main(String[] args) {
        ClinicRunner runner = new ClinicRunner(new Clinic(), new ConsoleInput(), new ConsoleOutput());
        runner.initialClinicFilling();
        runner.mainDialog();
    }


    /**
     * Основной диалог работы клиники с пользователем
     */
    public void mainDialog() {
        interactClinic.mainDialog();
    }

    /**
     * Начальное заполнение клиники клиентами Анна, Иван и Петр
     */
    private void initialClinicFilling() {
        clinic.addClient(createAnna());
        clinic.addClient(createIvan());
        clinic.addClient(createPetr());
    }

    
    private Client createAnna() {
        Client anna = new Client("Anna Ivanova", "XX 33335789");
        anna.addPet(new Bird("Kesha"));
        anna.addPet(new Rodent("Mickey"));
        anna.addPet(new Reptile("Python"));
        anna.addPet(new SomePet("Snail"));

        return anna;
    }

    private Client createIvan() {
        Client ivan = new Client("XY 01234567");
        ivan.setFullName("Ivan Petrov");

        return ivan;
    }

    private Client createPetr() {
        Client petr = new Client("XY 89012345");
        petr.setFullName("Petr Sidorov");
        petr.addPet(new Cat("Masha"));
        petr.addPet(new Cat("Python"));
        petr.addPet(new Dog("Palkan"));

        return petr;
    }

}
