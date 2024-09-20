import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(String language) {
        if (containsLanguage(language)) {
            languages.remove(language);
        }
        languages.add(language);
    }

    public void removeLanguage(String language) {
        if (containsLanguage(language)) {
            languages.remove(language);
        }
    }

    public String firstLanguage() {
        if (isEmpty())
            return "Language list is empty!";
        return languages.get(0);
    }

    public int count() {
        if (isEmpty()) {
            return 0;
        }

        List<String> tempLanguages = new ArrayList<>();
        tempLanguages = languages.stream().distinct().toList();
        return tempLanguages.size();
    }

    public boolean containsLanguage(String language) {
        return !languages.isEmpty() && languages.contains(language);
    }

    public boolean isExciting() {
        return !languages.isEmpty() && (languages.contains("Java") || languages.contains("Kotlin"));
    }

}
