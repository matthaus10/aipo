package com.aimluck.eip.cayenne.om.portlet.auto;

import java.util.List;

/** Class _EipTSurvey was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTSurvey extends org.apache.cayenne.CayenneDataObject {

    public static final String ANONYMOUS_FLAG_PROPERTY = "anonymousFlag";
    public static final String CLOSE_DATE_PROPERTY = "closeDate";
    public static final String CLOSE_FLAG_PROPERTY = "closeFlag";
    public static final String COMMENT_PROPERTY = "comment";
    public static final String CREATE_DATE_PROPERTY = "createDate";
    public static final String CREATE_USER_ID_PROPERTY = "createUserId";
    public static final String EDITABLE_FLAG_PROPERTY = "editableFlag";
    public static final String NAME_PROPERTY = "name";
    public static final String OPEN_DATE_PROPERTY = "openDate";
    public static final String OPEN_FLAG_PROPERTY = "openFlag";
    public static final String OPTION_TYPE_PROPERTY = "optionType";
    public static final String RESPONDENT_COMPLETE_COUNT_PROPERTY = "respondentCompleteCount";
    public static final String RESPONDENT_COUNT_PROPERTY = "respondentCount";
    public static final String RESPONDENT_TYPE_PROPERTY = "respondentType";
    public static final String UPDATE_DATE_PROPERTY = "updateDate";
    public static final String EIP_TSURVEY_OPTIONS_PROPERTY = "eipTSurveyOptions";
    public static final String EIP_TSURVEY_RESPONDENTS_PROPERTY = "eipTSurveyRespondents";
    public static final String EIP_TSURVEY_RESPONSE_MAPS_PROPERTY = "eipTSurveyResponseMaps";

    public static final String SURVEY_ID_PK_COLUMN = "SURVEY_ID";

    public void setAnonymousFlag(String anonymousFlag) {
        writeProperty("anonymousFlag", anonymousFlag);
    }
    public String getAnonymousFlag() {
        return (String)readProperty("anonymousFlag");
    }
    
    
    public void setCloseDate(java.util.Date closeDate) {
        writeProperty("closeDate", closeDate);
    }
    public java.util.Date getCloseDate() {
        return (java.util.Date)readProperty("closeDate");
    }
    
    
    public void setCloseFlag(String closeFlag) {
        writeProperty("closeFlag", closeFlag);
    }
    public String getCloseFlag() {
        return (String)readProperty("closeFlag");
    }
    
    
    public void setComment(String comment) {
        writeProperty("comment", comment);
    }
    public String getComment() {
        return (String)readProperty("comment");
    }
    
    
    public void setCreateDate(java.util.Date createDate) {
        writeProperty("createDate", createDate);
    }
    public java.util.Date getCreateDate() {
        return (java.util.Date)readProperty("createDate");
    }
    
    
    public void setCreateUserId(Integer createUserId) {
        writeProperty("createUserId", createUserId);
    }
    public Integer getCreateUserId() {
        return (Integer)readProperty("createUserId");
    }
    
    
    public void setEditableFlag(String editableFlag) {
        writeProperty("editableFlag", editableFlag);
    }
    public String getEditableFlag() {
        return (String)readProperty("editableFlag");
    }
    
    
    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }
    
    
    public void setOpenDate(java.util.Date openDate) {
        writeProperty("openDate", openDate);
    }
    public java.util.Date getOpenDate() {
        return (java.util.Date)readProperty("openDate");
    }
    
    
    public void setOpenFlag(String openFlag) {
        writeProperty("openFlag", openFlag);
    }
    public String getOpenFlag() {
        return (String)readProperty("openFlag");
    }
    
    
    public void setOptionType(String optionType) {
        writeProperty("optionType", optionType);
    }
    public String getOptionType() {
        return (String)readProperty("optionType");
    }
    
    
    public void setRespondentCompleteCount(Integer respondentCompleteCount) {
        writeProperty("respondentCompleteCount", respondentCompleteCount);
    }
    public Integer getRespondentCompleteCount() {
        return (Integer)readProperty("respondentCompleteCount");
    }
    
    
    public void setRespondentCount(Integer respondentCount) {
        writeProperty("respondentCount", respondentCount);
    }
    public Integer getRespondentCount() {
        return (Integer)readProperty("respondentCount");
    }
    
    
    public void setRespondentType(String respondentType) {
        writeProperty("respondentType", respondentType);
    }
    public String getRespondentType() {
        return (String)readProperty("respondentType");
    }
    
    
    public void setUpdateDate(java.util.Date updateDate) {
        writeProperty("updateDate", updateDate);
    }
    public java.util.Date getUpdateDate() {
        return (java.util.Date)readProperty("updateDate");
    }
    
    
    public void addToEipTSurveyOptions(com.aimluck.eip.cayenne.om.portlet.EipTSurveyOption obj) {
        addToManyTarget("eipTSurveyOptions", obj, true);
    }
    public void removeFromEipTSurveyOptions(com.aimluck.eip.cayenne.om.portlet.EipTSurveyOption obj) {
        removeToManyTarget("eipTSurveyOptions", obj, true);
    }
    public List getEipTSurveyOptions() {
        return (List)readProperty("eipTSurveyOptions");
    }
    
    
    public void addToEipTSurveyRespondents(com.aimluck.eip.cayenne.om.portlet.EipTSurveyRespondent obj) {
        addToManyTarget("eipTSurveyRespondents", obj, true);
    }
    public void removeFromEipTSurveyRespondents(com.aimluck.eip.cayenne.om.portlet.EipTSurveyRespondent obj) {
        removeToManyTarget("eipTSurveyRespondents", obj, true);
    }
    public List getEipTSurveyRespondents() {
        return (List)readProperty("eipTSurveyRespondents");
    }
    
    
    public void addToEipTSurveyResponseMaps(com.aimluck.eip.cayenne.om.portlet.EipTSurveyResponseMap obj) {
        addToManyTarget("eipTSurveyResponseMaps", obj, true);
    }
    public void removeFromEipTSurveyResponseMaps(com.aimluck.eip.cayenne.om.portlet.EipTSurveyResponseMap obj) {
        removeToManyTarget("eipTSurveyResponseMaps", obj, true);
    }
    public List getEipTSurveyResponseMaps() {
        return (List)readProperty("eipTSurveyResponseMaps");
    }
    
    
}
