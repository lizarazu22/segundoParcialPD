package ejercicio4;

import java.util.LinkedList;
import java.util.List;

public class OrderID implements IOrderDB {

    @Override
    public void orderUsers(List<User> users) {
        System.out.println();
        List<User> ordered = new LinkedList<User>();
        int last = Integer.MAX_VALUE;
        while (ordered.size() != users.size()) {
            last = Integer.MAX_VALUE;
            User lastUser = null;
            for (User usuario : users) {
                if (usuario.getId() < last && !ordered.contains(usuario)) {
                    last = usuario.getId();
                    lastUser = usuario;
                }
            }
            ordered.add(lastUser);
        }
        for (User usuario : ordered) {
            usuario.mostrarInfo();
            System.out.println();
        }
    }

}
