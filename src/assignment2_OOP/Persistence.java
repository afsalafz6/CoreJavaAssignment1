package assignment2_OOP;

abstract class Persistence {
    public abstract void persist();

    public static void main(String[] args) {
        Persistence p1 = new FilePersistence();
        p1.persist();
    }
}

class FilePersistence extends Persistence {

    @Override
    public void persist() {
        System.out.println("inside FilePersistence");
    }
}

class DatabasePersistence extends Persistence {

    @Override
    public void persist() {
        System.out.println("inside DatabasePersistence");
    }
}

//class Client {
//    Persistence p1 = new FilePersistence();
//}


