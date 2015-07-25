/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partha.explorer.utils;

/**
 *
 * @author Partha
 */
public interface ApplicationConstant {

    String SUCCESS = "success";
    String FAIL = "fail";
    String ERROR = "error";
    String FATAL_ERROR = "fatal error";
    String WARNING = "warning";
    String AUTHORIZED = "authorized";
    String UNAUTHORIZED_ACCESS = "unauthorized access";
    String INVALID_INPUT = "invalid input";
    String INVALID_SESSION = "Invalid Session";
    String INSUFFICIENT_PRIVILEGE = "Insufficient Privilege";
    String USER_EMAIL_EXIST_MESSAGE = "Email is already registered";
    String USER_NAME_EXIST_MESSAGE = "User name already exist";
    String STATUS = "status";
    String ACTIVE = "active";
    String INACTIVE = "inactive";
    String COMPLETE = "complete";
    String USER_TABLE = "user";
    String ORG_TABLE = "org";
    //HTTP status codes
    String HTTP_STATUS_SUCCESS = "200";
    String HTTP_STATUS_FAIL = "501";
    String HTTP_STATUS_UNAUTHORIZED = "401";
    String HTTP_STATUS_INVALID_SESSION = "403";
    String HTTP_STATUS_EXCEPTION = "500";
    String HTTP_USER_EXIST = "409";

    String DBSCHEMA = "explorer";
    String DBPORT = "27017";
    String DBURL = "localhost";
    String GOOGLE_KEY = "";
    String REGISTRATION_TABLE = "user";
    String INSTALLATION_TABLE = "installation";
    String ROUTE_TABLE="route";
    String PERMISSION_TABLE = "permission";
    String NOTIFICATION_TABLE = "notification";
    String FILE_TABLE = "file";
    String FILE_PATH = "/home/accure/Desktop/Hack";
    String CSV_PATH = "/Users/shravanigv/Desktop/arduino3.csv";
    String LOCATIONSTARTPOINT = "start";
    String LOCATIONMEETINGPOINT = "meetup";
    String LOCATIONENDPOINT = "end";

}
