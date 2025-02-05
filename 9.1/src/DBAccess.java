import java.util.ArrayList;
import java.util.List;

class DBAccess implements IDatabaseAccessProxy {
    private String url;
    private boolean isOpen;

    public DBAccess(String url) {
        this.url = url;
        this.isOpen = false;
    }

    @Override
    public List<Object> executeQuery(int[] lineNumbers) {
        System.out.println("Executing query in DBAccess...");
        return new ArrayList<>();
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        System.out.println("Executing query without result in DBAccess...");
    }

    @Override
    public boolean checkDatabaseStatus() {
        return isOpen;
    }

    @Override
    public void open() {
        isOpen = true;
        System.out.println("Database opened.");
    }

    @Override
    public void close() {
        isOpen = false;
        System.out.println("Database closed.");
    }

    @Override
    public void commit() {
        System.out.println("Transaction committed.");
    }

    @Override
    public void rollback() {
        System.out.println("Transaction rolled back.");
    }
}