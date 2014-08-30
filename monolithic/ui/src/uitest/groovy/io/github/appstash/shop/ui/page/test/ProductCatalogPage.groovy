package io.github.appstash.shop.ui.page.test

import geb.Page

class ProductCatalogPage extends Page {
    static at = { title == "Shop" }
    static content = {
        results(wait: true) { $("div.thumbnail") }
        result { i -> results[i] }
        resultLink { i -> result(i).find("a")[0] }
        detailPageLink { resultLink(0) }
    }
}