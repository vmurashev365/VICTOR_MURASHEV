package homework_nr_8;


import java.util.HashSet;

public class englishRomanianDictionary {
    public static void main(String[] args) {
        // Creating English-Romanian Dictionary
        HashSet<String> dictionary = createDictionary();

        // Method to display header of the Dictionary
        System.out.println("English-Romanian Dictionary:");
        displayDictionary(dictionary);
    }

    // Method to create English-Romanian Dictionary, including non-unique values
    public static HashSet<String> createDictionary() {
        HashSet<String> dictionary = new HashSet<>();
        dictionary.add("apple - măr");
        dictionary.add("table - masă");
        dictionary.add("flower - floare");
        dictionary.add("sun - soare");
        dictionary.add("water - apă");
        dictionary.add("pen - stilou");
        dictionary.add("house - casă");
        dictionary.add("road - drum");
        dictionary.add("chair - scaun");
        dictionary.add("book - carte");
        dictionary.add("water - apă");
        dictionary.add("chair - scaun");
        return dictionary;
    }

    // Method to display uniques word-pairs from the Dictionary
    public static void displayDictionary(HashSet<String> dictionary) {
        for (String entry : dictionary) {
            System.out.println(entry);
        }
    }
}
