package com.yaksonn.dazntutorial.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0007$%&\'()*B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R&\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR&\u0010\u001c\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001d\u0010\u0002\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R&\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b!\u0010\u0002\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010\u00a8\u0006+"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/ScoresModel;", "", "()V", "competition", "Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Competition;", "competition$annotations", "getCompetition", "()Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Competition;", "setCompetition", "(Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Competition;)V", "lang", "", "lang$annotations", "getLang", "()Ljava/lang/String;", "setLang", "(Ljava/lang/String;)V", "last_generated", "last_generated$annotations", "getLast_generated", "setLast_generated", "method", "Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Method;", "method$annotations", "getMethod", "()Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Method;", "setMethod", "(Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Method;)V", "sport", "sport$annotations", "getSport", "setSport", "version", "version$annotations", "getVersion", "setVersion", "Competition", "Group", "Match", "Method", "Parameter", "Round", "Season", "app_debug"})
@org.simpleframework.xml.Root(name = "gsmrs")
public final class ScoresModel {
    @org.jetbrains.annotations.Nullable()
    private com.yaksonn.dazntutorial.network.models.ScoresModel.Method method;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String last_generated;
    @org.jetbrains.annotations.Nullable()
    private com.yaksonn.dazntutorial.network.models.ScoresModel.Competition competition;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String lang;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String version;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String sport;
    
    @org.simpleframework.xml.Element(name = "method", required = false)
    public static void method$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.yaksonn.dazntutorial.network.models.ScoresModel.Method getMethod() {
        return null;
    }
    
    public final void setMethod(@org.jetbrains.annotations.Nullable()
    com.yaksonn.dazntutorial.network.models.ScoresModel.Method p0) {
    }
    
    @org.simpleframework.xml.Attribute(name = "last_generated", required = false)
    public static void last_generated$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast_generated() {
        return null;
    }
    
    public final void setLast_generated(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.simpleframework.xml.Element(name = "competition", required = false)
    public static void competition$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.yaksonn.dazntutorial.network.models.ScoresModel.Competition getCompetition() {
        return null;
    }
    
    public final void setCompetition(@org.jetbrains.annotations.Nullable()
    com.yaksonn.dazntutorial.network.models.ScoresModel.Competition p0) {
    }
    
    @org.simpleframework.xml.Attribute(name = "lang", required = false)
    public static void lang$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLang() {
        return null;
    }
    
    public final void setLang(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.simpleframework.xml.Attribute(name = "version", required = false)
    public static void version$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVersion() {
        return null;
    }
    
    public final void setVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.simpleframework.xml.Attribute(name = "sport", required = false)
    public static void sport$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSport() {
        return null;
    }
    
    public final void setSport(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public ScoresModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR,\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Method;", "", "()V", "method_id", "", "method_id$annotations", "getMethod_id", "()Ljava/lang/String;", "setMethod_id", "(Ljava/lang/String;)V", "name", "name$annotations", "getName", "setName", "parameter", "", "Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Parameter;", "parameter$annotations", "getParameter", "()Ljava/util/List;", "setParameter", "(Ljava/util/List;)V", "app_debug"})
    public static final class Method {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String method_id;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.yaksonn.dazntutorial.network.models.ScoresModel.Parameter> parameter;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        
        @org.simpleframework.xml.Attribute(name = "method_id", required = false)
        public static void method_id$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMethod_id() {
            return null;
        }
        
        public final void setMethod_id(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.ElementList(name = "parameter", required = false, entry = "parameter", inline = true)
        public static void parameter$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.yaksonn.dazntutorial.network.models.ScoresModel.Parameter> getParameter() {
            return null;
        }
        
        public final void setParameter(@org.jetbrains.annotations.Nullable()
        java.util.List<com.yaksonn.dazntutorial.network.models.ScoresModel.Parameter> p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "name", required = false)
        public static void name$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Method() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Parameter;", "", "()V", "name", "", "name$annotations", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "value", "value$annotations", "getValue", "setValue", "app_debug"})
    public static final class Parameter {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String value;
        
        @org.simpleframework.xml.Attribute(name = "name", required = false)
        public static void name$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "value", required = false)
        public static void value$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getValue() {
            return null;
        }
        
        public final void setValue(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Parameter() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR&\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR&\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR&\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR&\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR&\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u0002\u001a\u0004\b\'\u0010\u0007\"\u0004\b(\u0010\tR&\u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b*\u0010\u0002\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR&\u0010-\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b.\u0010\u0002\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\t\u00a8\u00061"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Competition;", "", "()V", "area_id", "", "area_id$annotations", "getArea_id", "()Ljava/lang/String;", "setArea_id", "(Ljava/lang/String;)V", "area_name", "area_name$annotations", "getArea_name", "setArea_name", "competition_id", "competition_id$annotations", "getCompetition_id", "setCompetition_id", "display_order", "display_order$annotations", "getDisplay_order", "setDisplay_order", "last_updated", "last_updated$annotations", "getLast_updated", "setLast_updated", "name", "name$annotations", "getName", "setName", "season", "Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Season;", "season$annotations", "getSeason", "()Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Season;", "setSeason", "(Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Season;)V", "soccertype", "soccertype$annotations", "getSoccertype", "setSoccertype", "teamtype", "teamtype$annotations", "getTeamtype", "setTeamtype", "type", "type$annotations", "getType", "setType", "app_debug"})
    public static final class Competition {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String area_name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String last_updated;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String competition_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String display_order;
        @org.jetbrains.annotations.Nullable()
        private com.yaksonn.dazntutorial.network.models.ScoresModel.Season season;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String type;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String area_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String teamtype;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String soccertype;
        
        @org.simpleframework.xml.Attribute(name = "area_name", required = false)
        public static void area_name$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getArea_name() {
            return null;
        }
        
        public final void setArea_name(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "last_updated", required = false)
        public static void last_updated$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLast_updated() {
            return null;
        }
        
        public final void setLast_updated(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "competition_id", required = false)
        public static void competition_id$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCompetition_id() {
            return null;
        }
        
        public final void setCompetition_id(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "name", required = false)
        public static void name$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "display_order", required = false)
        public static void display_order$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDisplay_order() {
            return null;
        }
        
        public final void setDisplay_order(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "season", required = false)
        public static void season$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.yaksonn.dazntutorial.network.models.ScoresModel.Season getSeason() {
            return null;
        }
        
        public final void setSeason(@org.jetbrains.annotations.Nullable()
        com.yaksonn.dazntutorial.network.models.ScoresModel.Season p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "type", required = false)
        public static void type$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getType() {
            return null;
        }
        
        public final void setType(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "area_id", required = false)
        public static void area_id$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getArea_id() {
            return null;
        }
        
        public final void setArea_id(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "teamtype", required = false)
        public static void teamtype$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTeamtype() {
            return null;
        }
        
        public final void setTeamtype(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "soccertype", required = false)
        public static void soccertype$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSoccertype() {
            return null;
        }
        
        public final void setSoccertype(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Competition() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR&\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR&\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR&\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR&\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\t\u00a8\u0006%"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Season;", "", "()V", "end_date", "", "end_date$annotations", "getEnd_date", "()Ljava/lang/String;", "setEnd_date", "(Ljava/lang/String;)V", "last_updated", "last_updated$annotations", "getLast_updated", "setLast_updated", "name", "name$annotations", "getName", "setName", "round", "Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Round;", "round$annotations", "getRound", "()Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Round;", "setRound", "(Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Round;)V", "season_id", "season_id$annotations", "getSeason_id", "setSeason_id", "service_level", "service_level$annotations", "getService_level", "setService_level", "start_date", "start_date$annotations", "getStart_date", "setStart_date", "app_debug"})
    public static final class Season {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String end_date;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String last_updated;
        @org.jetbrains.annotations.Nullable()
        private com.yaksonn.dazntutorial.network.models.ScoresModel.Round round;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String service_level;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String season_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String start_date;
        
        @org.simpleframework.xml.Attribute(name = "end_date", required = false)
        public static void end_date$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEnd_date() {
            return null;
        }
        
        public final void setEnd_date(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "last_updated", required = false)
        public static void last_updated$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLast_updated() {
            return null;
        }
        
        public final void setLast_updated(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "round", required = false)
        public static void round$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.yaksonn.dazntutorial.network.models.ScoresModel.Round getRound() {
            return null;
        }
        
        public final void setRound(@org.jetbrains.annotations.Nullable()
        com.yaksonn.dazntutorial.network.models.ScoresModel.Round p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "service_level", required = false)
        public static void service_level$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getService_level() {
            return null;
        }
        
        public final void setService_level(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "name", required = false)
        public static void name$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "season_id", required = false)
        public static void season_id$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSeason_id() {
            return null;
        }
        
        public final void setSeason_id(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "start_date", required = false)
        public static void start_date$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStart_date() {
            return null;
        }
        
        public final void setStart_date(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Season() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR,\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR&\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR&\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR&\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR&\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR&\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\'\u0010\u0002\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR&\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\t\u00a8\u0006."}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Round;", "", "()V", "end_date", "", "end_date$annotations", "getEnd_date", "()Ljava/lang/String;", "setEnd_date", "(Ljava/lang/String;)V", "group", "", "Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Group;", "group$annotations", "getGroup", "()Ljava/util/List;", "setGroup", "(Ljava/util/List;)V", "groups", "groups$annotations", "getGroups", "setGroups", "has_outgroup_matches", "has_outgroup_matches$annotations", "getHas_outgroup_matches", "setHas_outgroup_matches", "last_updated", "last_updated$annotations", "getLast_updated", "setLast_updated", "name", "name$annotations", "getName", "setName", "round_id", "round_id$annotations", "getRound_id", "setRound_id", "start_date", "start_date$annotations", "getStart_date", "setStart_date", "type", "type$annotations", "getType", "setType", "app_debug"})
    public static final class Round {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String end_date;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String round_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String last_updated;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String has_outgroup_matches;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String groups;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String type;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String start_date;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.yaksonn.dazntutorial.network.models.ScoresModel.Group> group;
        
        @org.simpleframework.xml.Attribute(name = "end_date", required = false)
        public static void end_date$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEnd_date() {
            return null;
        }
        
        public final void setEnd_date(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "round_id", required = false)
        public static void round_id$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getRound_id() {
            return null;
        }
        
        public final void setRound_id(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "last_updated", required = false)
        public static void last_updated$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLast_updated() {
            return null;
        }
        
        public final void setLast_updated(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "name", required = false)
        public static void name$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "has_outgroup_matches", required = false)
        public static void has_outgroup_matches$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHas_outgroup_matches() {
            return null;
        }
        
        public final void setHas_outgroup_matches(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "groups", required = false)
        public static void groups$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGroups() {
            return null;
        }
        
        public final void setGroups(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "type", required = false)
        public static void type$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getType() {
            return null;
        }
        
        public final void setType(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "start_date", required = false)
        public static void start_date$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStart_date() {
            return null;
        }
        
        public final void setStart_date(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.ElementList(name = "group", required = false, entry = "group", inline = true)
        public static void group$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.yaksonn.dazntutorial.network.models.ScoresModel.Group> getGroup() {
            return null;
        }
        
        public final void setGroup(@org.jetbrains.annotations.Nullable()
        java.util.List<com.yaksonn.dazntutorial.network.models.ScoresModel.Group> p0) {
        }
        
        public Round() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR&\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR,\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR&\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t\u00a8\u0006\""}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Group;", "", "()V", "details", "", "details$annotations", "getDetails", "()Ljava/lang/String;", "setDetails", "(Ljava/lang/String;)V", "group_id", "group_id$annotations", "getGroup_id", "setGroup_id", "last_updated", "last_updated$annotations", "getLast_updated", "setLast_updated", "match", "", "Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Match;", "match$annotations", "getMatch", "()Ljava/util/List;", "setMatch", "(Ljava/util/List;)V", "name", "name$annotations", "getName", "setName", "winner", "winner$annotations", "getWinner", "setWinner", "app_debug"})
    public static final class Group {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String last_updated;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String winner;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String group_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String name;
        @org.jetbrains.annotations.Nullable()
        private java.util.List<com.yaksonn.dazntutorial.network.models.ScoresModel.Match> match;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String details;
        
        @org.simpleframework.xml.Attribute(name = "last_updated", required = false)
        public static void last_updated$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLast_updated() {
            return null;
        }
        
        public final void setLast_updated(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "winner", required = false)
        public static void winner$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getWinner() {
            return null;
        }
        
        public final void setWinner(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "group_id", required = false)
        public static void group_id$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGroup_id() {
            return null;
        }
        
        public final void setGroup_id(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "name", required = false)
        public static void name$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getName() {
            return null;
        }
        
        public final void setName(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.ElementList(name = "match", required = false, entry = "match", inline = true)
        public static void match$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.yaksonn.dazntutorial.network.models.ScoresModel.Match> getMatch() {
            return null;
        }
        
        public final void setMatch(@org.jetbrains.annotations.Nullable()
        java.util.List<com.yaksonn.dazntutorial.network.models.ScoresModel.Match> p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "details", required = false)
        public static void details$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDetails() {
            return null;
        }
        
        public final void setDetails(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Group() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b^\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR&\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR&\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\tR&\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR&\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR&\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR&\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR&\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR&\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\'\u0010\u0002\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR&\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR&\u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b/\u0010\u0002\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010\tR&\u00102\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR&\u00106\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b7\u0010\u0002\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR&\u0010:\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b;\u0010\u0002\u001a\u0004\b<\u0010\u0007\"\u0004\b=\u0010\tR&\u0010>\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\u0007\"\u0004\bA\u0010\tR&\u0010B\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bC\u0010\u0002\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\tR&\u0010F\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bG\u0010\u0002\u001a\u0004\bH\u0010\u0007\"\u0004\bI\u0010\tR&\u0010J\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\u0007\"\u0004\bM\u0010\tR&\u0010N\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bO\u0010\u0002\u001a\u0004\bP\u0010\u0007\"\u0004\bQ\u0010\tR&\u0010R\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bS\u0010\u0002\u001a\u0004\bT\u0010\u0007\"\u0004\bU\u0010\tR&\u0010V\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\bW\u0010\u0002\u001a\u0004\bX\u0010\u0007\"\u0004\bY\u0010\tR&\u0010Z\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b[\u0010\u0002\u001a\u0004\b\\\u0010\u0007\"\u0004\b]\u0010\tR&\u0010^\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b_\u0010\u0002\u001a\u0004\b`\u0010\u0007\"\u0004\ba\u0010\t\u00a8\u0006b"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/ScoresModel$Match;", "", "()V", "date_london", "", "date_london$annotations", "getDate_london", "()Ljava/lang/String;", "setDate_london", "(Ljava/lang/String;)V", "date_utc", "date_utc$annotations", "getDate_utc", "setDate_utc", "ets_A", "ets_A$annotations", "getEts_A", "setEts_A", "ets_B", "ets_B$annotations", "getEts_B", "setEts_B", "fs_A", "fs_A$annotations", "getFs_A", "setFs_A", "fs_B", "fs_B$annotations", "getFs_B", "setFs_B", "gameweek", "gameweek$annotations", "getGameweek", "setGameweek", "hts_A", "hts_A$annotations", "getHts_A", "setHts_A", "hts_B", "hts_B$annotations", "getHts_B", "setHts_B", "last_updated", "last_updated$annotations", "getLast_updated", "setLast_updated", "match_id", "match_id$annotations", "getMatch_id", "setMatch_id", "ps_A", "ps_A$annotations", "getPs_A", "setPs_A", "ps_B", "ps_B$annotations", "getPs_B", "setPs_B", "status", "status$annotations", "getStatus", "setStatus", "team_A_country", "team_A_country$annotations", "getTeam_A_country", "setTeam_A_country", "team_A_id", "team_A_id$annotations", "getTeam_A_id", "setTeam_A_id", "team_A_name", "team_A_name$annotations", "getTeam_A_name", "setTeam_A_name", "team_B_country", "team_B_country$annotations", "getTeam_B_country", "setTeam_B_country", "team_B_id", "team_B_id$annotations", "getTeam_B_id", "setTeam_B_id", "team_B_name", "team_B_name$annotations", "getTeam_B_name", "setTeam_B_name", "time_london", "time_london$annotations", "getTime_london", "setTime_london", "time_utc", "time_utc$annotations", "getTime_utc", "setTime_utc", "winner", "winner$annotations", "getWinner", "setWinner", "app_debug"})
    public static final class Match {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String fs_B;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String time_utc;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ets_B;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String last_updated;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ets_A;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String date_london;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String match_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String team_B_name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String time_london;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ps_A;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String ps_B;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String date_utc;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String winner;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String team_A_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String team_B_id;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String hts_A;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String team_A_name;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String team_B_country;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String gameweek;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String hts_B;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String team_A_country;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String status;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String fs_A;
        
        @org.simpleframework.xml.Attribute(name = "fs_B", required = false)
        public static void fs_B$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFs_B() {
            return null;
        }
        
        public final void setFs_B(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "time_utc", required = false)
        public static void time_utc$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTime_utc() {
            return null;
        }
        
        public final void setTime_utc(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "ets_B", required = false)
        public static void ets_B$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEts_B() {
            return null;
        }
        
        public final void setEts_B(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "last_updated", required = false)
        public static void last_updated$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLast_updated() {
            return null;
        }
        
        public final void setLast_updated(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "ets_A", required = false)
        public static void ets_A$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEts_A() {
            return null;
        }
        
        public final void setEts_A(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "date_london", required = false)
        public static void date_london$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDate_london() {
            return null;
        }
        
        public final void setDate_london(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "match_id", required = false)
        public static void match_id$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMatch_id() {
            return null;
        }
        
        public final void setMatch_id(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "team_B_name", required = false)
        public static void team_B_name$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTeam_B_name() {
            return null;
        }
        
        public final void setTeam_B_name(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "time_london", required = false)
        public static void time_london$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTime_london() {
            return null;
        }
        
        public final void setTime_london(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "ps_A", required = false)
        public static void ps_A$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPs_A() {
            return null;
        }
        
        public final void setPs_A(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "ps_B", required = false)
        public static void ps_B$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPs_B() {
            return null;
        }
        
        public final void setPs_B(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "date_utc", required = false)
        public static void date_utc$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDate_utc() {
            return null;
        }
        
        public final void setDate_utc(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "winner", required = false)
        public static void winner$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getWinner() {
            return null;
        }
        
        public final void setWinner(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "team_A_id", required = false)
        public static void team_A_id$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTeam_A_id() {
            return null;
        }
        
        public final void setTeam_A_id(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "team_B_id", required = false)
        public static void team_B_id$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTeam_B_id() {
            return null;
        }
        
        public final void setTeam_B_id(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "hts_A", required = false)
        public static void hts_A$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHts_A() {
            return null;
        }
        
        public final void setHts_A(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "team_A_name", required = false)
        public static void team_A_name$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTeam_A_name() {
            return null;
        }
        
        public final void setTeam_A_name(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "team_B_country", required = false)
        public static void team_B_country$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTeam_B_country() {
            return null;
        }
        
        public final void setTeam_B_country(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "gameweek", required = false)
        public static void gameweek$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getGameweek() {
            return null;
        }
        
        public final void setGameweek(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "hts_B", required = false)
        public static void hts_B$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHts_B() {
            return null;
        }
        
        public final void setHts_B(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "team_A_country", required = false)
        public static void team_A_country$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTeam_A_country() {
            return null;
        }
        
        public final void setTeam_A_country(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "status", required = false)
        public static void status$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getStatus() {
            return null;
        }
        
        public final void setStatus(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "fs_A", required = false)
        public static void fs_A$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFs_A() {
            return null;
        }
        
        public final void setFs_A(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Match() {
            super();
        }
    }
}