public class ElectricPokemon extends Pokemon {

    private String electricity;
    public ElectricPokemon(String attackPokemon, String speedPokemon, String electricity) {
        super(attackPokemon, speedPokemon, electricity);
        this.electricity = electricity;
    }

    public String getElectricity() {
        return electricity;
    }

    public void setElectricity(String electricity) {
        this.electricity = electricity;
    }
}
