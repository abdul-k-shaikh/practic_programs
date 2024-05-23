package com.test.leetcode;

abstract class Persistence {
    abstract void persist();
}
class FilePersistence extends Persistence {
    @Override
    void persist() {
        System.out.println("Data has been persisted to a file.");
    }
}

class DatabasePersistence extends Persistence {
    @Override
    void persist() {
        System.out.println("Data has been persisted to a database.");
    }
}

class Client {
    public static void main(String[] args) {
        // This could be replaced with more complex logic to determine which persistence type to use.
        Persistence persistence = getPersistenceObject(args[0]);
        
        // Client invokes persist method without knowing the specific type of persistence.
        persistence.persist();
    }

    private static Persistence getPersistenceObject(String persistenceType) {
        if ("file".equalsIgnoreCase(persistenceType)) {
            return new FilePersistence();
        } else if ("database".equalsIgnoreCase(persistenceType)) {
            return new DatabasePersistence();
        } else {
            throw new IllegalArgumentException("Unknown persistence type: " + persistenceType);
        }
    }
}