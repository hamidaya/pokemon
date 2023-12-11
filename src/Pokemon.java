import java.util.Objects;

public class Pokemon {

    private String sound;
    private String food;
    private String expertise;



    public Pokemon(String soundPokemon, String foodPokemon, String expertise) {
        this.sound = soundPokemon;
        this.food = foodPokemon;
        this.expertise = expertise;
    }

    public String getExpertise() {

        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getSound() {
        return this.sound;
    }

    public void setSound(String sound) {
        if (sound != null && !sound.isEmpty()) {
            this.sound = sound;
        }

    }
        public String getFood () { return this.food; }

            public void setFood (String food) {
                if (food != null && !food.isEmpty()) {
                    this.food = food;

                }
            }

            @Override
            public String toString () {
                return "Pokemon{" +
                        "sound='" + sound + '\'' +
                        ", food='" + food + '\'' +
                        '}';
            }

            @Override
            public boolean equals (Object o){
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pokemon pokemon = (Pokemon) o;
                return Objects.equals(sound, pokemon.sound) && Objects.equals(food, pokemon.food);
            }

            @Override
            public int hashCode () {
                return Objects.hash(sound, food);
            }

}
