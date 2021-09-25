package strategy;

public class TelecomOperator {

    private PlanStrategy strategy;

    public void activatePlan(PlanStrategy strategy) {
        this.strategy = strategy;
    }

    public int getFreeSMS() {
        return strategy.getFreeSMS();
    }

    public int getFreeTalkTime() {
        return strategy.getFreeTalkTime();
    }

    public String getPlanName(){
        return strategy.getPlanName();
    }
    
}
