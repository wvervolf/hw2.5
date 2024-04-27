public class Service {
    private static String simbols = "abcdefghijklmnopqrstuvwxyzABCDIFGHIJKLMNOPQRSTUVWXYZ1234567890_";

    public static void serviseLongValidation(String login, String password) {
        char[] serviseLoginValidation = login.toCharArray();
        char[] servisePasswordValidation = password.toCharArray();
        if (serviseLoginValidation.length > 20) {
            throw new WrongLoginException("Слишком длинный логин");
        } else {
            if (servisePasswordValidation.length > 20) {
                throw new WrongPasswordException("Слишком длинный пароль");
            }
        }
    }

    public static void serviceSimbolsLoginValidation(String login) {
        char[] serviseValidation = login.toCharArray();
        for (char a : serviseValidation) {
            if (!simbols.contains(String.valueOf(a))) {
                throw new WrongLoginException("Недопустимый символ логина");
            }
        }
    }

    public static void serviceSimbolsPasswordValidation(String password) {
        char[] serviseValidation = password.toCharArray();
        for (char a : serviseValidation) {
            if (!simbols.contains(String.valueOf(a))) {
                throw new WrongPasswordException("Недопустимый символ пароля");
            }
        }
    }

    public static void serviseСorrespondenceValidation(String password, String confirmPassword) {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли отличаются");
        }
    }

    public static void check(String login, String password, String confirmPassword) {
        serviseLongValidation(login, password);
        serviceSimbolsLoginValidation(login);
        serviceSimbolsPasswordValidation(password);
        serviseСorrespondenceValidation(password, confirmPassword);
    }
}
