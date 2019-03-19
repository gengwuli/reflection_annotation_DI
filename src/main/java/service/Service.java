package service;

import dao.DB;

@DbConfig(dbName = "mongo")
public class Service {
    private DB db;

    public void checkConnection() {
        db.connect();
    }
}
