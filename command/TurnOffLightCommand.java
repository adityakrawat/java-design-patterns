package command;

public class TurnOffLightCommand implements Command {

    Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning off light...");
        light.turnOff();
    }
    
}
