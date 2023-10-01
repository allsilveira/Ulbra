import java.util.ArrayList;

public class Bank implements ICrud<Account>{
    private ArrayList<Account> accounts = new ArrayList<>();

    @Override
    public void create(Account account) {
        int numberAccount = accounts.size() + 1;
        account.setNumber(numberAccount);
        accounts.add(account);
        System.out.println("Conta criada com sucesso.");
    }

    @Override
    public Account read(int id) {
        Account account = accounts.get(id - 1);

        if (account == null) {
            System.out.println("Conta não encontrada.");
            return null;
        }
        return account;

    }

    @Override
    public void update(int id, Account account) {
        Account serachAccount = this.read(id);

        if (serachAccount == null) {
            return;
        }

        accounts.set((id - 1), account);
        System.out.println("Conta atualizada.");
    }

    @Override
    public void delete(int id) {
        accounts.remove(id - 1);
        System.out.println("Conta deletada.");
    }
}
