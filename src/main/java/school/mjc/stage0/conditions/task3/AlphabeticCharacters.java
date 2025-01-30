package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        character = Character.toLowerCase(character);
        if (Character.isLetter(character)&& character>='a' && character<='z') {
//                if (character == 'A'|| character == 'E'|| character == 'I'|| character == 'O'|| character == 'U' || character== 'a' || character == 'e' || character == 'i' || character == 'o') {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o') {
                System.out.println("Vowel");
            } else
                System.out.println("Consonant");
        } else
            System.out.println("wrong alphabet!");
    }
}
//    A
//            E
//    I
//            O
//    U
