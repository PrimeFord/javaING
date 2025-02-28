class Car {
    public void horsePower() {
        System.out.println("How powerful is the car");
    }
}

class Benz extends Car {
    public void horsePower() {
        System.out.println("Benz GLE63s Coupe has 700 brake horse power");
    }
}

class BMW extends Car {
    public void horsePower() {
        System.out.println("BMW x6 M-competition has 850 brake horse power");
    }
}

class AstonMarton extends Car {
    public void horsePower() {
        System.out.println("Aston Marton DBS 707 has 707 brake horse power");
    }
}

class Polymorphism {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car myBenz = new Benz();
        Car myBMW = new BMW();
        Car myAstonMarton = new AstonMarton();

        myCar.horsePower();
        myBenz.horsePower();
        myBMW.horsePower();
        myAstonMarton.horsePower();
    }
}