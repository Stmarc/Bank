package org.example.Enum;

public class AccountType {

    public enum AccountTypes {
        BIEZACE("1"), OSZCZEDNIOSCIOWE("3");

        private String number;

        AccountTypes(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }

}
