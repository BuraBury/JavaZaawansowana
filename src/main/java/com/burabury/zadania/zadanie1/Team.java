package com.burabury.zadania.zadanie1;

import java.util.Arrays;

public class Team {
    private final String name;
    private final Member[] members;

    public Team(String name, Member... members) {
        this.name = name;
        this.members = members;
    }

    public static int countOfMembers(Team team) {
        return team.members.length;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name +
                ",\n members=" + Arrays.toString(members) +
                '}';
    }
}
