public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("sound", "food" , "expertise");
        Pokemon pokemon2 = new Pokemon("sound", "food" , "expertise");
        WaterPokemon waterPokemon = new WaterPokemon("swim", "breath", "expertise", "arena merk");
        GrassPokemon grassPokemon = new GrassPokemon("grom ", "food");
        FirePokemon firePokemon = new FirePokemon("sound", "food", "vuur spuwen");

        System.out.println(pokemon.getSound());
        System.out.println(pokemon.getFood());

        pokemon.setSound("grom");
        pokemon.setFood("banana");
        firePokemon.setExpertise("rood vuur");
        firePokemon.setExpertise("blauw vuur");

        System.out.println(pokemon.getSound());
        System.out.println(pokemon.getFood());
        System.out.println(grassPokemon.getExpertise());
        System.out.println(waterPokemon.getExpertise());
        System.out.println(waterPokemon.getBadkleding());
        System.out.println(firePokemon.getVuurSpuwen());


        System.out.println(pokemon);
        System.out.println(pokemon.equals(pokemon2));

        System.out.println(pokemon);
        System.out.println(grassPokemon.getSound());
    }

}
