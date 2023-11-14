package Enum;

public class AccountType {

    public enum RodzajKont {
        BIEZACE("1"), EMERYTALNE("2"), OSZCZEDNIOSCIOWE("3");

        private String number;

        RodzajKont(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }

}
