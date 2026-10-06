public class Pizza {

    private boolean completarPizza;
    private boolean realizarOrden;
    private String ingredientesEspeciales;

    private TIPOSALSA tipoSalsa;
    private TIPOMASA tipoMasa;
    private TOPPINGS toppings;

    public Pizza() {
        this.completarPizza = false;
        this.realizarOrden = false;
        this.ingredientesEspeciales = "";
    }

    public Pizza(TIPOMASA tipoMasa, TIPOSALSA tipoSalsa, TOPPINGS toppings) {
        this.tipoMasa = tipoMasa;
        this.tipoSalsa = tipoSalsa;
        this.toppings = toppings;
    }

    public TIPOMASA getTipoMasa() {
        return tipoMasa;
    }

    public TIPOSALSA getTipoSalsa() {
        return tipoSalsa;
    }

    public TOPPINGS getToppings() {
        return toppings;
    }
}