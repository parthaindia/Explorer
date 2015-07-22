package partha.explorer.manager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;
import partha.explorer.utils.ApplicationConstant;

/**
 *
 * @author Partha
 */
public class RegistrationManager {

    static String REGISTRATION_TABLE = ApplicationConstant.REGISTRATION_TABLE;

    public String firstRegister(String userJson) throws Exception {
        if (userJson == null || userJson.equals("")) {
            return null;
        }
        return DBManager.getDB().addDefault(REGISTRATION_TABLE, userJson);
    }

    public static boolean checkDuplicate(String userName) throws Exception {
        if (userName == null || userName.equals("")) {
            return false;
        }
        Map conditionMap = new HashMap();
        conditionMap.put("userName", userName);
        String json = DBManager.getDB().getByCondition(userName, conditionMap);
        return json != null && !json.equals("");
    }

    public boolean updateUser(String userId, HashMap userMap) throws Exception {

        String json = DBManager.getDB().getByKey(REGISTRATION_TABLE, userId);
        Map olderMap = new Gson().fromJson(json, new TypeToken<Map>() {
        }.getType());
        olderMap.putAll(userMap);
        return DBManager.getDB().modify(REGISTRATION_TABLE, new Gson().toJson(olderMap), userId);

    }
}
