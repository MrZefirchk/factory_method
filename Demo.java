public class Demo {

    public static void main(String[] args){
        Character character = new Character("Akarian", ClassFactory.getClass("Rogue"));

        character.setAttributes(Stats.generate());
        character.printSheet();

    }
}