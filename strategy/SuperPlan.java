package strategy;

public class SuperPlan implements PlanStrategy {

    @Override
    public int getFreeSMS() {
        return 200;
    }

    @Override
    public int getFreeTalkTime() {
        return 250;
    }

    @Override
    public String getPlanName() {
        return "Super";
    }
    
}
