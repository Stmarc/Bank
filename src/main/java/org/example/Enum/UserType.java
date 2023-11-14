package Enum;

public class UserType {

    public enum RodzajeUzytkownikow {
        ADMINISTRATOR("1"), KLIENT("2");

        private String number;

        RodzajeUzytkownikow(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }

}
