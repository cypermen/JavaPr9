import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    private String inn;
    private String fio;
    static ArrayList<String> DATABASE_INN = new ArrayList<>(Arrays.asList("123456789102","123456789104","123456789103"));
    static ArrayList<String> DATABASE_FIO = new ArrayList<>(Arrays.asList("Chuhareva Alisa Vasilievna","Dmitri Prihodko Andreevich","Chuharev Vadim Sergeevich"));
    Customer(String INN, String name) throws UnacceptableInnException {
        if (INN.length() != 12)
            throw new UnacceptableInnException();
        inn = INN;
        fio = name;
    }
    public void Check(String INN, String NAME) throws INNnotFound, FIOnotFound {
        int c = 0;
        for(int i = 0;i < DATABASE_FIO.size();i++){
            if (NAME == DATABASE_FIO.get(i)){
                if(INN != DATABASE_INN.get(i))
                    throw new INNnotFound(this);
                    break;
            }else{
                c++;
            }
            if (c == DATABASE_FIO.size()){
                throw new FIOnotFound(this);
            }
        }

    }

    public static void Check(Customer client){
        try{
            client.Check(client.getInn(),client.getFio());
            System.out.println("ИНН " +client.getFio() + " совпадает с базой данных.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getInn() {
        return inn;
    }

    public String getFio() {
        return fio;
    }
}