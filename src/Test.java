public class Test {
    public static void main(String[] args) {
        try {
            Customer c2 = new Customer("123456789102", "Chuhareva Alisa Vasilievna");
            Customer c3 = new Customer("123456789103", "Chuharev Vadim Sergeevich");
            Customer c4 = new Customer("123456789105", "Latisheb Maxim Petrovich");
            Customer c5 = new Customer("123456789107", "Dmitri Prihodko Andreevich");
            Customer.Check(c2);
            Customer.Check(c3);
            Customer.Check(c4);
            Customer.Check(c5);
            Customer c1 = new Customer("123456789", "Chuharev Nikita Sergeevich");
        }catch (UnacceptableInnException e){
            System.out.println("Неверно задан ИНН");
        }

    }
}
