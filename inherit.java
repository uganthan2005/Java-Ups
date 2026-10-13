class inherit {
    class Animal {
        void sound() {
            String sound = "";
        }
    }
    class Dog extends Animal {
        void sound() {
            String sound = "Woof!";
            System.out.println(sound);
        }
    }
    class Cat extends Animal {
        void sound() {
            String sound = "Meow!";
            System.out.println(sound);
        }
    }
    class dove extends Animal {
        void sound() {
            String sound = "Coo!";
            System.out.println(sound);
        }
    }
    public static void main(String[] args) {
        inherit outer = new inherit();
        Dog dog = outer.new Dog();
        dog.sound(); 
        Cat cat=outer.new Cat();
        cat.sound();
        dove dove=outer.new dove();
        dove.sound();
    }
}