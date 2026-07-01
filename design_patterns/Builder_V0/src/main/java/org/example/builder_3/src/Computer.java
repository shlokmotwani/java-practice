public class Computer {
    private final String cpu;
    private final int ramGB;
    private final String gpu;
    private final String storageType;
    private final String operatingSystem;

    private Computer(ComputerBuilder builder){
        this.cpu = builder.cpu;
        this.ramGB = builder.ram;
        this.gpu = builder.gpu;
        this.storageType = builder.storageType;
        this.operatingSystem = builder.operatingSystem;
    }

    public String getCPU() {
        return cpu;
    }

    public int getRAM() {
        return ramGB;
    }

    public String getGPU() {
        return gpu;
    }

    public String getStorageType() {
        return storageType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return String.format("Computer having CPU: %s, RAM: %d, GPU: %s, OS: %s", cpu, ramGB, gpu, operatingSystem);
    }

    public static ComputerBuilder builder(){
        return new ComputerBuilder();
    }

    public static class ComputerBuilder{
        private String cpu;
        private int ram;
        private String gpu;
        private String storageType;
        private String operatingSystem;

        public ComputerBuilder setCPU(String cpu){
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRAM(int ram){
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setGPU(String gpu){
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder setStorage(String storageType){
            this.storageType = storageType;
            return this;
        }

        public ComputerBuilder setOS(String operatingSystem){
            this.operatingSystem = operatingSystem;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }


    }
}
