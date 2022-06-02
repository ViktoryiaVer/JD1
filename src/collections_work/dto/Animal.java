package collections_work.dto;

import collections_work.api.INickHandler;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Animal implements INickHandler, Comparable<Animal> {
    private int age;
    private String nick;

    public Animal() {
    }

    public Animal(int age, String nick) {
        this.age = age;
        this.nick = nick;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(nick, animal.nick);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, nick);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", nick='" + nick + '\'' +
                '}';
    }


    @Override
    public int compareTo(@NotNull Animal o) {
        return this.nick.compareTo(o.nick);
    }
}
