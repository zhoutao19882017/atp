package com.bcs.atp.server.gql;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static final String MUTATION_TYPE = "Mutation";

  public static final String SUBSCRIPTION_TYPE = "Subscription";

  public static class USER {
    public static final String TYPE_NAME = "User";

    public static final String Uid = "uid";

    public static final String DisplayName = "displayName";

    public static final String Email = "email";

    public static final String PhotoURL = "photoURL";

    public static final String IsAdmin = "isAdmin";

    public static final String CreatedOn = "createdOn";

    public static final String CurrentRESTSession = "currentRESTSession";

    public static final String CurrentGQLSession = "currentGQLSession";

    public static final String Environments = "environments";

    public static final String GlobalEnvironments = "globalEnvironments";

    public static final String RESTHistory = "RESTHistory";

    public static final String GQLHistory = "GQLHistory";

    public static final String Settings = "settings";

    public static class RESTHISTORY_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }

    public static class GQLHISTORY_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }
  }

  public static class USERDELETIONRESULT {
    public static final String TYPE_NAME = "UserDeletionResult";

    public static final String UserUID = "userUID";

    public static final String IsDeleted = "isDeleted";

    public static final String ErrorMessage = "errorMessage";
  }

  public static class USERSETTINGS {
    public static final String TYPE_NAME = "UserSettings";

    public static final String Id = "id";

    public static final String UserUid = "userUid";

    public static final String Properties = "properties";

    public static final String UpdatedOn = "updatedOn";
  }

  public static class USERENVIRONMENT {
    public static final String TYPE_NAME = "UserEnvironment";

    public static final String Id = "id";

    public static final String UserUid = "userUid";

    public static final String Name = "name";

    public static final String Variables = "variables";

    public static final String IsGlobal = "isGlobal";
  }

  public static class USERCOLLECTION {
    public static final String TYPE_NAME = "UserCollection";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Data = "data";

    public static final String Type = "type";

    public static final String User = "user";

    public static final String Parent = "parent";

    public static final String ChildrenREST = "childrenREST";

    public static final String ChildrenGQL = "childrenGQL";

    public static final String Requests = "requests";

    public static class CHILDRENREST_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }

    public static class CHILDRENGQL_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }

    public static class REQUESTS_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }
  }

  public static class USERCOLLECTIONREORDERDATA {
    public static final String TYPE_NAME = "UserCollectionReorderData";

    public static final String UserCollection = "userCollection";

    public static final String NextUserCollection = "nextUserCollection";
  }

  public static class USERCOLLECTIONREMOVEDDATA {
    public static final String TYPE_NAME = "UserCollectionRemovedData";

    public static final String Id = "id";

    public static final String Type = "type";
  }

  public static class USERCOLLECTIONEXPORTJSONDATA {
    public static final String TYPE_NAME = "UserCollectionExportJSONData";

    public static final String ExportedCollection = "exportedCollection";

    public static final String CollectionType = "collectionType";
  }

  public static class USERREQUEST {
    public static final String TYPE_NAME = "UserRequest";

    public static final String Id = "id";

    public static final String CollectionID = "collectionID";

    public static final String Title = "title";

    public static final String Request = "request";

    public static final String Type = "type";

    public static final String CreatedOn = "createdOn";

    public static final String User = "user";
  }

  public static class USERREQUESTREORDERDATA {
    public static final String TYPE_NAME = "UserRequestReorderData";

    public static final String Request = "request";

    public static final String NextRequest = "nextRequest";
  }

  public static class USERHISTORY {
    public static final String TYPE_NAME = "UserHistory";

    public static final String Id = "id";

    public static final String UserUid = "userUid";

    public static final String ReqType = "reqType";

    public static final String Request = "request";

    public static final String ResponseMetadata = "responseMetadata";

    public static final String IsStarred = "isStarred";

    public static final String ExecutedOn = "executedOn";
  }

  public static class USERHISTORYDELETEDMANYDATA {
    public static final String TYPE_NAME = "UserHistoryDeletedManyData";

    public static final String Count = "count";

    public static final String ReqType = "reqType";
  }

  public static class TEAM {
    public static final String TYPE_NAME = "Team";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Members = "members";

    public static final String TeamMembers = "teamMembers";

    public static final String MyRole = "myRole";

    public static final String OwnersCount = "ownersCount";

    public static final String EditorsCount = "editorsCount";

    public static final String ViewersCount = "viewersCount";

    public static final String TeamEnvironments = "teamEnvironments";

    public static final String TeamInvitations = "teamInvitations";

    public static class MEMBERS_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";
    }
  }

  public static class TEAMMEMBER {
    public static final String TYPE_NAME = "TeamMember";

    public static final String MembershipID = "membershipID";

    public static final String Role = "role";

    public static final String User = "user";
  }

  public static class TEAMENVIRONMENT {
    public static final String TYPE_NAME = "TeamEnvironment";

    public static final String Id = "id";

    public static final String TeamID = "teamID";

    public static final String Name = "name";

    public static final String Variables = "variables";
  }

  public static class TEAMCOLLECTION {
    public static final String TYPE_NAME = "TeamCollection";

    public static final String Id = "id";

    public static final String Title = "title";

    public static final String Data = "data";

    public static final String ParentID = "parentID";

    public static final String Team = "team";

    public static final String Parent = "parent";

    public static final String Children = "children";

    public static class CHILDREN_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }
  }

  public static class COLLECTIONREORDERDATA {
    public static final String TYPE_NAME = "CollectionReorderData";

    public static final String Collection = "collection";

    public static final String NextCollection = "nextCollection";
  }

  public static class TEAMREQUEST {
    public static final String TYPE_NAME = "TeamRequest";

    public static final String Id = "id";

    public static final String CollectionID = "collectionID";

    public static final String TeamID = "teamID";

    public static final String Request = "request";

    public static final String Title = "title";

    public static final String Team = "team";

    public static final String Collection = "collection";
  }

  public static class REQUESTREORDERDATA {
    public static final String TYPE_NAME = "RequestReorderData";

    public static final String Request = "request";

    public static final String NextRequest = "nextRequest";
  }

  public static class TEAMINVITATION {
    public static final String TYPE_NAME = "TeamInvitation";

    public static final String Id = "id";

    public static final String TeamID = "teamID";

    public static final String CreatorUid = "creatorUid";

    public static final String InviteeEmail = "inviteeEmail";

    public static final String InviteeRole = "inviteeRole";

    public static final String Team = "team";

    public static final String Creator = "creator";
  }

  public static class ADMIN {
    public static final String TYPE_NAME = "Admin";

    public static final String Uid = "uid";

    public static final String DisplayName = "displayName";

    public static final String Email = "email";

    public static final String PhotoURL = "photoURL";

    public static final String CreatedOn = "createdOn";
  }

  public static class INVITEDUSER {
    public static final String TYPE_NAME = "InvitedUser";

    public static final String AdminUid = "adminUid";

    public static final String AdminEmail = "adminEmail";

    public static final String InviteeEmail = "inviteeEmail";

    public static final String InvitedOn = "invitedOn";
  }

  public static class INFRA {
    public static final String TYPE_NAME = "Infra";

    public static final String ExecutedBy = "executedBy";

    public static final String Admins = "admins";

    public static final String UserInfo = "userInfo";

    public static final String AllUsers = "allUsers";

    public static final String AllUsersV2 = "allUsersV2";

    public static final String InvitedUsers = "invitedUsers";

    public static final String AllTeams = "allTeams";

    public static final String TeamInfo = "teamInfo";

    public static final String MembersCountInTeam = "membersCountInTeam";

    public static final String CollectionCountInTeam = "collectionCountInTeam";

    public static final String RequestCountInTeam = "requestCountInTeam";

    public static final String EnvironmentCountInTeam = "environmentCountInTeam";

    public static final String PendingInvitationCountInTeam = "pendingInvitationCountInTeam";

    public static final String UsersCount = "usersCount";

    public static final String TeamsCount = "teamsCount";

    public static final String TeamCollectionsCount = "teamCollectionsCount";

    public static final String TeamRequestsCount = "teamRequestsCount";

    public static final String AllShortcodes = "allShortcodes";

    public static class USERINFO_INPUT_ARGUMENT {
      public static final String UserUid = "userUid";
    }

    public static class ALLUSERS_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }

    public static class ALLUSERSV2_INPUT_ARGUMENT {
      public static final String SearchString = "searchString";

      public static final String Skip = "skip";

      public static final String Take = "take";
    }

    public static class INVITEDUSERS_INPUT_ARGUMENT {
      public static final String Skip = "skip";

      public static final String Take = "take";
    }

    public static class ALLTEAMS_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }

    public static class TEAMINFO_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class MEMBERSCOUNTINTEAM_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class COLLECTIONCOUNTINTEAM_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class REQUESTCOUNTINTEAM_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class ENVIRONMENTCOUNTINTEAM_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class PENDINGINVITATIONCOUNTINTEAM_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class ALLSHORTCODES_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";

      public static final String UserEmail = "userEmail";
    }
  }

  public static class SHORTCODE {
    public static final String TYPE_NAME = "Shortcode";

    public static final String Id = "id";

    public static final String Request = "request";

    public static final String Properties = "properties";

    public static final String CreatedOn = "createdOn";
  }

  public static class SHORTCODECREATOR {
    public static final String TYPE_NAME = "ShortcodeCreator";

    public static final String Uid = "uid";

    public static final String Email = "email";
  }

  public static class SHORTCODEWITHUSEREMAIL {
    public static final String TYPE_NAME = "ShortcodeWithUserEmail";

    public static final String Id = "id";

    public static final String Request = "request";

    public static final String Properties = "properties";

    public static final String CreatedOn = "createdOn";

    public static final String Creator = "creator";
  }

  public static class INFRACONFIG {
    public static final String TYPE_NAME = "InfraConfig";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String Infra = "infra";

    public static final String InfraConfigs = "infraConfigs";

    public static final String AllowedAuthProviders = "allowedAuthProviders";

    public static final String Admin = "admin";

    public static final String Shortcode = "shortcode";

    public static final String MyShortcodes = "myShortcodes";

    public static final String MyTeams = "myTeams";

    public static final String Team = "team";

    public static final String ExportCollectionsToJSON = "exportCollectionsToJSON";

    public static final String RootCollectionsOfTeam = "rootCollectionsOfTeam";

    public static final String Collection = "collection";

    public static final String TeamInvitation = "teamInvitation";

    public static final String SearchForRequest = "searchForRequest";

    public static final String Request = "request";

    public static final String RequestsInCollection = "requestsInCollection";

    public static final String Me = "me";

    public static final String RootRESTUserCollections = "rootRESTUserCollections";

    public static final String RootGQLUserCollections = "rootGQLUserCollections";

    public static final String UserCollection = "userCollection";

    public static final String ExportUserCollectionsToJSON = "exportUserCollectionsToJSON";

    public static final String UserRESTRequests = "userRESTRequests";

    public static final String UserGQLRequests = "userGQLRequests";

    public static final String UserRequest = "userRequest";

    public static class INFRACONFIGS_INPUT_ARGUMENT {
      public static final String ConfigNames = "configNames";
    }

    public static class SHORTCODE_INPUT_ARGUMENT {
      public static final String Code = "code";
    }

    public static class MYSHORTCODES_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }

    public static class MYTEAMS_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";
    }

    public static class TEAM_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class EXPORTCOLLECTIONSTOJSON_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class ROOTCOLLECTIONSOFTEAM_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";

      public static final String TeamID = "teamID";
    }

    public static class COLLECTION_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";
    }

    public static class TEAMINVITATION_INPUT_ARGUMENT {
      public static final String InviteID = "inviteID";
    }

    public static class SEARCHFORREQUEST_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";

      public static final String TeamID = "teamID";

      public static final String SearchTerm = "searchTerm";
    }

    public static class REQUEST_INPUT_ARGUMENT {
      public static final String RequestID = "requestID";
    }

    public static class REQUESTSINCOLLECTION_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";

      public static final String CollectionID = "collectionID";
    }

    public static class ROOTRESTUSERCOLLECTIONS_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }

    public static class ROOTGQLUSERCOLLECTIONS_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";
    }

    public static class USERCOLLECTION_INPUT_ARGUMENT {
      public static final String UserCollectionID = "userCollectionID";
    }

    public static class EXPORTUSERCOLLECTIONSTOJSON_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String CollectionType = "collectionType";
    }

    public static class USERRESTREQUESTS_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";

      public static final String CollectionID = "collectionID";
    }

    public static class USERGQLREQUESTS_INPUT_ARGUMENT {
      public static final String Cursor = "cursor";

      public static final String Take = "take";

      public static final String CollectionID = "collectionID";
    }

    public static class USERREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String UpdateInfraConfigs = "updateInfraConfigs";

    public static final String ToggleAnalyticsCollection = "toggleAnalyticsCollection";

    public static final String ResetInfraConfigs = "resetInfraConfigs";

    public static final String EnableAndDisableSSO = "enableAndDisableSSO";

    public static final String InviteNewUser = "inviteNewUser";

    public static final String RevokeUserInvitationsByAdmin = "revokeUserInvitationsByAdmin";

    public static final String RemoveUserByAdmin = "removeUserByAdmin";

    public static final String RemoveUsersByAdmin = "removeUsersByAdmin";

    public static final String MakeUserAdmin = "makeUserAdmin";

    public static final String MakeUsersAdmin = "makeUsersAdmin";

    public static final String UpdateUserDisplayNameByAdmin = "updateUserDisplayNameByAdmin";

    public static final String RemoveUserAsAdmin = "removeUserAsAdmin";

    public static final String DemoteUsersByAdmin = "demoteUsersByAdmin";

    public static final String CreateTeamByAdmin = "createTeamByAdmin";

    public static final String ChangeUserRoleInTeamByAdmin = "changeUserRoleInTeamByAdmin";

    public static final String RemoveUserFromTeamByAdmin = "removeUserFromTeamByAdmin";

    public static final String AddUserToTeamByAdmin = "addUserToTeamByAdmin";

    public static final String RenameTeamByAdmin = "renameTeamByAdmin";

    public static final String DeleteTeamByAdmin = "deleteTeamByAdmin";

    public static final String RevokeTeamInviteByAdmin = "revokeTeamInviteByAdmin";

    public static final String RevokeShortcodeByAdmin = "revokeShortcodeByAdmin";

    public static final String CreateShortcode = "createShortcode";

    public static final String UpdateEmbedProperties = "updateEmbedProperties";

    public static final String RevokeShortcode = "revokeShortcode";

    public static final String CreateTeam = "createTeam";

    public static final String LeaveTeam = "leaveTeam";

    public static final String RemoveTeamMember = "removeTeamMember";

    public static final String RenameTeam = "renameTeam";

    public static final String DeleteTeam = "deleteTeam";

    public static final String UpdateTeamMemberRole = "updateTeamMemberRole";

    public static final String CreateRootCollection = "createRootCollection";

    public static final String ImportCollectionsFromJSON = "importCollectionsFromJSON";

    public static final String ReplaceCollectionsWithJSON = "replaceCollectionsWithJSON";

    public static final String CreateChildCollection = "createChildCollection";

    public static final String RenameCollection = "renameCollection";

    public static final String DeleteCollection = "deleteCollection";

    public static final String MoveCollection = "moveCollection";

    public static final String UpdateCollectionOrder = "updateCollectionOrder";

    public static final String UpdateTeamCollection = "updateTeamCollection";

    public static final String CreateTeamEnvironment = "createTeamEnvironment";

    public static final String DeleteTeamEnvironment = "deleteTeamEnvironment";

    public static final String UpdateTeamEnvironment = "updateTeamEnvironment";

    public static final String DeleteAllVariablesFromTeamEnvironment = "deleteAllVariablesFromTeamEnvironment";

    public static final String CreateDuplicateEnvironment = "createDuplicateEnvironment";

    public static final String CreateTeamInvitation = "createTeamInvitation";

    public static final String RevokeTeamInvitation = "revokeTeamInvitation";

    public static final String AcceptTeamInvitation = "acceptTeamInvitation";

    public static final String CreateRequestInCollection = "createRequestInCollection";

    public static final String UpdateRequest = "updateRequest";

    public static final String DeleteRequest = "deleteRequest";

    public static final String UpdateLookUpRequestOrder = "updateLookUpRequestOrder";

    public static final String MoveRequest = "moveRequest";

    public static final String UpdateUserSessions = "updateUserSessions";

    public static final String UpdateDisplayName = "updateDisplayName";

    public static final String DeleteUser = "deleteUser";

    public static final String CreateRESTRootUserCollection = "createRESTRootUserCollection";

    public static final String CreateGQLRootUserCollection = "createGQLRootUserCollection";

    public static final String CreateGQLChildUserCollection = "createGQLChildUserCollection";

    public static final String CreateRESTChildUserCollection = "createRESTChildUserCollection";

    public static final String RenameUserCollection = "renameUserCollection";

    public static final String DeleteUserCollection = "deleteUserCollection";

    public static final String MoveUserCollection = "moveUserCollection";

    public static final String UpdateUserCollectionOrder = "updateUserCollectionOrder";

    public static final String ImportUserCollectionsFromJSON = "importUserCollectionsFromJSON";

    public static final String UpdateUserCollection = "updateUserCollection";

    public static final String CreateUserEnvironment = "createUserEnvironment";

    public static final String CreateUserGlobalEnvironment = "createUserGlobalEnvironment";

    public static final String UpdateUserEnvironment = "updateUserEnvironment";

    public static final String DeleteUserEnvironment = "deleteUserEnvironment";

    public static final String DeleteUserEnvironments = "deleteUserEnvironments";

    public static final String ClearGlobalEnvironments = "clearGlobalEnvironments";

    public static final String CreateUserHistory = "createUserHistory";

    public static final String ToggleHistoryStarStatus = "toggleHistoryStarStatus";

    public static final String RemoveRequestFromHistory = "removeRequestFromHistory";

    public static final String DeleteAllUserHistory = "deleteAllUserHistory";

    public static final String CreateRESTUserRequest = "createRESTUserRequest";

    public static final String CreateGQLUserRequest = "createGQLUserRequest";

    public static final String UpdateRESTUserRequest = "updateRESTUserRequest";

    public static final String UpdateGQLUserRequest = "updateGQLUserRequest";

    public static final String DeleteUserRequest = "deleteUserRequest";

    public static final String MoveUserRequest = "moveUserRequest";

    public static final String CreateUserSettings = "createUserSettings";

    public static final String UpdateUserSettings = "updateUserSettings";

    public static class UPDATEINFRACONFIGS_INPUT_ARGUMENT {
      public static final String InfraConfigs = "infraConfigs";
    }

    public static class TOGGLEANALYTICSCOLLECTION_INPUT_ARGUMENT {
      public static final String Status = "status";
    }

    public static class ENABLEANDDISABLESSO_INPUT_ARGUMENT {
      public static final String ProviderInfo = "providerInfo";
    }

    public static class INVITENEWUSER_INPUT_ARGUMENT {
      public static final String InviteeEmail = "inviteeEmail";
    }

    public static class REVOKEUSERINVITATIONSBYADMIN_INPUT_ARGUMENT {
      public static final String InviteeEmails = "inviteeEmails";
    }

    public static class REMOVEUSERBYADMIN_INPUT_ARGUMENT {
      public static final String UserUID = "userUID";
    }

    public static class REMOVEUSERSBYADMIN_INPUT_ARGUMENT {
      public static final String UserUIDs = "userUIDs";
    }

    public static class MAKEUSERADMIN_INPUT_ARGUMENT {
      public static final String UserUID = "userUID";
    }

    public static class MAKEUSERSADMIN_INPUT_ARGUMENT {
      public static final String UserUIDs = "userUIDs";
    }

    public static class UPDATEUSERDISPLAYNAMEBYADMIN_INPUT_ARGUMENT {
      public static final String UserUID = "userUID";

      public static final String DisplayName = "displayName";
    }

    public static class REMOVEUSERASADMIN_INPUT_ARGUMENT {
      public static final String UserUID = "userUID";
    }

    public static class DEMOTEUSERSBYADMIN_INPUT_ARGUMENT {
      public static final String UserUIDs = "userUIDs";
    }

    public static class CREATETEAMBYADMIN_INPUT_ARGUMENT {
      public static final String UserUid = "userUid";

      public static final String Name = "name";
    }

    public static class CHANGEUSERROLEINTEAMBYADMIN_INPUT_ARGUMENT {
      public static final String UserUID = "userUID";

      public static final String TeamID = "teamID";

      public static final String NewRole = "newRole";
    }

    public static class REMOVEUSERFROMTEAMBYADMIN_INPUT_ARGUMENT {
      public static final String UserUid = "userUid";

      public static final String TeamID = "teamID";
    }

    public static class ADDUSERTOTEAMBYADMIN_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";

      public static final String Role = "role";

      public static final String UserEmail = "userEmail";
    }

    public static class RENAMETEAMBYADMIN_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";

      public static final String NewName = "newName";
    }

    public static class DELETETEAMBYADMIN_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class REVOKETEAMINVITEBYADMIN_INPUT_ARGUMENT {
      public static final String InviteID = "inviteID";
    }

    public static class REVOKESHORTCODEBYADMIN_INPUT_ARGUMENT {
      public static final String Code = "code";
    }

    public static class CREATESHORTCODE_INPUT_ARGUMENT {
      public static final String Request = "request";

      public static final String Properties = "properties";
    }

    public static class UPDATEEMBEDPROPERTIES_INPUT_ARGUMENT {
      public static final String Code = "code";

      public static final String Properties = "properties";
    }

    public static class REVOKESHORTCODE_INPUT_ARGUMENT {
      public static final String Code = "code";
    }

    public static class CREATETEAM_INPUT_ARGUMENT {
      public static final String Name = "name";
    }

    public static class LEAVETEAM_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class REMOVETEAMMEMBER_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";

      public static final String UserUid = "userUid";
    }

    public static class RENAMETEAM_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";

      public static final String NewName = "newName";
    }

    public static class DELETETEAM_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class UPDATETEAMMEMBERROLE_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";

      public static final String UserUid = "userUid";

      public static final String NewRole = "newRole";
    }

    public static class CREATEROOTCOLLECTION_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";

      public static final String Title = "title";

      public static final String Data = "data";
    }

    public static class IMPORTCOLLECTIONSFROMJSON_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";

      public static final String JsonString = "jsonString";

      public static final String ParentCollectionID = "parentCollectionID";
    }

    public static class REPLACECOLLECTIONSWITHJSON_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";

      public static final String JsonString = "jsonString";

      public static final String ParentCollectionID = "parentCollectionID";
    }

    public static class CREATECHILDCOLLECTION_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String ChildTitle = "childTitle";

      public static final String Data = "data";
    }

    public static class RENAMECOLLECTION_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String NewTitle = "newTitle";
    }

    public static class DELETECOLLECTION_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";
    }

    public static class MOVECOLLECTION_INPUT_ARGUMENT {
      public static final String ParentCollectionID = "parentCollectionID";

      public static final String CollectionID = "collectionID";
    }

    public static class UPDATECOLLECTIONORDER_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String DestCollID = "destCollID";
    }

    public static class UPDATETEAMCOLLECTION_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String NewTitle = "newTitle";

      public static final String Data = "data";
    }

    public static class CREATETEAMENVIRONMENT_INPUT_ARGUMENT {
      public static final String Name = "name";

      public static final String TeamID = "teamID";

      public static final String Variables = "variables";
    }

    public static class DELETETEAMENVIRONMENT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class UPDATETEAMENVIRONMENT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Name = "name";

      public static final String Variables = "variables";
    }

    public static class DELETEALLVARIABLESFROMTEAMENVIRONMENT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CREATEDUPLICATEENVIRONMENT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CREATETEAMINVITATION_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";

      public static final String InviteeEmail = "inviteeEmail";

      public static final String InviteeRole = "inviteeRole";
    }

    public static class REVOKETEAMINVITATION_INPUT_ARGUMENT {
      public static final String InviteID = "inviteID";
    }

    public static class ACCEPTTEAMINVITATION_INPUT_ARGUMENT {
      public static final String InviteID = "inviteID";
    }

    public static class CREATEREQUESTINCOLLECTION_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String Data = "data";
    }

    public static class UPDATEREQUEST_INPUT_ARGUMENT {
      public static final String RequestID = "requestID";

      public static final String Data = "data";
    }

    public static class DELETEREQUEST_INPUT_ARGUMENT {
      public static final String RequestID = "requestID";
    }

    public static class UPDATELOOKUPREQUESTORDER_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String NextRequestID = "nextRequestID";

      public static final String RequestID = "requestID";
    }

    public static class MOVEREQUEST_INPUT_ARGUMENT {
      public static final String SrcCollID = "srcCollID";

      public static final String RequestID = "requestID";

      public static final String DestCollID = "destCollID";

      public static final String NextRequestID = "nextRequestID";
    }

    public static class UPDATEUSERSESSIONS_INPUT_ARGUMENT {
      public static final String CurrentSession = "currentSession";

      public static final String SessionType = "sessionType";
    }

    public static class UPDATEDISPLAYNAME_INPUT_ARGUMENT {
      public static final String UpdatedDisplayName = "updatedDisplayName";
    }

    public static class CREATERESTROOTUSERCOLLECTION_INPUT_ARGUMENT {
      public static final String Title = "title";

      public static final String Data = "data";
    }

    public static class CREATEGQLROOTUSERCOLLECTION_INPUT_ARGUMENT {
      public static final String Title = "title";

      public static final String Data = "data";
    }

    public static class CREATEGQLCHILDUSERCOLLECTION_INPUT_ARGUMENT {
      public static final String Title = "title";

      public static final String ParentUserCollectionID = "parentUserCollectionID";

      public static final String Data = "data";
    }

    public static class CREATERESTCHILDUSERCOLLECTION_INPUT_ARGUMENT {
      public static final String Title = "title";

      public static final String ParentUserCollectionID = "parentUserCollectionID";

      public static final String Data = "data";
    }

    public static class RENAMEUSERCOLLECTION_INPUT_ARGUMENT {
      public static final String UserCollectionID = "userCollectionID";

      public static final String NewTitle = "newTitle";
    }

    public static class DELETEUSERCOLLECTION_INPUT_ARGUMENT {
      public static final String UserCollectionID = "userCollectionID";
    }

    public static class MOVEUSERCOLLECTION_INPUT_ARGUMENT {
      public static final String DestCollectionID = "destCollectionID";

      public static final String UserCollectionID = "userCollectionID";
    }

    public static class UPDATEUSERCOLLECTIONORDER_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String NextCollectionID = "nextCollectionID";
    }

    public static class IMPORTUSERCOLLECTIONSFROMJSON_INPUT_ARGUMENT {
      public static final String JsonString = "jsonString";

      public static final String ReqType = "reqType";

      public static final String ParentCollectionID = "parentCollectionID";
    }

    public static class UPDATEUSERCOLLECTION_INPUT_ARGUMENT {
      public static final String UserCollectionID = "userCollectionID";

      public static final String NewTitle = "newTitle";

      public static final String Data = "data";
    }

    public static class CREATEUSERENVIRONMENT_INPUT_ARGUMENT {
      public static final String Name = "name";

      public static final String Variables = "variables";
    }

    public static class CREATEUSERGLOBALENVIRONMENT_INPUT_ARGUMENT {
      public static final String Variables = "variables";
    }

    public static class UPDATEUSERENVIRONMENT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Name = "name";

      public static final String Variables = "variables";
    }

    public static class DELETEUSERENVIRONMENT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CLEARGLOBALENVIRONMENTS_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class CREATEUSERHISTORY_INPUT_ARGUMENT {
      public static final String ReqData = "reqData";

      public static final String ResMetadata = "resMetadata";

      public static final String ReqType = "reqType";
    }

    public static class TOGGLEHISTORYSTARSTATUS_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class REMOVEREQUESTFROMHISTORY_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class DELETEALLUSERHISTORY_INPUT_ARGUMENT {
      public static final String ReqType = "reqType";
    }

    public static class CREATERESTUSERREQUEST_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String Title = "title";

      public static final String Request = "request";
    }

    public static class CREATEGQLUSERREQUEST_INPUT_ARGUMENT {
      public static final String CollectionID = "collectionID";

      public static final String Title = "title";

      public static final String Request = "request";
    }

    public static class UPDATERESTUSERREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Title = "title";

      public static final String Request = "request";
    }

    public static class UPDATEGQLUSERREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Title = "title";

      public static final String Request = "request";
    }

    public static class DELETEUSERREQUEST_INPUT_ARGUMENT {
      public static final String Id = "id";
    }

    public static class MOVEUSERREQUEST_INPUT_ARGUMENT {
      public static final String SourceCollectionID = "sourceCollectionID";

      public static final String RequestID = "requestID";

      public static final String DestinationCollectionID = "destinationCollectionID";

      public static final String NextRequestID = "nextRequestID";
    }

    public static class CREATEUSERSETTINGS_INPUT_ARGUMENT {
      public static final String Properties = "properties";
    }

    public static class UPDATEUSERSETTINGS_INPUT_ARGUMENT {
      public static final String Properties = "properties";
    }
  }

  public static class SUBSCRIPTION {
    public static final String TYPE_NAME = "Subscription";

    public static final String UserInvited = "userInvited";

    public static final String MyShortcodesCreated = "myShortcodesCreated";

    public static final String MyShortcodesUpdated = "myShortcodesUpdated";

    public static final String MyShortcodesRevoked = "myShortcodesRevoked";

    public static final String TeamMemberAdded = "teamMemberAdded";

    public static final String TeamMemberUpdated = "teamMemberUpdated";

    public static final String TeamMemberRemoved = "teamMemberRemoved";

    public static final String TeamCollectionAdded = "teamCollectionAdded";

    public static final String TeamCollectionUpdated = "teamCollectionUpdated";

    public static final String TeamCollectionRemoved = "teamCollectionRemoved";

    public static final String TeamCollectionMoved = "teamCollectionMoved";

    public static final String CollectionOrderUpdated = "collectionOrderUpdated";

    public static final String TeamEnvironmentUpdated = "teamEnvironmentUpdated";

    public static final String TeamEnvironmentCreated = "teamEnvironmentCreated";

    public static final String TeamEnvironmentDeleted = "teamEnvironmentDeleted";

    public static final String TeamInvitationAdded = "teamInvitationAdded";

    public static final String TeamInvitationRemoved = "teamInvitationRemoved";

    public static final String TeamRequestAdded = "teamRequestAdded";

    public static final String TeamRequestUpdated = "teamRequestUpdated";

    public static final String TeamRequestDeleted = "teamRequestDeleted";

    public static final String RequestOrderUpdated = "requestOrderUpdated";

    public static final String RequestMoved = "requestMoved";

    public static final String UserUpdated = "userUpdated";

    public static final String UserDeleted = "userDeleted";

    public static final String UserCollectionCreated = "userCollectionCreated";

    public static final String UserCollectionUpdated = "userCollectionUpdated";

    public static final String UserCollectionRemoved = "userCollectionRemoved";

    public static final String UserCollectionMoved = "userCollectionMoved";

    public static final String UserCollectionOrderUpdated = "userCollectionOrderUpdated";

    public static final String UserEnvironmentCreated = "userEnvironmentCreated";

    public static final String UserEnvironmentUpdated = "userEnvironmentUpdated";

    public static final String UserEnvironmentDeleted = "userEnvironmentDeleted";

    public static final String UserEnvironmentDeleteMany = "userEnvironmentDeleteMany";

    public static final String UserHistoryCreated = "userHistoryCreated";

    public static final String UserHistoryUpdated = "userHistoryUpdated";

    public static final String UserHistoryDeleted = "userHistoryDeleted";

    public static final String UserHistoryDeletedMany = "userHistoryDeletedMany";

    public static final String UserRequestCreated = "userRequestCreated";

    public static final String UserRequestUpdated = "userRequestUpdated";

    public static final String UserRequestDeleted = "userRequestDeleted";

    public static final String UserRequestMoved = "userRequestMoved";

    public static final String UserSettingsCreated = "userSettingsCreated";

    public static final String UserSettingsUpdated = "userSettingsUpdated";

    public static class TEAMMEMBERADDED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMMEMBERUPDATED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMMEMBERREMOVED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMCOLLECTIONADDED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMCOLLECTIONUPDATED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMCOLLECTIONREMOVED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMCOLLECTIONMOVED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class COLLECTIONORDERUPDATED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMENVIRONMENTUPDATED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMENVIRONMENTCREATED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMENVIRONMENTDELETED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMINVITATIONADDED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMINVITATIONREMOVED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMREQUESTADDED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMREQUESTUPDATED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class TEAMREQUESTDELETED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class REQUESTORDERUPDATED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }

    public static class REQUESTMOVED_INPUT_ARGUMENT {
      public static final String TeamID = "teamID";
    }
  }

  public static class INFRACONFIGARGS {
    public static final String TYPE_NAME = "InfraConfigArgs";

    public static final String Name = "name";

    public static final String Value = "value";
  }

  public static class ENABLEANDDISABLESSOARGS {
    public static final String TYPE_NAME = "EnableAndDisableSSOArgs";

    public static final String Provider = "provider";

    public static final String Status = "status";
  }

  public static class CREATETEAMREQUESTINPUT {
    public static final String TYPE_NAME = "CreateTeamRequestInput";

    public static final String TeamID = "teamID";

    public static final String Request = "request";

    public static final String Title = "title";
  }

  public static class UPDATETEAMREQUESTINPUT {
    public static final String TYPE_NAME = "UpdateTeamRequestInput";

    public static final String Request = "request";

    public static final String Title = "title";
  }
}
