package Enum;

public enum Dictionary {
    LAMB("ягненок"),
    CAT("кот"),
    DOG("собака"),
    BIRD("птица"),
    FISH("рыба"),
    HORSE("лошадь"),
    COW("корова"),
    PIG("свинья"),
    SHEEP("овца");

    private final String value;

    Dictionary(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
