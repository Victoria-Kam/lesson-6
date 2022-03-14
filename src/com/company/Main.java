package com.company;

import com.company.homeWork.Computer;
import com.company.homeWork.CreditCard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*String marker = "********************************************************************************";
        String accountNumber;
        double amountOnAccount;
        double deposit;

        int count = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("Добрый день!Вы " + count + " клиент. Для создания счета необходимо сначала ввести номер счета. Введите номер счета: ");
        accountNumber = scan.next();
        System.out.println("Теперь Вам нужно ввести сумму для пополнения счета. Сумму для зачисления на счет: ");
        amountOnAccount = scan.nextDouble();

        CreditCard customerOne = new CreditCard(count, accountNumber, amountOnAccount);
        count++;

        System.out.println("Вы " + count + " клиент. Для создания счета необходимо сначала ввести номер счета. Введите номер счета: ");
        accountNumber = scan.next();
        System.out.println("Теперь Вам нужно ввести сумму для пополнения счета. Сумму для зачисления на счет: ");
        amountOnAccount = scan.nextDouble();

        CreditCard customerTwo = new CreditCard(count, accountNumber, amountOnAccount);
        count++;

        System.out.println("Вы " + count + " клиент. Для создания счета необходимо сначала ввести номер счета. Введите номер счета: ");
        accountNumber = scan.next();
        System.out.println("Теперь Вам нужно ввести сумму для пополнения счета. Сумму для зачисления на счет: ");
        amountOnAccount = scan.nextDouble();

        CreditCard customerThree = new CreditCard(count, accountNumber, amountOnAccount);
        count++;

        System.out.println(marker + "\nСостояние трех счетов:");
        System.out.println("Клиент " + customerOne.getIdCustomer() + ". Номер счета: " + customerOne.getAccountNumber() + ". Сумма на счете: " + customerOne.getAmountOnAccount() + " руб.");
        System.out.println("Клиент " + customerTwo.getIdCustomer() + ". Номер счета: " + customerTwo.getAccountNumber() + ". Сумма на счете: " + customerTwo.getAmountOnAccount() + " руб.");
        System.out.println("Клиент " + customerThree.getIdCustomer() + ". Номер счета: " + customerThree.getAccountNumber() + ". Сумма на счете: " + customerThree.getAmountOnAccount() + " руб.\n"+marker);

        System.out.println("\nВведите сумму для пополнения счета " + customerOne.getIdCustomer() + " клиента: ");
        amountOnAccount = scan.nextDouble();
        System.out.println(marker + "\n" + customerOne.addCash(customerOne.getAccountNumber(),amountOnAccount) + "\n"+ marker);

        System.out.println("\nВведите сумму для пополнения счета " + customerTwo.getIdCustomer() + " клиента: ");
        amountOnAccount = scan.nextDouble();
        System.out.println(marker + "\n" + customerTwo.addCash(customerTwo.getAccountNumber(),amountOnAccount) + "\n"+ marker);

        System.out.println("\nВведите сумму для снятия со счета у " + customerThree.getIdCustomer() + " клиента: ");
        amountOnAccount = scan.nextDouble();
        System.out.println(marker + "\n" + customerThree.withdrawMoney(customerThree.getAccountNumber(),amountOnAccount) + "\n");

        System.out.println(marker + "\nСостояние трех счетов:");
        System.out.println("Клиент " + customerOne.getIdCustomer() + ". Номер счета: " + customerOne.getAccountNumber() + ". Сумма на счете: " + customerOne.getAmountOnAccount() + " руб.");
        System.out.println("Клиент " + customerTwo.getIdCustomer() + ". Номер счета: " + customerTwo.getAccountNumber() + ". Сумма на счете: " + customerTwo.getAmountOnAccount() + " руб.");
        System.out.println("Клиент " + customerThree.getIdCustomer() + ". Номер счета: " + customerThree.getAccountNumber() + ". Сумма на счете: " + customerThree.getAmountOnAccount() + " руб.\n"+marker);
*/

        String marker = "********************************************************************************";

        double cost;
        int hddMemorySize;
        int ramMemorySize;
        String model;
        String ramName;
        String hddName;
        String hddType;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Создаем первый компьютер, с первым конструктором.");
        System.out.print("Введите стоимость первого компьютера: ");
        cost = scanner.nextDouble();
        System.out.print("Введите модель первого компьютера: ");
        model = scanner.next();
        Computer computerOne = new Computer(cost, model);

        System.out.print("\n" + marker + "\n");

        System.out.println("Информация о первом компьютере:");
        System.out.println("1) Стоимость: " + computerOne.getCost());
        System.out.println("2) Модель: " + computerOne.getModel());
        System.out.println("3) Название HDD: " + computerOne.hddGetName());
        System.out.println("4) Размер HDD: " + computerOne.hddGetMemorySize());
        System.out.println("5) Тип HDD: " + computerOne.hddGetType());
        System.out.println("6) Название RAM: " + computerOne.ramGetName());
        System.out.println("7) Размер RAM: " + computerOne.ramGetMemorySize());

        System.out.println("\n" + marker);
        System.out.println(marker + "\n");

        System.out.println("Создаем второй компьютер, со вторым конструктором.");
        System.out.print("Введите стоимость второго компьютера: ");
        cost = scanner.nextDouble();
        System.out.print("Введите модель второго компьютера: ");
        model = scanner.next();
        System.out.print("Введите название HDD второго компьютера: ");
        hddName = scanner.next();
        System.out.print("Введите размер HDD второго компьютера(Гб): ");
        hddMemorySize = scanner.nextInt();
        System.out.print("Введите тип HDD второго компьютера(внешний или внутренний): ");
        hddType = scanner.next();
        System.out.print("Введите название RAM второго компьютера: ");
        ramName = scanner.next();
        System.out.print("Введите размер RAM второго компьютера(Гб): ");
        ramMemorySize = scanner.nextInt();

        Computer computerTwo = new Computer(cost, model, ramName, ramMemorySize, hddName, hddMemorySize, hddType);

        System.out.print("\n" + marker + "\n");

        System.out.println("Информация о втором компьютере:");
        System.out.println("1) Стоимость: " + computerTwo.getCost());
        System.out.println("2) Модель: " + computerTwo.getModel());
        System.out.println("3) Название HDD: " + computerTwo.hddGetName());
        System.out.println("4) Размер HDD: " + computerTwo.hddGetMemorySize() + " Гб");
        System.out.println("5) Тип HDD: " + computerTwo.hddGetType());
        System.out.println("6) Название RAM: " + computerTwo.ramGetName());
        System.out.println("7) Размер RAM: " + computerTwo.ramGetMemorySize() + " Гб");

    }
}
