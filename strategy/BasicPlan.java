package strategy;

public class BasicPlan implements PlanStrategy {

    @Override
    public int getFreeSMS() {
        return 20;
    }

    @Override
    public int getFreeTalkTime() {
        return 25;
    }

    @Override
    public String getPlanName() {
        return "Basic";
    }
    
}
