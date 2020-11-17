import course.Course;
import external.ExternalDocumentManager;
import team.Member;
import team.Team;
import team.TeamBuilder;



public class Main {
    public static void main(String[] args) {

        // check

        TeamDemo();

    }

    public static void TeamDemo() {

        Member[] members = TeamBuilder.build("Huey", "Dewey", "Louie", "Webby");

        Course c = new Course();
        Team team = new Team("DuckTales", members);
        c.doIt(team);
        team.showResults();
    }

    public static void DocumentDemo() {
        ExternalDocumentManager manager = new ExternalDocumentManager();
        manager.manage();
    }
}
