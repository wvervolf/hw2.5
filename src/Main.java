public class Main {


    public static void main(String[] args) {
        try {
            Service.check("Alexandr_02", "aB123456789", "aB123456789");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Неверный логин или пароль");
        }
    }
}