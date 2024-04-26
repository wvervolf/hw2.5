public class WrongLoginException extends RuntimeException{
    public WrongLoginException(String message) {
        super(message);
        System.out.println("Введите другой логин");
    }
}
