package com.yaksonn.dazntutorial.network.models

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "rss")
class NewsModel {

    @Element(name = "channel", required = false)
    lateinit var channel: Channel

    @Attribute(name = "version", required = false)
    var version: Double? = null

    class Item {

        @Element(name = "enclosure", required = false)
        lateinit var enclosure: Enclosure

        @Element(name = "link", required = false)
        lateinit var link: String

        @Element(name = "guid", required = false)
        lateinit var guid: String

        @Element(name = "description", required = false)
        lateinit var description: String

        @Element(name = "title", required = false)
        lateinit var title: String

        @Element(name = "category", required = false)
        lateinit var category: String

        @Element(name = "pubDate", required = false)
        lateinit var pubDate: String

    }

    class Enclosure {

        @Attribute(name = "length", required = false)
        var length: Int? = null

        @Attribute(name = "type", required = false)
        lateinit var type: String

        @Attribute(name = "url", required = false)
        lateinit var url: String

    }

    class Channel {

        @ElementList(name = "item", required = false, entry = "item", inline = true)
        lateinit var item: List<Item>

        @Element(name = "link", required = false)
        lateinit var link: String

        @Element(name = "description", required = false)
        lateinit var description: String

        @Element(name = "language", required = false)
        lateinit var language: String

        @Element(name = "title", required = false)
        lateinit var title: String

        @ElementList(name = "category", required = false, entry = "category", inline = true)
        lateinit var category: List<String>

        @Element(name = "pubDate", required = false)
        lateinit var pubDate: String

    }

}