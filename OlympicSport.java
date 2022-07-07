
public class OlympicSport extends Sport {
    float cost_pro;
    public Equipment equipment;

    public OlympicSport(String name1, float number_hour1, int number_week1, float cost_pro1) {
        name = name1;
        number_hour = number_hour1;
        number_week = number_week1;
        cost_pro = cost_pro1;
        equipment = new Equipment();
    }

    // @overide
    public float CalculateCostTraining() {
        float cost_training = (cost_hour * number_hour * number_week) + cost_pro;
        return cost_training;

    }

   
}
