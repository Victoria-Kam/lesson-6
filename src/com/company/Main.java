package com.company;

import com.company.homeWork.CreditCard;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String marker = "********************************************************************************";
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

    }
}
