class DatabaseController {
    private IDatabaseAccessProxy dbHandle;

    public DatabaseController(IDatabaseAccessProxy dbHandle) {
        this.dbHandle = dbHandle;
    }

    public void addClient() {
        System.out.println("Adding client...");
        dbHandle.commit();
    }

    public void removeClient() {
        System.out.println("Removing client...");
        dbHandle.rollback();
    }

    public void modifyOrder() {
        System.out.println("Modifying order...");
        dbHandle.commit();
    }

    public void addOrder() {
        System.out.println("Adding order...");
        dbHandle.commit();
    }

    public void removeOrder() {
        System.out.println("Removing order...");
        dbHandle.rollback();
    }
}