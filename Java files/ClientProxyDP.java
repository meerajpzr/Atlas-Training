import java.util.Objects;

interface DBExecutor {
    void runQuery(String type);
}

class DB {
    DB() { }

    void runIt(String type, String id) {
        System.out.println("User: " + id + " | Running query: " + type);
    }
}

class DBProxy implements DBExecutor {
    String id;
    DB db;

    public DBProxy(String id) {
        this.id = id;
        this.db = new DB();
    }

    @Override
    public void runQuery(String type) {
        // Restrict DELETE for non-admin users
        if (type.equalsIgnoreCase("DELETE") && !Objects.equals(this.id, "ADMIN")) {
            System.out.println("Sorry, access denied for user: " + this.id);
            return;
        }
        db.runIt(type, this.id);
    }
}

public class ClientProxyDP {
    public static void main(String[] args) {
        DBExecutor obj1 = new DBProxy("ADMIN");
        obj1.runQuery("READ");
        obj1.runQuery("UPDATE");
        obj1.runQuery("DELETE");

        System.out.println("---------------");

        DBExecutor obj2 = new DBProxy("MANAGER");
        obj2.runQuery("READ");
        obj2.runQuery("UPDATE");
        obj2.runQuery("DELETE");
    }
}
