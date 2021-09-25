package command;

public class TurnOnLightCommand implements Command {

    Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light; 
    }

    @Override
    public void execute() {
        System.out.println("Turning on light...");
        light.turnOn();
    }
    

}
