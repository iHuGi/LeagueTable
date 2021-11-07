package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("Liga NOS");

        Team<FootballPlayer> sporting = new Team<>("Sporting");
        Team<FootballPlayer> porto = new Team<>("Porto");
        Team<FootballPlayer> benfica = new Team<>("Benfica");
        Team<FootballPlayer> braga = new Team<>("Braga");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");

        footballLeague.add(sporting);
        footballLeague.add(porto);
        footballLeague.add(benfica);
        footballLeague.add(braga);

        benfica.matchResult(braga, 1, 0);
        benfica.matchResult(sporting, 3, 8);
        sporting.matchResult(braga, 2, 1);

        footballLeague.showLeagueTable();

    }
}
