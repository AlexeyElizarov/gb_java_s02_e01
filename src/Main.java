import course.Course;
import external.ExternalDocumentManager;
import team.Member;
import team.Team;
import team.TeamBuilder;



public class Main {
    public static void main(String[] args) {

        // check

        doTeamDemo();

    }

    public static void doTeamDemo() {

        Member[] members = TeamBuilder.build("Huey", "Dewey", "Louie", "Webby");

        Course c = new Course();
        Team team = new Team("DuckTales", members);
        c.doIt(team);
        team.showResults();
    }

    public static void doDocumentDemo() {
        ExternalDocumentManager manager = new ExternalDocumentManager();
        manager.manage();
    }
}
