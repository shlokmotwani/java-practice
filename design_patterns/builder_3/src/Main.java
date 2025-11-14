//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computer computer = Computer
                .builder()
                .setCPU("AMD Ryzen 7")
                .setGPU("NVIDIA RTX 4080")
                .setRAM(16)
                .setOS("Windows 11")
                .build();
    }
}