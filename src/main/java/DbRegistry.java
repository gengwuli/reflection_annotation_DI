import dao.DB;
import dao.DbMongo;
import dao.DbMysql;

import java.util.HashMap;
import java.util.Map;

public class DbRegistry {
    private static Map<String, DB> registryMap = new HashMap<String, DB>();
    static {
        registryMap.put("mysql", new DbMysql());
        registryMap.put("mongo", new DbMongo());
    }
    public static DB getDb(String dbName) {
        if (!registryMap.containsKey(dbName)) {
            throw new RuntimeException("DB is not registered");
        }
        return registryMap.get(dbName);
    }
}
