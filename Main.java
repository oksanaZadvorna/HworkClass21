package HworkClass21;

public class Main {
    public static void main(String[] args) {
        Computer [] c = {
                new Apple("Apple", "MacPro", "silver", 20),
                new Lenovo("Lenovo", "ThinkPad", "black", 18),
                new HP("HP", "Aero", "white", 15),
                new Dell("Dell", "XPS", "red", 15)
        };
        for (Computer computer : c) {
            computer.exterior();
            computer.perfomance();
        }
        Computer comp = new Dell("Dell", "XPS", "red", 15);
        Dell d = (Dell) comp;
        d.origin();

        }
    }

