public class Match {
    protected Tournament tournament;
    protected Participant participant1;
    protected Participant participant2;
    protected String result;

    public Match(Tournament tournament, Participant participant1, Participant participant2)
    {
        this.tournament = tournament;
        this.participant1 = participant1;
        this.participant2 = participant2;
        result = "Pending";
    }
    public String getResult()
    {
        return result;
    }
    public Tournament getTournament()
    {
        return tournament;
    }
    public Participant getParticipant1()
    {
        return participant1;
    }
    public Participant getParticipant2()
    {
        return participant2;
    }
    public void setTournament(Tournament tournament)
    {
        this.tournament = tournament;
    }
    public void setParticipant1(Participant participant1)
    {
        this.participant1 = participant1;
    }
    public void setParticipant2(Participant participant2)
    {
        this.participant2 = participant2;
    }
    public void setResult(String result)
    {
        this.result = result;
    }

    @Override
    public String toString()
    {
        return "Match in " + tournament.getName() + " - " + participant1.getName() + " vs " + participant2.getName() + " - " + result;
    }
}
