package com.burabury.obiektowosc.zadania.zadanie1;

import static com.burabury.obiektowosc.zadania.zadanie1.Team.countOfMembers;

public class MainClass {
    public static void main(String[] args) {
        Member member = new Member("Paulina", "bura.bury@gmail.com");
        Member member1 = new Member("Jakub", "buraczek@gmail.com");
        Member member2 = new Member("Bercik", "bercik@gmail.com");
        Member member3 = new Member("Patryk", "patryk@gmail.com");
        Member member4 = new Member("Jezus", "chrystus@gmail.com");

        member.getId();
        member.getName();
        member.getEmail();

        Team team = new Team("Orzeszki", member, member1, member2, member3, member4);
        System.out.println(countOfMembers(team));

        System.out.println(team.toString());
    }
}
