package com.yaroslav.java.core;

public class Main {
    public static void main(String[] args) {
        JumpRun[] members = {
                new Human(3, 1, "Petya"),
                new Human(2, 3, "Slava"),
                new Cat(4, 3, "Catotron"),
                new Cat(2, 2, "Burii"),
                new Robot(1, 8, "Robocop"),
                new Robot(3,6, "Terminator")
        };

        Let[] lets = {
                new Treadmill (2),
                new Treadmill(6),
                new Wall(1),
                new Wall(3)
        };

        for (JumpRun member : members) {
            System.out.println("К препятствию приглашается " + member);
            boolean winner = true;
            for (Let let : lets) {
                System.out.println(member + " пробует пройти " + let);
                if (let.toJump(member.getMaxHeight()) ||
                        let.toRun(member.getMaxLength())) {
                    System.out.println("У него получтлось. ");
                } else {
                    winner = false;
                    System.out.println("Потренируйтесь , у вас не получилось. ");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " дистанция пройдена.");
            } else {
                System.out.println(member + " вы - слабое звено , вы - проиграли.");
            }
            System.out.println();
        }
    }
}