package com.yaksonn.dazntutorial.network.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\u0011\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/NewsModel;", "", "()V", "channel", "Lcom/yaksonn/dazntutorial/network/models/NewsModel$Channel;", "channel$annotations", "getChannel", "()Lcom/yaksonn/dazntutorial/network/models/NewsModel$Channel;", "setChannel", "(Lcom/yaksonn/dazntutorial/network/models/NewsModel$Channel;)V", "version", "", "version$annotations", "getVersion", "()Ljava/lang/Double;", "setVersion", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "Channel", "Enclosure", "Item", "app_debug"})
@org.simpleframework.xml.Root(name = "rss")
public final class NewsModel {
    @org.jetbrains.annotations.NotNull()
    public com.yaksonn.dazntutorial.network.models.NewsModel.Channel channel;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double version;
    
    @org.simpleframework.xml.Element(name = "channel", required = false)
    public static void channel$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.yaksonn.dazntutorial.network.models.NewsModel.Channel getChannel() {
        return null;
    }
    
    public final void setChannel(@org.jetbrains.annotations.NotNull()
    com.yaksonn.dazntutorial.network.models.NewsModel.Channel p0) {
    }
    
    @org.simpleframework.xml.Attribute(name = "version", required = false)
    public static void version$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getVersion() {
        return null;
    }
    
    public final void setVersion(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public NewsModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR$\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR$\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u0002\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR$\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR$\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\t\u00a8\u0006%"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/NewsModel$Item;", "", "()V", "category", "", "category$annotations", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "description", "description$annotations", "getDescription", "setDescription", "enclosure", "Lcom/yaksonn/dazntutorial/network/models/NewsModel$Enclosure;", "enclosure$annotations", "getEnclosure", "()Lcom/yaksonn/dazntutorial/network/models/NewsModel$Enclosure;", "setEnclosure", "(Lcom/yaksonn/dazntutorial/network/models/NewsModel$Enclosure;)V", "guid", "guid$annotations", "getGuid", "setGuid", "link", "link$annotations", "getLink", "setLink", "pubDate", "pubDate$annotations", "getPubDate", "setPubDate", "title", "title$annotations", "getTitle", "setTitle", "app_debug"})
    public static final class Item {
        @org.jetbrains.annotations.NotNull()
        public com.yaksonn.dazntutorial.network.models.NewsModel.Enclosure enclosure;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String link;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String guid;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String description;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String title;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String category;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String pubDate;
        
        @org.simpleframework.xml.Element(name = "enclosure", required = false)
        public static void enclosure$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.yaksonn.dazntutorial.network.models.NewsModel.Enclosure getEnclosure() {
            return null;
        }
        
        public final void setEnclosure(@org.jetbrains.annotations.NotNull()
        com.yaksonn.dazntutorial.network.models.NewsModel.Enclosure p0) {
        }
        
        @org.simpleframework.xml.Element(name = "link", required = false)
        public static void link$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLink() {
            return null;
        }
        
        public final void setLink(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "guid", required = false)
        public static void guid$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGuid() {
            return null;
        }
        
        public final void setGuid(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "description", required = false)
        public static void description$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "title", required = false)
        public static void title$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "category", required = false)
        public static void category$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCategory() {
            return null;
        }
        
        public final void setCategory(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "pubDate", required = false)
        public static void pubDate$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPubDate() {
            return null;
        }
        
        public final void setPubDate(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public Item() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R(\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/NewsModel$Enclosure;", "", "()V", "length", "", "length$annotations", "getLength", "()Ljava/lang/Integer;", "setLength", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "type", "", "type$annotations", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "url", "url$annotations", "getUrl", "setUrl", "app_debug"})
    public static final class Enclosure {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Integer length;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String type;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String url;
        
        @org.simpleframework.xml.Attribute(name = "length", required = false)
        public static void length$annotations() {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getLength() {
            return null;
        }
        
        public final void setLength(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "type", required = false)
        public static void type$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getType() {
            return null;
        }
        
        public final void setType(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Attribute(name = "url", required = false)
        public static void url$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public final void setUrl(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public Enclosure() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR$\u0010\u0016\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R$\u0010\u001a\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R$\u0010\u001e\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\u0010R$\u0010\"\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010\u00a8\u0006&"}, d2 = {"Lcom/yaksonn/dazntutorial/network/models/NewsModel$Channel;", "", "()V", "category", "", "", "category$annotations", "getCategory", "()Ljava/util/List;", "setCategory", "(Ljava/util/List;)V", "description", "description$annotations", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "item", "Lcom/yaksonn/dazntutorial/network/models/NewsModel$Item;", "item$annotations", "getItem", "setItem", "language", "language$annotations", "getLanguage", "setLanguage", "link", "link$annotations", "getLink", "setLink", "pubDate", "pubDate$annotations", "getPubDate", "setPubDate", "title", "title$annotations", "getTitle", "setTitle", "app_debug"})
    public static final class Channel {
        @org.jetbrains.annotations.NotNull()
        public java.util.List<com.yaksonn.dazntutorial.network.models.NewsModel.Item> item;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String link;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String description;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String language;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String title;
        @org.jetbrains.annotations.NotNull()
        public java.util.List<java.lang.String> category;
        @org.jetbrains.annotations.NotNull()
        public java.lang.String pubDate;
        
        @org.simpleframework.xml.ElementList(name = "item", required = false, entry = "item", inline = true)
        public static void item$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.yaksonn.dazntutorial.network.models.NewsModel.Item> getItem() {
            return null;
        }
        
        public final void setItem(@org.jetbrains.annotations.NotNull()
        java.util.List<com.yaksonn.dazntutorial.network.models.NewsModel.Item> p0) {
        }
        
        @org.simpleframework.xml.Element(name = "link", required = false)
        public static void link$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLink() {
            return null;
        }
        
        public final void setLink(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "description", required = false)
        public static void description$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "language", required = false)
        public static void language$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLanguage() {
            return null;
        }
        
        public final void setLanguage(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.Element(name = "title", required = false)
        public static void title$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final void setTitle(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.simpleframework.xml.ElementList(name = "category", required = false, entry = "category", inline = true)
        public static void category$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getCategory() {
            return null;
        }
        
        public final void setCategory(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> p0) {
        }
        
        @org.simpleframework.xml.Element(name = "pubDate", required = false)
        public static void pubDate$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPubDate() {
            return null;
        }
        
        public final void setPubDate(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public Channel() {
            super();
        }
    }
}