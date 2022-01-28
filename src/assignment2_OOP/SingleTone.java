package assignment2_OOP;

class SingleTone {
    private static SingleTone stObject;

    //private constructor- singleton class will contain a private constructor
    private SingleTone() {
    }

    //while creating object of singleton obj , check it has already an obj, if not create an object.
    public static SingleTone getInstance() {

        // create object if it's not already created
        if(stObject == null) {
            stObject = new SingleTone();
        }

        // returns the singleton object
        return stObject;
    }

    public void getConnection() {
        System.out.println("You are now connected to the Singletone Class.");
    }
}

class Main {
    public static void main(String[] args) {
        SingleTone st1;

        // refers to the only object of SingleTone
        st1= SingleTone.getInstance();

        st1.getConnection();
    }
}

