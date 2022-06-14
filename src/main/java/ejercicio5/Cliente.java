package ejercicio5;

import java.util.Arrays;

public class Cliente {
    public static void main(String arg[]){
        celular celular = new celular();

        IState state1 = new Apagado(celular);
        IState state2 = new Reiniciar(celular);
        IState state3 = new Prendido(celular);

        celular.setState(state1);
        celular.request();
        System.out.println("APAGADO");
        System.out.println(celular.getConsumoCPU());
        System.out.println(celular.getConsumoRAM());
        System.out.println(Arrays.toString(celular.getProgramasAbiertos()));
        System.out.println();

        System.out.println("REINICIAR");
        celular.setState(state2);
        celular.request();
        System.out.println(celular.getConsumoCPU());
        System.out.println(celular.getConsumoRAM());
        System.out.println(Arrays.toString(celular.getProgramasAbiertos()));
        System.out.println();

        celular.setState(state3);
        celular.request();
        System.out.println("PRENDIDO");
        System.out.println(celular.getConsumoCPU());
        System.out.println(celular.getConsumoRAM());
        System.out.println(Arrays.toString(celular.getProgramasAbiertos()));
        System.out.println();

    }
}
