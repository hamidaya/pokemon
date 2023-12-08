public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("sound", "food" );
        Pokemon pokemon2 = new Pokemon("sound", "food" );
        System.out.println(pokemon.getSound());

        pokemon.setSound("grom");

        System.out.println(pokemon.getSound());

        System.out.println(pokemon);

        System.out.println(pokemon.equals(pokemon2));
    }


}
