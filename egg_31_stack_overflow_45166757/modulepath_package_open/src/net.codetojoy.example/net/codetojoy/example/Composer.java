
package net.codetojoy.example;

public class Composer {
    private final String name;
    private final String era;

    public Composer(String name, String era) {
        this.name = name;
        this.era = era;
    }

    public String toString() {
        return "composer: " + name + " , era: " + era;
    }
}
