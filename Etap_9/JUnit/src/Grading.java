import org.junit.jupiter.params.aggregator.ArgumentAccessException;

public class Grading {
    public String Grade (int points){
        if (points < 0)
            throw new ArgumentAccessException("Niepoprawna liczba punktów");
        else if (points <= 49)
            return "Niedostateczny";
        else if (points <= 59)
            return "Dostateczny";
        else if (points <= 69)
            return "Dostateczny plus";
        else if (points <= 79)
            return "Dobry";
        else if (points <= 90)
            return "Dobry plus";
        else if (points <= 100)
            return "Bardzo dobry";
        else
            throw new ArgumentAccessException("Niepoprawna liczba punktów");
    }
}
