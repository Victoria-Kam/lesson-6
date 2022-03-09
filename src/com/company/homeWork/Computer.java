package com.company.homeWork;

/*
* Дополнительное задание
1. Создать класс для описания компьютера, в этом классе должны быть
поля: стоимость, модель(строковый тип), RAM и HDD.
Для полей RAM и HDD следует создать свои собственные классы.
Классы для RAM и HDD должны иметь конструктор по умолчанию и
конструктор со всеми параметрами.
Класс RAM имеет поля "название" и "объем".
Класс HDD имеет поля "название", "объем" и "тип" (внешний или
внутренний).
Класс Computer должен иметь два конструктора:
- первый - с параметрами стоимость и модель,
- второй - со всеми полями.
При создании объекта "компьютер" с помощью первого конструктора
должны создаваться поля RAM и HDD с помощью конструкторов по
умолчанию.
В каждом из классов предусмотреть методы для вывода полной
информации (вывод всех полей и всех значений).
Тестовый сценарий для проверки:
создать объект "компьютер 1" с помощью первого конструктора и
вывести информацию на экран;
создать объект "компьютер 2" с помощью второго конструктора и
вывести информацию на экран.
* */

public class Computer {

    private double cost;
    private String model;
    RAM ram;
    HDD hdd;

    public class HDD {

        private String name = "имя памяти не определено";
        private int memorySize = 0;
        private String type = "тип памяти не определен";

        public HDD() {
        }

        public HDD(String name, int memorySize, String type) {
            this.name = name;
            this.memorySize = memorySize;
            this.type = type;
        }

        public String getName() {
            return this.name;
        }

        public int getMemorySize() {
            return this.memorySize;
        }

        public String getType() {
            return this.type;
        }
    }

    public class RAM {

        private String name = "имя не определено";
        private int memorySize = 0;

        public RAM() {
        }

        public RAM(String name, int memorySize) {
            this.name = name;
            this.memorySize = memorySize;
        }

        public String getName() {
            return this.name;
        }

        public int getMemorySize() {
            return this.memorySize;
        }

    }

    public Computer(double cost, String model) {
        this.cost = cost;
        this.model = model;
        this.hdd = new HDD();
        this.ram = new RAM();
    }

    public Computer(double cost, String model, String ramName, int ramMemorySize, String hddName, int hddMemorySize, String hddType) {
        this.cost = cost;
        this.model = model;
        this.hdd = new HDD(hddName, hddMemorySize, hddType);
        this.ram = new RAM(ramName, ramMemorySize);
    }

    public double getCost() {
        return this.cost;
    }

    public String getModel() {
        return this.model;
    }

    public RAM getRam() {
        return this.ram;
    }

    public HDD getHdd() {
        return this.hdd;
    }
}
