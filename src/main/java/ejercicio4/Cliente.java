package ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        User user1 = new User("el principito", 47046, "infantil");
        User user2 = new User("divergente", 4845, "fantacia");
        User user3 = new User( "elperfume", 7628,"suspenso");

        List<User> users = new LinkedList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        dataBase.setUsers(users);

        OrderID orderID = new OrderID();
        dataBase.setOrderDB(orderID);
        dataBase.ordering();

        OrderTitulo orderTitulo = new OrderTitulo();
        dataBase.setOrderDB(orderTitulo);
        dataBase.ordering();


        OrderCategoria orderCategoria =new OrderCategoria();
        dataBase.setOrderDB(orderCategoria);
        dataBase.ordering();
    }
}
