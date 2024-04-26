public class Service {
    private static String simbols = "abcdefghijklmnopqrstuvwxyzABCDIFGHIJKLMNOPQRSTUVWXYZ1234567890_";
    public static void serviseLongValidation(String parametr) {
        char[] serviseValidation = parametr.toCharArray();
        if (serviseValidation.length > 20) {
            throw new WrongLoginException("Колличество символов " + parametr + " превышает допустимое(20)");
        }
    }

    public static void serviseSimbolsValidation(String parametr) {
        char[] serviseValidation = parametr.toCharArray();
        for (char a : serviseValidation) {
            if (!simbols.contains(String.valueOf(a))) {
                throw new WrongLoginException("Строка может содержать только латинские буквы, цифры и нижнее подчеркивание");
            }
        }
    }
    public static void serviseСorrespondenceValidation(String parametr1, String parametr2) {
        if(!parametr1.equals(parametr2)) {
            throw new WrongPasswordException("Пароли отличаются");
        }
    }
    public static void check(String login, String password, String confirmPassword) {
        Service.serviseLongValidation(login);
        Service.serviseLongValidation(password);
        Service.serviseSimbolsValidation(login);
        Service.serviseSimbolsValidation(password);
        Service.serviseСorrespondenceValidation(password, confirmPassword);
    }
}
