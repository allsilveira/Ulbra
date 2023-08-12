package controller;
import java.util.ArrayList;
import model.UserModel;
import model.User;

public class UserController {
    UserModel model = new UserModel();

    public ArrayList<User> list() {
        return this.model.list();
    }

    public void add(User user) {
        if (user == null) {
            this.error("Usuário não fornecido ou inválido..");
            return;
        }
        this.model.add(user);
    }

    public User get(int id) {
        if (id <= 0) {
            this.error("ID do usuário não fornecido ou inválido.");
        }
        return this.model.get(id);
    }

    public void update(User user) {
        if (user == null) {
            this.error("Usuário não fornecido.");
        }
        this.model.update(user);
    }

    public void delete(int id) {
        this.model.delete(id);
    }

    private void error(String message) {
        System.out.println(message);
    }
}
