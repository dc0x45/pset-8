import java.util.HashMap;

// atm class is not mutable, so this is the solution for now

public class backend {

    private static HashMap<Long, BankAccount> accountMapper = new HashMap<Long, BankAccount>();

    public static boolean checkExistingHash(long hash) {
        if (accountMapper.containsKey(hash)) {
            return true;
        } else return false;
    } 

    public static void createAccount(long hash, BankAccount account){
        if (hash != 0L && account != null){
            accountMapper.put(hash, account);
        }
    }

    public static int size(){
        return accountMapper.size();
    }

    public static BankAccount access(long hash){
        return accountMapper.get(hash);
    }

    public static String debugger(){
        return accountMapper.toString();
    }
    
}
