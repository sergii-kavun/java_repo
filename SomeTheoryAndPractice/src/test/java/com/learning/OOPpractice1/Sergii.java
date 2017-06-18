package com.learning.OOPpractice1;

/**
 * Created by vid4i on 18.06.2017.
 */
public final class Sergii {

    // Instance variables or fields
    protected String name;
    protected int age;
    protected long weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean askKatya(String words) {
        System.out.println("I`m asked Katya to scream my instance variables" + " "+ words);
        if (words != null ) {
            boolean sheWillScream = Katya.scream(words);
            if (sheWillScream == true) {
                return true;
            }
        }
            return false;
    }
}

