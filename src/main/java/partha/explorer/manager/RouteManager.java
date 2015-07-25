package partha.explorer.manager;

import partha.explorer.dto.Route;
import partha.explorer.utils.ApplicationConstant;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Partha
 */
public class RouteManager {

    static String ROUTE_TABLE = ApplicationConstant.ROUTE_TABLE;

    public String createNewRoute(String routeJson) throws Exception {
        if (routeJson == null || routeJson.equals("")) {
            return null;
        }
        Route newRoute = new Gson().fromJson(routeJson, new TypeToken<Route>() {
        }.getType());
//        Map routeMapObj = ConvertObjectToMap(newRoute);
//        String existingJson = DBManager.getDB().getByCondition(ROUTE_TABLE, routeMapObj);
//        if (existingJson == null) {
        return DBManager.getDB().addDefault(ROUTE_TABLE, routeJson);
//        }else{
//            return ApplicationConstant.HTTP_USER_EXIST;
//        }

    }

    public boolean updateRoute(String routeId, Map routeMap) throws Exception {
        if (routeId == null || routeId.equals("") || routeMap == null || routeMap.isEmpty()) {
            return false;
        }

        String json = DBManager.getDB().getByKey(ROUTE_TABLE, routeId);
        List<Map> olderMap = new Gson().fromJson(json, new TypeToken<List<Map>>() {
        }.getType());
        Map existingMap = olderMap.get(0);
        existingMap.putAll(routeMap);
        return DBManager.getDB().modify(ROUTE_TABLE, new Gson().toJson(existingMap), routeId);

    }

}
