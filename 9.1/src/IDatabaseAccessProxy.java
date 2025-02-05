import java.util.List;

interface IDatabaseAccessProxy {
    List<Object> executeQuery(int[] lineNumbers);
    void executeQueryNoResult(int[] lineNumbers);
    boolean checkDatabaseStatus();
    void open();
    void close();
    void commit();
    void rollback();
}