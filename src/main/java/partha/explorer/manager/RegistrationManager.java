package partha.explorer.manager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import partha.explorer.dto.Request;
import partha.explorer.dto.User;
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
        String json = DBManager.getDB().getByCondition(REGISTRATION_TABLE, conditionMap);
        if (json == null) {
            return false;
        } else {
            return true;
        }

    }

    public boolean updateUser(String userId, HashMap userMap) throws Exception {
        if (userId == null || userId.equals("") || userMap == null || userMap.isEmpty()) {
            return false;
        }
        String json = DBManager.getDB().getByKey(REGISTRATION_TABLE, userId);
        List<Map> olderMap = new Gson().fromJson(json, new TypeToken<List<Map>>() {
        }.getType());
        Map existingMap = olderMap.get(0);
        existingMap.putAll(userMap);
        return DBManager.getDB().modify(REGISTRATION_TABLE, new Gson().toJson(existingMap), userId);

    }

    public List<User> searchUser(String userName, String type) throws Exception {
        if (userName == null || userName.equals("") || type == null || type.equals("")) {
            return null;
        }
        String userListJson = DBManager.getDB().getAll(REGISTRATION_TABLE);
        List<User> userList = new Gson().fromJson(userListJson, new TypeToken<User>() {
        }.getType());
        ArrayList<User> retList = new ArrayList();
        if (type.equals("userName")) {
            for (User u : userList) {
                if (u.getUserName().contains(userName)) {
                    retList.add(u);
                }
            }
        } else if (type.equals("emailId")) {
            for (User u : userList) {
                if (u.getEmailId().contains(userName)) {
                    retList.add(u);
                }
            }
        }
        return retList;
    }

    public List<User> getallUser() throws Exception {
        String userListJson = DBManager.getDB().getAll(REGISTRATION_TABLE);
        List<User> userList = new Gson().fromJson(userListJson, new TypeToken<User>() {
        }.getType());
        return userList;
    }

    public User getUser(String userId, Request reg) throws Exception {
        if (userId == null || userId.equals("")) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("pendingRequest", reg);
        new RegistrationManager().updateUser(userId, map);
        String userListJson = DBManager.getDB().getByKey(
                REGISTRATION_TABLE, userId);
        List<User> userList = new Gson().fromJson(userListJson, new TypeToken<User>() {
        }.getType());
        return userList.get(0);
    }
}
