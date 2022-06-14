package ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class OrderCategoria implements IOrderDB {

    @Override
    public void orderUsers(List<User> users) {
        System.out.println();
        List<User> orderCategoria = new LinkedList<User>();
        for (User user : orderCategoria) {
            orderCategoria.add(user);
        }
        char last = 'z';
        while (orderCategoria.size() != users.size()) {
            last = 'z';
            User lastUser = null;
            for (User usuario : users) {
                if (usuario.getCategoria().charAt(0) < last && !orderCategoria.contains(usuario)) {
                    last = usuario.getCategoria().charAt(0);
                    lastUser = usuario;
                }
            }
            orderCategoria.add(lastUser);
        }
        for (User usuario : orderCategoria) {
            usuario.mostrarInfo();
            System.out.println();
        }
    }

}

