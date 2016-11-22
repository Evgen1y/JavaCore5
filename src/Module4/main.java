package Module4;


public class main {
    public static void main(String[] args) {
        BankSystemImpl system = new BankSystemImpl();
        Bank usBank = new USBank(1, "New York", Currency.USD, 225, 54852, 5000000000000000L);
        Bank euBank = new EUBank(2, "Munchen", Currency.EUR, 148, 97852, 1050000000000000L);
        Bank chinaBank = new ChinaBank(3, "Hong Kong", Currency.USD, 312, 10254, 54000000000000L);

        User usUser1 = new User(1, "Mike", 500, 15, "GM", 2500, usBank);
        User usUser2 = new User(2, "Lisa", 24458, 24, "Microsoft", 5000, usBank);

        User euUser1 = new User(1, "Friedrich", 2250, 15, "Audi", 2600, euBank);
        User euUser2 = new User(1, "Ludvig", 14500, 15, "Ducati", 3450, euBank);

        User chinaUser1 = new User(1, "Czyi", 17200, 15, "Huawei", 1460, chinaBank);
        User chinaUser2 = new User(1, "Bay", 36450, 15, "Lenovo", 4125, chinaBank);

        System.out.println("\n<<<<<<<<<<<<<<<<<<< usUser1 >>>>>>>>>>>>>>>>>>>\n");
        system.withdrawOfUser(usUser1, 500);
        system.transferMoney(usUser1, usUser2, 350);
        system.fundUser(usUser1, 500);
        system.paySalary(usUser1);

        System.out.println("\n<<<<<<<<<<<<<<<<<<< usUser2 >>>>>>>>>>>>>>>>>>>\n");
        system.withdrawOfUser(usUser2, 1500);
        system.transferMoney(usUser2, usUser1, 258);
        system.fundUser(usUser2, 750);
        system.paySalary(usUser2);

        System.out.println("\n<<<<<<<<<<<<<<<<<<< euUser1 >>>>>>>>>>>>>>>>>>>\n");
        system.withdrawOfUser(euUser1, 2000);
        system.transferMoney(euUser1, euUser2, 350);
        system.fundUser(euUser1, 500);
        system.paySalary(euUser1);

        System.out.println("\n<<<<<<<<<<<<<<<<<<< euUser2 >>>>>>>>>>>>>>>>>>>\n");
        system.withdrawOfUser(euUser2, 1250);
        system.transferMoney(euUser2, euUser1, 2300);
        system.fundUser(euUser2, 230);
        system.paySalary(euUser2);

        System.out.println("<<<<<<<<<<<<<<<<<<< chinaUser1 >>>>>>>>>>>>>>>>>>>");
        system.withdrawOfUser(chinaUser1, 250);
        system.transferMoney(chinaUser1, chinaUser2, 2300);
        system.fundUser(chinaUser1, 350);
        system.paySalary(chinaUser1);

        System.out.println("<<<<<<<<<<<<<<<<<<< chinaUser2 >>>>>>>>>>>>>>>>>>>");
        system.withdrawOfUser(chinaUser2, 2500);
        system.transferMoney(chinaUser2, chinaUser1, 254);
        system.fundUser(chinaUser2, 786);
        system.paySalary(chinaUser2);

    }
}
