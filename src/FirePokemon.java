public class FirePokemon extends Pokemon {

    private String vuurSpuwen;

    public FirePokemon(String soundPokemon, String foodPokemon, String vuurSpuwen) {

        super(soundPokemon, foodPokemon, vuurSpuwen);
        this.vuurSpuwen = vuurSpuwen;
    }

    public String getVuurSpuwen() {
        return vuurSpuwen;
    }

    public void setVuurSpuwen(String vuurSpuwen) {
        this.vuurSpuwen = vuurSpuwen;
    }
}

