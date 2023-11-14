package Enum;

public class UserType {

    public enum TypeOfUsers {
        ADMINISTRATOR("1"), KLIENT("2");

        private String number;

        TypeOfUsers(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }
    }

}
