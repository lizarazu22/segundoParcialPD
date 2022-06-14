package ejercicio5;

public class Apagado implements IState {
    private celular celular;

    public Apagado(celular celular){
        this.celular = celular;
    }

    @Override
    public void handler() {
        celular.setConsumoRAM("minimo");
        celular.setConsumoCPU("minimo");
        String[] var={0+""};
        celular.setProgramasAbiertos(var);
    }
}
