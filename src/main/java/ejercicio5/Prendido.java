package ejercicio5;

import java.util.Random;

public class Prendido implements IState {
    private celular celular;

    public Prendido(celular celular){
        this.celular = celular;
    }

    @Override
    public void handler() {
        Random random = new Random();
        int numerorandom= random.nextInt(20) + 1;
        String[] programasabiertos=new String[numerorandom];
        for (int i = 0; i < programasabiertos.length; i++) {
            programasabiertos[i]="Programa"+(i+1);
        }
        celular.setProgramasAbiertos(programasabiertos);
        celular.setConsumoCPU((numerorandom*5)+"%");
        celular.setConsumoRAM((numerorandom*5)+"%");
    }
}