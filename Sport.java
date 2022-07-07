
public class Sport extends SportGame implements SecondarySport {
    String name;
    float number_hour;
    int number_week;
    public static float cost_hour = 15;

    public Sport() {
        name = "";
        number_hour = 0.00f;
        number_week = 0;

    }

    public Sport(String name1, float number_hour1, int number_week1) {
        name = name1;
        number_hour = number_hour1;
        number_week = number_week1;

    }

    public float CalculateCostTraining() {
        float cost_training = cost_hour * number_hour * number_week;
        return cost_training;

    }

    public String toString() {
        return name;

    }

    public double cost_pro() {
        double cost_year1 = 2013;
        double cost_year2 = 2014;
        return cost_year1 + cost_year2;
    }

    @Override
    public double SumPro() {
        double cost_year1 = 2013;
        double cost_year2 = 2014;
        return cost_year1 + cost_year2;
    }
}
