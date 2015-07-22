package partha.explorer.manager;


import partha.explorer.utils.ApplicationConstant;
import partha.mongodb.manager.DBpublicConnector;
import partha.mongodb.manager.MongoInterface;

/**
 *
 * @author Partha
 */
public class DBManager {

    public static MongoInterface getDB() throws Exception {
        String schema = ApplicationConstant.DBSCHEMA;
        String dbUrl = ApplicationConstant.DBURL;
        Integer dbPort = Integer.parseInt(ApplicationConstant.DBPORT);
        MongoInterface db = new DBpublicConnector().getConnection(schema, dbUrl, dbPort);
        return db;
    }
}
