public class Pizza {

    private boolean completarPizza;
    private boolean realizarOrden;
    private String ingredientesEspeciales;

    private TIPOSALSA tipoSalsa;
    private TIPOMASA tipoMasa;
    private TOPPINGS toppings;

    // Constructor vacio
    public Pizza() {
        this.completarPizza = false;
        this.realizarOrden = false;
        this.ingredientesEspeciales = "";
    }

    // Constructor con masa, salsa y topping
    public Pizza(
        TIPOMASA tipoMasa,
        TIPOSALSA tipoSalsa,
        TOPPINGS toppings
    ) {
        this.tipoMasa = tipoMasa;
        this.tipoSalsa = tipoSalsa;
        this.toppings = toppings;

        this.completarPizza = false;
        this.realizarOrden = false;
        this.ingredientesEspeciales = "";
    }

    // =====================================
    // COMPLETAR PIZZA
    // =====================================

    public boolean isCompletarPizza() {
        return completarPizza;
    }

    public void setCompletarPizza(boolean completarPizza) {
        this.completarPizza = completarPizza;
    }

    // =====================================
    // REALIZAR ORDEN
    // =====================================

    public boolean isRealizarOrden() {
        return realizarOrden;
    }

    public void setRealizarOrden(boolean realizarOrden) {
        this.realizarOrden = realizarOrden;
    }

    // =====================================
    // INGREDIENTES ESPECIALES
    // =====================================

    public String getIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(
        String ingredientesEspeciales
    ) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // =====================================
    // TIPO DE SALSA
    // =====================================

    public TIPOSALSA getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(TIPOSALSA tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    // =====================================
    // TIPO DE MASA
    // =====================================

    public TIPOMASA getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(TIPOMASA tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    // =====================================
    // TOPPINGS
    // =====================================

    public TOPPINGS getToppings() {
        return toppings;
    }

    public void setToppings(TOPPINGS toppings) {
        this.toppings = toppings;
    }
}