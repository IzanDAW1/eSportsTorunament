import java.util.Random;

public class Player extends Participant{
    int level;
    float ranking;

    public Player(String name,int level,float ranking)
    {
        super(name);
        Random r = new Random();
        this.level= r.nextInt(1,101);
        this.ranking=ranking;
    }

    public int getLevel()
    {
        return level;
    }
    public float getRanking()
    {
        return ranking;
    }

    public void setLevel(int level)
    {
        this.level=level;
    }
    public void setRanking(float ranking)
    {
        this.ranking=ranking;
    }

    @Override
    public String toString() {
        return " Player: "+name+" , Level: "+level+" , Ranking: "+ranking;
    }
}
