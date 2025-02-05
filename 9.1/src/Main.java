public class Main {
    public static void main(String[] args) {
        DBAccess realDB = new DBAccess("jdbc:mysql://localhost:3306/mydb");
        DBAccessProxy dbProxy = new DBAccessProxy(realDB);
        DatabaseController controller = new DatabaseController(dbProxy);

        dbProxy.open();
        controller.addClient();
        controller.modifyOrder();
        dbProxy.close();
    }
}