package ejercicio5;

public class Reiniciar implements IState {
    private celular celular;

    public Reiniciar(celular celular){
        this.celular = celular;
    }

    @Override
    public void handler() {
        celular.setConsumoRAM("0%");
        celular.setConsumoCPU("0%");
        String[] var = {"Cerrados"};
        celular.setProgramasAbiertos(var);
    }
}
