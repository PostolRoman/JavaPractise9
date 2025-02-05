import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


class DBAccessProxy implements IDatabaseAccessProxy {
    private DBAccess dbHandle;

    public DBAccessProxy(DBAccess dbHandle) {
        this.dbHandle = dbHandle;
    }

    @Override
    public List<Object> executeQuery(int[] lineNumbers) {
        System.out.println("Proxy: Logging execution time...");
        LocalTime startTime = LocalTime.now();

        List<Object> result = dbHandle.executeQuery(lineNumbers);

        LocalTime endTime = LocalTime.now();
        System.out.println("Proxy: Time elapsed: " + (endTime.toNanoOfDay() - startTime.toNanoOfDay()) / 1_000_000 + " ms");

        return result;
    }

    @Override
    public void executeQueryNoResult(int[] lineNumbers) {
        dbHandle.executeQueryNoResult(lineNumbers);
    }

    @Override
    public boolean checkDatabaseStatus() {
        return dbHandle.checkDatabaseStatus();
    }

    @Override
    public void open() {
        dbHandle.open();
    }

    @Override
    public void close() {
        dbHandle.close();
    }

    @Override
    public void commit() {
        dbHandle.commit();
    }

    @Override
    public void rollback() {
        dbHandle.rollback();
    }
}