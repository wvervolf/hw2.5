public class Main {


    public static void main(String[] args) {
        try {
            validation("Alexandr_02", "aB123456789", "aB123456789");
        } catch (RuntimeException e) {
            System.out.println("Неверный логин или пароль");
        }
    }

    private static void validation(String login, String password, String confirmPassword) {
            Service.serviseLongValidation(login);
            Service.serviseLongValidation(password);
            Service.serviseSimbolsValidation(login);
            Service.serviseSimbolsValidation(password);
            Service.serviseСorrespondenceValidation(password, confirmPassword);
        }
}