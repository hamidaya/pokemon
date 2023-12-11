public class WaterPokemon extends Pokemon {

    private String badkleding;

    public WaterPokemon(String swimPokemon, String breathPokemon, String expertise, String badkleding)
    {
        super(swimPokemon, breathPokemon, expertise);
        this.badkleding = badkleding;



    }

    public String getBadkleding() {
        return badkleding;
    }

    public void setBadkleding(String badkleding) {
        this.badkleding = badkleding;
    }
}
