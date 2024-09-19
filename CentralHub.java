import java.util.Scanner;

public class CentralHub {
    public static void main(String[] args) {

        Control control = new Control();
        Lights lights = new Lights();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\nControl Menu");
            System.out.println("1. Lights");
            System.out.println("2. Thermostat");
            System.out.println("3. Music Player");
            System.out.println("4. Exit");
            System.out.print("\nControl a Device. Select Device Number to continue: ");

            int number = input.nextInt();

            switch (number) {
                case 1: 
                    while (true) {
                        System.out.println("\nLIGHT SETTINGS");
                        System.out.println("1. Switch On");
                        System.out.println("2. Switch Off");
                        System.out.println("3. Set Brightness");
                        System.out.println("4. Back");
                        System.out.println("5. Exit");

                        System.out.print("\nSelect Setting Number: ");

                        int setting = input.nextInt();

                        switch (setting) {
                            case 1:
                                control.setCommand(new PowerOn(lights));
                                control.select();
                                break;
                            case 2:
                                control.setCommand(new PowerOff(lights));
                                control.select();
                                break;
                            case 3:
                                System.out.print("\nSet brightness (0-100): ");
                                int value = input.nextInt();
                                control.setCommand(new SetBrightness(lights, value));
                                control.select();
                                break;
                            case 4:
                                break;
                            case 5:
                                System.out.println("\nControl Hub closing.");
                                input.close();
                                System.exit(0);
                                break;
                            default:
                                System.out.println("\nInvalid! Please try again.");
                                break;
                        }

                        if (setting == 4 || setting == 5) {
                            break;
                        }
                    }
                    break;

                case 2: 
                    while (true) {
                        System.out.println("\nThermostat Settings");
                        System.out.println("1. Run");
                        System.out.println("2. Power Off");
                        System.out.println("3. Set Temperature ");
                        System.out.println("4. Back ");
                        System.out.println("5. Exit");
                        System.out.print("\nSelect Setting Number: ");

                        int setting = input.nextInt();

                        switch (setting) {
                            case 1:
                                control.setCommand(new PowerOn(thermostat));
                                control.select();
                                break;
                            case 2:
                                control.setCommand(new PowerOff(thermostat));
                                control.select();
                                break;
                            case 3:
                                System.out.print("\nSet temperature (16-31°C): ");
                                int temperature = input.nextInt();
                                control.setCommand(new SetTemperature(thermostat, temperature));
                                control.select();
                                break;
                            case 4:                           
                                break;
                            case 5:
                                System.out.println("\nControl Hub exited.");
                                input.close();
                                System.exit(0);
                                break;
                            default:
                                System.out.println("\nInvalid Setting! Please try again.");
                                break;
                        }

                        if (setting == 4 || setting == 5) {
                            break;
                        }
                    }
                    break;

                case 3: 
                    while (true) {
                        System.out.println("\nMusic Player Settings");
                        System.out.println("1. Use");
                        System.out.println("2. Power Off");
                        System.out.println("3. Set Volume");
                        System.out.println("4. Back");
                        System.out.println("5. Exit");
                        System.out.print("\nSelect Control: ");

                        int setting = input.nextInt();

                        switch (setting) {
                            case 1:
                                control.setCommand(new PowerOn(musicPlayer));
                                control.select();
                                break;
                            case 2:
                                control.setCommand(new PowerOff(musicPlayer));
                                control.select();
                                break;
                            case 3:
                                System.out.print("\nSet volume level (0-100): ");
                                int volume = input.nextInt();
                                control.setCommand(new SetVolume(musicPlayer, volume));
                                control.select();
                                break;
                            case 4:
                                break;
                            case 5:
                                System.out.println("\nControl Hub exited.");
                                input.close();
                                System.exit(0);
                                break;
                            default:
                                System.out.println("\nInvalid Setting! Please try again.");
                                break;
                        }

                        if (setting == 4 || setting == 5) {
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("\nControl Hub exited.");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("\nNo Device is registered to that number. Please try again.");
                    break;
            }
        }
    }
}
