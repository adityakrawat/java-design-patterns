package command;

public class CommandMain {

    public static void main(String... args) {

        Light light = new Light();
        Fan fan = new Fan();

        RemoteControl control = new RemoteControl();

        control.setCommand(new StartFanCommand(fan));
        control.buttonPressed();

        control.setCommand(new StopFanCommand(fan));
        control.buttonPressed();

        control.setCommand(new TurnOnLightCommand(light));
        control.buttonPressed();

        control.setCommand(new TurnOffLightCommand(light));
        control.buttonPressed();

    }    
}
