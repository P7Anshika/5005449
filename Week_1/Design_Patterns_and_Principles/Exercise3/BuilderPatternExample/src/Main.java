public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB ")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .build();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}
