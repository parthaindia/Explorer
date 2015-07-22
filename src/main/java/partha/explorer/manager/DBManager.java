package partha.explorer.manager;


import partha.explorer.utils.Constants;
import partha.mongodb.manager.DBpublicConnector;
import partha.mongodb.manager.MongoInterface;

/**
 *
 * @author Partha
 */
public class DBManager {

    public static MongoInterface getDB() throws Exception {
        String schema = Constants.DBSCHEMA;
        String dbUrl = Constants.DBURL;
        Integer dbPort = Integer.parseInt(Constants.DBPORT);
        MongoInterface db = new DBpublicConnector().getConnection(schema, dbUrl, dbPort);
        return db;
    }
}
