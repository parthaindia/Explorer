package partha.explorer.manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import partha.explorer.dto.Request;
import partha.explorer.dto.User;

/**
 *
 * @author Partha
 */
public class RequestManager {

    public String sendRequest(List<Request> reqList) throws Exception {
        if (reqList == null) {
            return null;
        }
        ArrayList<String> gcmList = new ArrayList();
        String finalMessage = "";
        for (Request req : reqList) {
            String message = req.getRequestMessage();
            Map mp = req.getRequestFrom();

            String fromInfoName = "";
            String fromInfoPhone = "";
            String fromInfoAddress = "";

            try {
                fromInfoName = (String) mp.get("name");
                fromInfoPhone = (String) mp.get("phone");
                fromInfoAddress = (String) mp.get("address");
                finalMessage = message + "  user:" + fromInfoName + " " + fromInfoPhone + "" + fromInfoAddress;
            } catch (Exception ex) {

            }

            String ur = req.getRequestTo();

            User user = new RegistrationManager().getUser(ur, req);

            String gcmId = user.getGcmId();
            if (gcmId != null) {
                gcmList.add(gcmId);
            }

        }
        HashMap map = new HashMap();
        map.put("gcmIdList", gcmList);
        map.put("notificationmessage", finalMessage);
        String count = new PushNotificationManager().postBulkmessage(map);
        return count;
    }
}
