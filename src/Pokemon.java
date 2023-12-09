import java.util.Objects;

public class Pokemon {

    private String sound;
    private String food;

    public Pokemon(String soundPokemon, String foodPokemon) {
        this.sound = soundPokemon;
        this.food = foodPokemon;

    }

    public String getSound() {
        return this.sound;
    }
    public void setSound(String sound) {
        if (sound != null && !sound.isEmpty()) {
            this.sound = sound;
        }

    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "sound='" + sound + '\'' +
                ", food='" + food + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(sound, pokemon.sound) && Objects.equals(food, pokemon.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sound, food);
    }
}
