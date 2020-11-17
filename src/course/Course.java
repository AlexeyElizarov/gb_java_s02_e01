package course;

import team.Member;
import team.Team;

import java.util.Random;

/**
Добавить класс Course (полоса препятствий), в котором будут находиться:
    массив препятствий, -> Bunker[] bunkers
    метод который будет просить команду пройти всю полосу; -> doIt(team)
 */

public class Course {
    private Bunker[] bunkers = CourseBuilder.build();

    public void doIt(Team team) {
        for (Member member: team.getMembers()) {
            member.setPassed(true);
            for (Bunker bunker: bunkers) {
                if (!bunker.pass()) {
                    member.setPassed(false);
                    break;
                }
            }

        }
    }

}


