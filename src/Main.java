public class Main {

    public static String simbols = "abcdefghijklmnopqrstuvwxyzABCDIFGHIJKLMNOPQRSTUVWXYZ1234567890_";


    public static void main(String[] args) {
        try {
            validation("Alexandr_02", "aB123456789", "aB123456789");
        } catch (WrongLoginException e) {
            throw new WrongLoginException("Введите другой логин");
        } catch (WrongPasswordException e) {
            throw new WrongPasswordException("Проверьте пароль");
        }
    }

    public static void validation(String login, String password, String confirmPassword) {
        char[] loginvalidation = login.toCharArray();
        for (char a : loginvalidation) {
            if (!simbols.contains(String.valueOf(a)) || loginvalidation.length > 20) {
                throw new WrongLoginException("Логин может содержать только латинские буквы, цифры и нижнее подчеркивание");
            }
        }
        char[] passwordvalidation = password.toCharArray();
        for (char b : passwordvalidation) {
            if (!simbols.contains(String.valueOf(b)) || passwordvalidation.length > 20) {
                throw new WrongPasswordException("Пароль может содержать только латинские буквы, цифры и нижнее подчеркивание");
            } else if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли отличаются");
            }
        }
    }
}