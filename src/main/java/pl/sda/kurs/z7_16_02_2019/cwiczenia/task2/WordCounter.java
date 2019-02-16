package pl.sda.kurs.z7_16_02_2019.cwiczenia.task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCounter {
    private List<String> fileContent;

    public void loadFile(Path path) throws IOException {
        fileContent = Files.readAllLines(path);
    }

    /*
        public int countWords() {
            int counter = 0;
            for (String s : fileContent) {
                String[] tmp = s.split(" ");
                counter = counter + tmp.length;
            }
            return counter;
        }


        public Set<String> uniqueWords() {
            Set<String> words = new HashSet<>();
            for (String s : fileContent) {
                String[] tmp = s.split(" ");
                for (String word : tmp) {
                    words.add(word);
                }
            }
            return words;
        }*/
    public int countWords() {
        return getWords().size();
    }

    public Set<String> uniqueWords() {
        Set<String> uniqueWords = new HashSet<>();
        for (String word : getWords()) {
            uniqueWords.add(word);
        }
        return uniqueWords;
    }

    private List<String> getWords() {
        List<String> words = new ArrayList<>();
        for (String s : fileContent) {
            String[] tmp = s.split("[  , : ; ! . ( ) ?  ,]");
            List<String> lineWords = Arrays.asList(tmp);
            words.addAll(lineWords);
        }
        words.removeAll(Arrays.asList(""));
        return words;
    }

    public Map<String, Integer> countDuplicatedWords() {
        Map<String, Integer> duplicatedWords = new HashMap<>();
        List<String> wordsList = getWords();
        for (String word:wordsList) {
            if (duplicatedWords.get(word) != null) {
                duplicatedWords.replace(word, duplicatedWords.get(word) + 1);
            } else {
                duplicatedWords.put(word, 1);
            }
        }
        duplicatedWords.entrySet().removeIf(e -> e.getValue()==1);
        return duplicatedWords;
    }
}