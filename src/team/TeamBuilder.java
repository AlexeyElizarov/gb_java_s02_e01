package team;

public class TeamBuilder {

    public static Member[] build(String name1, String name2, String name3, String name4) {
        return new Member[] {
                new Member(name1),
                new Member(name2),
                new Member(name3),
                new Member(name4)
        };
    }
}
