import java.util.Random;

public class Player extends Participant implements Comparable<Player>{
    int level;
    float ranking;

    public Player(String name,int level,float ranking)
    {
        super(name);
        this.level = level;
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

    @Override
    public int compareTo(Player p2) {
        int result = 5;
        if(this.getRanking()>p2.getRanking())
        {
            result = -1;
        }
        else if(this.getRanking()<p2.getRanking())
        {
            result = 1;
        }
        else if(this.getRanking()==p2.getRanking())
        {
            if(this.getName().compareTo(p2.getName())>0)
            {
                result = 1;
            }
            else if(this.getName().compareTo(p2.getName())<0)
            {
                result = -1;
            }
            else
            {
                result = 0;
            }
        }
        return result;
    }
}
