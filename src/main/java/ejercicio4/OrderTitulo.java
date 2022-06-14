package ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class OrderTitulo implements IOrderDB {

    @Override
    public void orderUsers(List<User> users) {
        System.out.println();
        List<User> orderTitulo = new LinkedList<User>();
        for (User user :orderTitulo) {
            orderTitulo.add(user);
        }
        char last = 'z';
        while (orderTitulo.size() != users.size()) {
            last = 'z';
            User lastUser = null;
            for (User usuario : users) {
                if (usuario.getTitulo().charAt(0) < last && !orderTitulo.contains(usuario)) {
                    last = usuario.getTitulo().charAt(0);
                    lastUser = usuario;
                }
            }
            orderTitulo.add(lastUser);
        }
        for (User usuario : orderTitulo) {
            usuario.mostrarInfo();
            System.out.println();
        }
    }

}
