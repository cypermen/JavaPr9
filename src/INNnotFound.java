public class INNnotFound extends Exception {
    INNnotFound(Customer client){
        super("Введённый ИНН " + client.getFio() + " не совпадает с базой данных");
    }
}
