package com.company.homeWork;

/*
* Основное задание
1.  Создать класс CreditCard c полями номер счета, текущая сумма на счету. - done
    Добавьте метод, который позволяет начислять сумму на кредитную
    карточку.                                                              - done
    Добавьте метод, который позволяет снимать с карточки некоторую сумму.  - done
    Добавьте метод, который выводит текущую информацию о карточке.         - done
    Напишите программу, которая создает три объекта класса CreditCard у
    которых заданы номер счета и начальная сумма
    Тестовый сценарий для проверки:
    Положите деньги на первые две карточки и снимите с третьей.
    Выведите на экран текущее состояние всех трех карточек.
* */

public class CreditCard {

    private int idCustomer;
    private String accountNumber;              // Номер счета
    private double amountOnAccount;         // Сумма на счету

    public CreditCard() {
    }

    public CreditCard(int idCustomer, String accountNumber, double amountOnAccount) {
        this.idCustomer = idCustomer;
        this.accountNumber = accountNumber;
        this.amountOnAccount = amountOnAccount;
    }

    public String addCash(String accountNumber, double cash) {          // Метод для пополнения счета
        if (cash <= 0) {
            return "Сумма для начисления меньше или равно нулю!";
        }
        if (this.accountNumber.equals(accountNumber)) {
            amountOnAccount += cash;
        } else {
            return "Невозможно пополнить счет, так как введенный номер счета не совпадает!";
        }
        return String.format("Ваш счет пополнен! Теперь он составляет " + "%.2f", this.amountOnAccount)  + " руб.";
    }

    public String withdrawMoney(String accountNumber, double cash) {            // Медот для снятия денег
        if (this.amountOnAccount <= 0) {
            return "Невозможно снять деньги со счета, так как счет пуст!";
        } else if (!(this.accountNumber.equals(accountNumber))) {
            return "Невозможно снять деньги со счета, так как введенный номер счета не совпадает!";
        } else if (this.amountOnAccount < cash) {
            return "Невозможно снять деньги со счета, так как желаемая сумма для снятия превышает текущий счет!";
        } else if((cash % 100) != 0){                       // Если хотим снять сумму с мелочью
            this.amountOnAccount -= (cash % 100);           // Сразу от счета отнимаем остаток отнимаемого числа
            int temp = (int) cash / 100;                    // приводим к целому числу, чтобы следующий цикл долго не считал
            while (!(temp == 0)) {
                this.amountOnAccount--;                     // По одному значению отнимаем от текущего счета, в соответствии числу, сколько хотим снять денег
                temp--;
            }
        }
        else{
            while (!(cash == 0)) {                          //если мы хотим снять "круглую" сумму
                this.amountOnAccount--;                     // По одному значению отнимаем от текущего счета, в соответствии числу, сколько хотим снять денег
                cash--;
            }
        }
        return String.format("С Вашего счета сняты деньги! Теперь сумма на Вашем счете составляет " + "%.2f", this.amountOnAccount) + " руб.";
    }


    public int getIdCustomer() {
        return idCustomer;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAmountOnAccount() {
        return String.format("%.2f", this.amountOnAccount);
    }
}
