public class FIOnotFound extends Exception {
    FIOnotFound(Customer client){
        super("ФИО " + client.getFio() + " не найдено в базах данных");
    }
}
