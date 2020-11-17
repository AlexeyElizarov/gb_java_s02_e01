package team;

/**
 * 2. Добавить класс Team, который будет содержать:
 *      название команды, -> String title
 *      массив из 4-х участников (т.е. в конструкторе можно сразу всех участников указывать) -> Member[] members
 *      метод для вывода информации о членах команды прошедших дистанцию -> showPassedMembers()
 *      метод вывода информации обо всех членах команды. -> showAllMembers()
 */


public class Team {
    private final String title;
    private final Member[] members;

    public Member[] getMembers() {
        return members;
    }

    public Team(String title, Member[] member) {
        this.title = title;
        this.members = member;
    }

    public void showPassed() {
        for (Member member: members) {
            if (member.isPassed()) {
                System.out.printf("%s passed the course.\n", member.getName());
            }
        }
    }

    public void showResults() {
        System.out.printf("Team \"%s\":\n", title);
        for (Member member: members) {
                System.out.printf("Name: %s. Passed: %b\n", member.getName(), member.isPassed());
            }
        }
    }
