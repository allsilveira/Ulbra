import model.User;
import controller.UserController;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        userController.add(new User("Alessandra"));
        userController.add(new User("Ygor"));
        userController.add(new User("Saiyuri"));
        userController.add(new User("Alice"));
        userController.add(new User("Vizinho"));
        System.out.println(userController.list());

        User user = userController.get(1);
        user.setName("Alessandra Silveira");
        userController.update(user);
        System.out.println(userController.list());

        userController.delete(5);
        System.out.println(userController.list());

    }
}