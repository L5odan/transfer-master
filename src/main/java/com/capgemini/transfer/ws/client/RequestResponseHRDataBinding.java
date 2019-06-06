package com.capgemini.transfer.ws.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2017-07-11T11:46:17.720+08:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", name = "RequestResponseHRDataBinding")
@XmlSeeAlso({ObjectFactory.class})
public interface RequestResponseHRDataBinding {

    @WebMethod(operationName = "CancelSession", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/CancelSession")
    @RequestWrapper(localName = "CancelSession", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.CancelSession")
    @ResponseWrapper(localName = "CancelSessionResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.CancelSessionResponse")
    public void cancelSession(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket
    );

    @WebMethod(operationName = "SyncUsers", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/SyncUsers")
    @RequestWrapper(localName = "SyncUsers", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.SyncUsers")
    @ResponseWrapper(localName = "SyncUsersResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.SyncUsersResponse")
    @WebResult(name = "SyncUsersResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String syncUsers(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "Data", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String data
    );

    @WebMethod(operationName = "PostOffboardUserRecords", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/PostOffboardUserRecords")
    @RequestWrapper(localName = "PostOffboardUserRecords", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostOffboardUserRecords")
    @ResponseWrapper(localName = "PostOffboardUserRecordsResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostOffboardUserRecordsResponse")
    @WebResult(name = "PostOffboardUserRecordsResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String postOffboardUserRecords(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "Data", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String data
    );

    @WebMethod(operationName = "GetOffboardingActivityStatus", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/GetOffboardingActivityStatus")
    @RequestWrapper(localName = "GetOffboardingActivityStatus", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetOffboardingActivityStatus")
    @ResponseWrapper(localName = "GetOffboardingActivityStatusResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetOffboardingActivityStatusResponse")
    @WebResult(name = "GetOffboardingActivityStatusResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String getOffboardingActivityStatus(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "HRDataID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String hrDataID
    );

    @WebMethod(operationName = "PostReferenceFiles", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/PostReferenceFiles")
    @RequestWrapper(localName = "PostReferenceFiles", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostReferenceFiles")
    @ResponseWrapper(localName = "PostReferenceFilesResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostReferenceFilesResponse")
    @WebResult(name = "PostReferenceFilesResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String postReferenceFiles(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "Data", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String data
    );

    @WebMethod(operationName = "GetUserActivities", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/GetUserActivities")
    @RequestWrapper(localName = "GetUserActivities", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetUserActivities")
    @ResponseWrapper(localName = "GetUserActivitiesResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetUserActivitiesResponse")
    @WebResult(name = "GetUserActivitiesResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String getUserActivities(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "UserName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userName
    );

    @WebMethod(operationName = "GetStatus", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/GetStatus")
    @RequestWrapper(localName = "GetStatus", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetStatus")
    @ResponseWrapper(localName = "GetStatusResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetStatusResponse")
    @WebResult(name = "GetStatusResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String getStatus(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket
    );

    @WebMethod(operationName = "AddHRDataRecord", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/AddHRDataRecord")
    @RequestWrapper(localName = "AddHRDataRecord", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.AddHRDataRecord")
    @ResponseWrapper(localName = "AddHRDataRecordResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.AddHRDataRecordResponse")
    @WebResult(name = "AddHRDataRecordResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String addHRDataRecord(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "NewHireID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String newHireID,
        @WebParam(name = "Field", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String field,
        @WebParam(name = "Value", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String value
    );

    /**
     * This method allows to create or update user information.
     */
    @WebMethod(operationName = "SyncUserWithEmail", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/SyncUserWithEmail")
    @RequestWrapper(localName = "SyncUserWithEmail", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.SyncUserWithEmail")
    @ResponseWrapper(localName = "SyncUserWithEmailResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.SyncUserWithEmailResponse")
    @WebResult(name = "SyncUserWithEmailResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String syncUserWithEmail(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "UserID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userID,
        @WebParam(name = "LoginName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String loginName,
        @WebParam(name = "FirstName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String firstName,
        @WebParam(name = "LastName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String lastName,
        @WebParam(name = "UserType", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userType,
        @WebParam(name = "Status", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String status,
        @WebParam(name = "ExternalId", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        int externalId,
        @WebParam(name = "Email", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String email
    );

    @WebMethod(operationName = "DeleteReferenceFiles", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/DeleteReferenceFiles")
    @RequestWrapper(localName = "DeleteReferenceFiles", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteReferenceFiles")
    @ResponseWrapper(localName = "DeleteReferenceFilesResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteReferenceFilesResponse")
    @WebResult(name = "DeleteReferenceFilesResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String deleteReferenceFiles(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "Data", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String data
    );

    @WebMethod(operationName = "PostNewhireRecord", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/PostNewhireRecord")
    @RequestWrapper(localName = "PostNewhireRecord", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostNewhireRecord")
    @ResponseWrapper(localName = "PostNewhireRecordResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostNewhireRecordResponse")
    @WebResult(name = "PostNewhireRecordResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String postNewhireRecord(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "Data", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String data
    );

    @WebMethod(operationName = "SyncUserWithCorporateCodes", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/SyncUserWithCorporateCodes")
    @RequestWrapper(localName = "SyncUserWithCorporateCodes", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.SyncUserWithCorporateCodes")
    @ResponseWrapper(localName = "SyncUserWithCorporateCodesResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.SyncUserWithCorporateCodesResponse")
    @WebResult(name = "SyncUserWithCorporateCodesResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String syncUserWithCorporateCodes(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "UserID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userID,
        @WebParam(name = "LoginName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String loginName,
        @WebParam(name = "FirstName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String firstName,
        @WebParam(name = "LastName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String lastName,
        @WebParam(name = "UserType", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userType,
        @WebParam(name = "Status", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String status,
        @WebParam(name = "ExternalId", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        int externalId,
        @WebParam(name = "CompanyCode", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String companyCode,
        @WebParam(name = "DivisionCode", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String divisionCode,
        @WebParam(name = "LocationCode", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String locationCode,
        @WebParam(name = "DepartmentCode", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String departmentCode
    );

    @WebMethod(operationName = "SyncUser", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/SyncUser")
    @RequestWrapper(localName = "SyncUser", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.SyncUser")
    @ResponseWrapper(localName = "SyncUserResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.SyncUserResponse")
    @WebResult(name = "SyncUserResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String syncUser(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "UserID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userID,
        @WebParam(name = "LoginName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String loginName,
        @WebParam(name = "FirstName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String firstName,
        @WebParam(name = "LastName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String lastName,
        @WebParam(name = "UserType", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userType,
        @WebParam(name = "Status", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String status,
        @WebParam(name = "ExternalId", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        int externalId
    );

    @WebMethod(operationName = "PostNewhireRecords", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/PostNewhireRecords")
    @RequestWrapper(localName = "PostNewhireRecords", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostNewhireRecords")
    @ResponseWrapper(localName = "PostNewhireRecordsResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostNewhireRecordsResponse")
    @WebResult(name = "PostNewhireRecordsResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String postNewhireRecords(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "Data", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String data
    );

    @WebMethod(operationName = "OffboardExistingUser", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/OffboardExistingUser")
    @RequestWrapper(localName = "OffboardExistingUser", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.OffboardExistingUser")
    @ResponseWrapper(localName = "OffboardExistingUserResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.OffboardExistingUserResponse")
    @WebResult(name = "OffboardExistingUserResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String offboardExistingUser(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "LoginName", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String loginName,
        @WebParam(name = "UserID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userID,
        @WebParam(name = "AssignTo", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String assignTo
    );

    @WebMethod(operationName = "DeleteNewhireRecord", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/DeleteNewhireRecord")
    @RequestWrapper(localName = "DeleteNewhireRecord", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteNewhireRecord")
    @ResponseWrapper(localName = "DeleteNewhireRecordResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteNewhireRecordResponse")
    @WebResult(name = "DeleteNewhireRecordResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String deleteNewhireRecord(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "NewhireID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String newhireID
    );

    @WebMethod(operationName = "PostSebEvent", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/PostSebEvent")
    @RequestWrapper(localName = "PostSebEvent", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostSebEvent")
    @ResponseWrapper(localName = "PostSebEventResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostSebEventResponse")
    @WebResult(name = "PostSebEventResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String postSebEvent(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "EventType", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String eventType,
        @WebParam(name = "EventData", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String eventData
    );

    /**
     * This method allows to delete user by it's login name or external id.
     */
    @WebMethod(operationName = "DeleteUser", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/DeleteUser")
    @RequestWrapper(localName = "DeleteUser", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteUser")
    @ResponseWrapper(localName = "DeleteUserResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteUserResponse")
    @WebResult(name = "DeleteUserResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String deleteUser(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "UserLogin", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userLogin,
        @WebParam(name = "UserExternalId", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String userExternalId
    );

    @WebMethod(operationName = "GetNewhireRecordByExportId", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/GetNewhireRecordByExportId")
    @RequestWrapper(localName = "GetNewhireRecordByExportId", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetNewhireRecordByExportId")
    @ResponseWrapper(localName = "GetNewhireRecordByExportIdResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetNewhireRecordByExportIdResponse")
    @WebResult(name = "GetNewhireRecordByExportIdResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String getNewhireRecordByExportId(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "NewhireID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String newhireID,
        @WebParam(name = "ExportID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String exportID
    );

    @WebMethod(operationName = "DeleteOffboardRecord", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/DeleteOffboardRecord")
    @RequestWrapper(localName = "DeleteOffboardRecord", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteOffboardRecord")
    @ResponseWrapper(localName = "DeleteOffboardRecordResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteOffboardRecordResponse")
    @WebResult(name = "DeleteOffboardRecordResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String deleteOffboardRecord(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "HRDataID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String hrDataID
    );

    @WebMethod(operationName = "PostBase64NewhireRecord", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/PostBase64NewhireRecord")
    @RequestWrapper(localName = "PostBase64NewhireRecord", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostBase64NewhireRecord")
    @ResponseWrapper(localName = "PostBase64NewhireRecordResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostBase64NewhireRecordResponse")
    @WebResult(name = "PostBase64NewhireRecordResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String postBase64NewhireRecord(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "Data", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String data
    );

    @WebMethod(operationName = "GetOffboardUserRecord", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/GetOffboardUserRecord")
    @RequestWrapper(localName = "GetOffboardUserRecord", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetOffboardUserRecord")
    @ResponseWrapper(localName = "GetOffboardUserRecordResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetOffboardUserRecordResponse")
    @WebResult(name = "GetOffboardUserRecordResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String getOffboardUserRecord(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "HRDataID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String hrDataID
    );

    @WebMethod(operationName = "GetOffboardUserRecordWithExportId", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/GetOffboardUserRecordWithExportId")
    @RequestWrapper(localName = "GetOffboardUserRecordWithExportId", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetOffboardUserRecordWithExportId")
    @ResponseWrapper(localName = "GetOffboardUserRecordWithExportIdResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetOffboardUserRecordWithExportIdResponse")
    @WebResult(name = "GetOffboardUserRecordWithExportIdResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String getOffboardUserRecordWithExportId(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "HRDataID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String hrDataID,
        @WebParam(name = "ExportID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String exportID
    );

    @WebMethod(operationName = "DeleteHRDataRecord", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/DeleteHRDataRecord")
    @RequestWrapper(localName = "DeleteHRDataRecord", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteHRDataRecord")
    @ResponseWrapper(localName = "DeleteHRDataRecordResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.DeleteHRDataRecordResponse")
    @WebResult(name = "DeleteHRDataRecordResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String deleteHRDataRecord(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "HRDataId", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String hrDataId,
        @WebParam(name = "Field", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String field
    );

    @WebMethod(operationName = "GetActivityStatusEx", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/GetActivityStatusEx")
    @RequestWrapper(localName = "GetActivityStatusEx", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetActivityStatusEx")
    @ResponseWrapper(localName = "GetActivityStatusExResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetActivityStatusExResponse")
    @WebResult(name = "GetActivityStatusExResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String getActivityStatusEx(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "NewhireID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String newhireID
    );

    @WebMethod(operationName = "BeginSession", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/BeginSession")
    @RequestWrapper(localName = "BeginSession", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.BeginSession")
    @ResponseWrapper(localName = "BeginSessionResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.BeginSessionResponse")
    @WebResult(name = "BeginSessionResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String beginSession(
        @WebParam(name = "Name", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String name,
        @WebParam(name = "Password", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String password
    );

    @WebMethod(operationName = "GetActivityStatus", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/GetActivityStatus")
    @RequestWrapper(localName = "GetActivityStatus", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetActivityStatus")
    @ResponseWrapper(localName = "GetActivityStatusResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetActivityStatusResponse")
    @WebResult(name = "GetActivityStatusResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String getActivityStatus(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "NewhireID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String newhireID
    );

    @WebMethod(operationName = "PostOffboardUserRecord", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/PostOffboardUserRecord")
    @RequestWrapper(localName = "PostOffboardUserRecord", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostOffboardUserRecord")
    @ResponseWrapper(localName = "PostOffboardUserRecordResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostOffboardUserRecordResponse")
    @WebResult(name = "PostOffboardUserRecordResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String postOffboardUserRecord(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "Data", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String data
    );

    /**
     * Posts new-hire record to XpressHR in 2 parts: 1st part - Main Data; 2-nd part - Supplemental Data.
     */
    @WebMethod(operationName = "PostNewhireRecordWithSupplementalData", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/PostNewhireRecordWithSupplementalData")
    @RequestWrapper(localName = "PostNewhireRecordWithSupplementalData", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostNewhireRecordWithSupplementalData")
    @ResponseWrapper(localName = "PostNewhireRecordWithSupplementalDataResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.PostNewhireRecordWithSupplementalDataResponse")
    @WebResult(name = "PostNewhireRecordWithSupplementalDataResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String postNewhireRecordWithSupplementalData(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "data", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String data,
        @WebParam(name = "supplementalData", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String supplementalData
    );

    @WebMethod(operationName = "GetNewhireRecord", action = "http://ATS.online-onboarding.com/Client/HRDataServiceEx/GetNewhireRecord")
    @RequestWrapper(localName = "GetNewhireRecord", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetNewhireRecord")
    @ResponseWrapper(localName = "GetNewhireRecordResponse", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx", className = "com.capgemini.transfer.ws.client.GetNewhireRecordResponse")
    @WebResult(name = "GetNewhireRecordResult", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
    public java.lang.String getNewhireRecord(
        @WebParam(name = "Ticket", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String ticket,
        @WebParam(name = "NewhireID", targetNamespace = "http://ATS.online-onboarding.com/Client/HRDataServiceEx")
        java.lang.String newhireID
    );
}
