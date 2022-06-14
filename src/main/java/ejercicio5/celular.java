package ejercicio5;

public class celular {
    private String[] programasAbiertos;
    private String consumoRAM;
    private String consumoCPU;
    private IState state;

    public void setState(IState state ) {
        this.state = state;
    }

    public IState getState() {
        return state;
    }

    public void request() {
        state.handler();
    }

    public String[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public String getConsumoRAM() {
        return consumoRAM;
    }

    public void setConsumoRAM(String consumoRAM) {
        this.consumoRAM = consumoRAM;
    }

    public String getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(String consumoCPU) {
        this.consumoCPU = consumoCPU;
    }
}
